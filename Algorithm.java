/*
 * Abstract algorithm class
 */

import java.util.ArrayList;
import java.util.Collections;


public abstract class Algorithm {
    ArrayList<Process> processList;
    ArrayList<Process> waitingQueue;
    ArrayList<Process> currentProcessData;
    ArrayList<Process> readyQueue = new ArrayList<Process>();
    Process currentprocess;
    CurrentProcess currentProcess = new CurrentProcess();
    
    
    public Algorithm(ArrayList<Process> processList){
        this.processList = processList;
        this.waitingQueue = new ArrayList<Process>(arrayListCopy(this.processList));
        currentProcess.setTableData(arrayListCopy(processList));
        this.processList = sortByArrivalTime(arrayListCopy(processList));
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
    public ArrayList<Process> sortByArrivalTime(ArrayList<Process> list){
        ArrayList<Process> processs = list;
        
        Collections.sort(processs, Process.arrivalTimeComparator);
        
        return processs;
    }
    
    public ArrayList<Process> sortByBurstTime(ArrayList<Process> list){
        ArrayList<Process> processs = list;
        
        Collections.sort(processs, Process.burstTimeComparator);
        
        return processs;
    }
    
    public ArrayList<Process> sortByremainingTime(ArrayList<Process> list){
        ArrayList<Process> processs = list;
        
        Collections.sort(processs, Process.remainingTimeComparator);
        
        return processs;
    }
    
    //Makes a copy of the arraylist
    public ArrayList<Process> arrayListCopy(ArrayList<Process> list){
        ArrayList<Process> copy = new ArrayList<>();
        
       for(int i = 0; i < list.size(); i++) {
    	   copy.add(list.get(i));
       }
        
        return copy;
    }
    
  //Create a process with a number of 0, indicating end
    public void endOfProcess(Process runningProcess, CurrentProcess currentProcess) {
        runningProcess = new Process(0, 0, 0);
        currentProcess.setCurrentProcess(runningProcess);
    }

  //Create a process with a number of 11, indicating that some processes haven't arrived yet
    public void waitingForProcess(Process runningProcess, CurrentProcess currentProcess) {
        runningProcess = new Process(11, 0, 0);
        currentProcess.setCurrentProcess(runningProcess);
    }

    public void replaceProcess(Process runningProcess, CurrentProcess currentProcess, int currentTime) {
        System.out.println("removed "+ runningProcess.getprocessNum());
        readyQueue.remove(runningProcess);
        runningProcess.settimeFinished(currentTime+1);
        runningProcess.setWaitTime();
        runningProcess.setTurnAroundTime();
        currentProcess.tableData.set(runningProcess.getprocessNum()-1, runningProcess);
    }
    
    public void startRunningProcess(Process runningProcess ,int currentTime) {
        if (!runningProcess.isStarted()) {
            runningProcess.setStartTime(currentTime);
            runningProcess.setStarted(true);
        }
        runningProcess.setRemainingTime(runningProcess.remainingTime - 1);
    }
    
    public void setProcess(Process runningProcess, CurrentProcess currentProcess) {
        currentProcess.setCurrentProcess(runningProcess);
        currentProcess.tableData.set(runningProcess.getprocessNum()-1, runningProcess);
    }
    
    public void incWaitTime(Process runningProcess) {
        readyQueue.remove(runningProcess);
        
        readyQueue.forEach((process) ->{
            process.incrementWaitTime();
        });
    }
    
    public void replacedProcessWaitTimeNotSet(Process runningProcess, CurrentProcess currentProcess, int currentTime) {
        readyQueue.remove(runningProcess);
        runningProcess.settimeFinished(currentTime + 1);
        runningProcess.setTurnAroundTime();
        currentProcess.tableData.set(runningProcess.getprocessNum() - 1, runningProcess);
    }
}
