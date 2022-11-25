package Algorithms;

import Components.CurrentProcess;
import Components.process;
import static Components.process.arrivalTimeComparator;
import static Components.process.burstTimeComparator;
import static Components.process.remainingTimeComparator;
import java.util.ArrayList;
import java.util.Collections;


public abstract class Algorithm {
    ArrayList<process> processList;
    ArrayList<process> waitingQueue;
    ArrayList<process> currentProcessData;
    ArrayList<process> readyQueue = new ArrayList<process>();
    process currentprocess;
    CurrentProcess currentProcess = new CurrentProcess();
    
    
    public Algorithm(ArrayList<process> processList){
        currentProcess.setTableData(arrayListCopy(processList));
        this.processList = sortByArrivalTime(arrayListCopy(processList));
        this.waitingQueue = arrayListCopy(this.processList);
    }
    
    public abstract CurrentProcess nextMove (int currentTime);

    
    public void addArrivedToWaitingQueue(int currentTime)
    {
    	boolean notEmpty = waitingQueue.isEmpty() == false;
        if (notEmpty) 
        {
            waitingQueue.forEach((process) -> {
                if (process.arrivalTime == currentTime) {
                    readyQueue.add(process.getCopy());
                    System.out.println("current time "+ currentTime);
                    System.out.println(process.getprocessNum()+" arrived");
                }
                
            });
            readyQueue.forEach((process) -> {
                waitingQueue.remove(process);
            });
        }
    }
    
    //Sorts the list of processes by varying metrics such as arrival time, burst time and remaining time
    public ArrayList<process> sortByArrivalTime(ArrayList<process> list){
        ArrayList<process> processs = list;
        
        Collections.sort(processs, arrivalTimeComparator);
        
        return processs;
    }
    
    public ArrayList<process> sortByBurstTime(ArrayList<process> list){
        ArrayList<process> processs = list;
        
        Collections.sort(processs, burstTimeComparator);
        
        return processs;
    }
    
    public ArrayList<process> sortByremainingTime(ArrayList<process> list){
        ArrayList<process> processs = list;
        
        Collections.sort(processs, remainingTimeComparator);
        
        return processs;
    }
    
    //Makes a copy of the arraylist
    public ArrayList<process> arrayListCopy(ArrayList<process> list){
        ArrayList<process> copy = new ArrayList<>();
        
       for(int i = 0; i < list.size(); i++) {
    	   copy.add(list.get(i));
       }
        
        return copy;
    }
    
  //Create a process with a number of 0, indicating end
    public void endOfProcess(process runningProcess, CurrentProcess currentProcess) {
        runningProcess = new process(0, 0, 0);
        currentProcess.setCurrentProcess(runningProcess);
    }

  //Create a process with a number of 11, indicating that some processes haven't arrived yet
    public void waitingForProcess(process runningProcess, CurrentProcess currentProcess) {
        runningProcess = new process(11, 0, 0);
        currentProcess.setCurrentProcess(runningProcess);
    }

    public void replaceProcess(process runningProcess, CurrentProcess currentProcess, int currentTime) {
        System.out.println("removed "+ runningProcess.getprocessNum());
        readyQueue.remove(runningProcess);
        runningProcess.settimeFinished(currentTime+1);
        runningProcess.setWaitTime();
        runningProcess.setTurnAroundTime();
        currentProcess.tableData.set(runningProcess.getprocessNum()-1, runningProcess);
    }
    
    public void startRunningProcess(process runningProcess ,int currentTime) {
        if (!runningProcess.isStarted()) {
            runningProcess.setStartTime(currentTime);
            runningProcess.setStarted(true);
        }
        runningProcess.setRemainingTime(runningProcess.remainingTime - 1);
    }
    
    public void setProcess(process runningProcess, CurrentProcess currentProcess) {
        currentProcess.setCurrentProcess(runningProcess);
        currentProcess.tableData.set(runningProcess.getprocessNum()-1, runningProcess);
    }
    
    public void incWaitTime(process runningProcess) {
        readyQueue.remove(runningProcess);
        
        readyQueue.forEach((process) ->{
            process.incrementWaitTime();
        });
    }
    
    public void replacedProcessWaitTimeNotSet(process runningProcess, CurrentProcess currentProcess, int currentTime) {
        readyQueue.remove(runningProcess);
        runningProcess.settimeFinished(currentTime + 1);
        runningProcess.setTurnAroundTime();
        currentProcess.tableData.set(runningProcess.getprocessNum() - 1, runningProcess);
    }
    
}
