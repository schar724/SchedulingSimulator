package Algorithms;

import Components.CurrentProcess;
import Components.Process;
import java.util.ArrayList;

public class FCFS extends Algorithm {

    public FCFS(ArrayList<Process> processList) {
        super(processList);
    }
    
    @Override
    public CurrentProcess nextMove(int currentTime) {
        Process runningProcess = null;

        addArrivedToWaitingQueue(currentTime);
        
        boolean endOfAlgorithm = waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean waiting = !waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean notEmpty = !readyQueue.isEmpty();
        
        
        if(endOfAlgorithm)
        {
        	endOfProcess(runningProcess, currentProcess);
        }
        else if(waiting)
        {
        	waitingForProcess(runningProcess, currentProcess);
        }
        else if(notEmpty)
        {
            runningProcess = readyQueue.get(0);
            
            startRunningProcess(runningProcess, currentTime);
            
            boolean timeRemaining = runningProcess.remainingTime > 0;
            boolean outOfTime = runningProcess.remainingTime == 0;
            
            if(timeRemaining)
            {
                System.out.println(runningProcess.getprocessNum());
                readyQueue.set(0, runningProcess);
            }
            else if (outOfTime) 
            {
            	replaceProcess(runningProcess, currentProcess, currentTime);
            }
                
            setProcess(runningProcess, currentProcess);    
        }
        return currentProcess;
    }
    
}
