/**
 * Shortest Remaining Time First algorithm
 * 
 * @author Scott Charles & Daniel Bahrami
 */

import java.util.ArrayList;

public class SRTF extends Algorithm {

    public SRTF(ArrayList<Process> processList) {
        super(processList);
    }

    @Override
    public CurrentProcess nextMove(int currentTime) {
        Process runningProcess = null;
        addArrivedToWaitingQueue(currentTime);

        sortByremainingTime(readyQueue);

        boolean endOfAlgorithm = waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean waiting = !waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean notEmpty = !readyQueue.isEmpty();
        
        if (endOfAlgorithm) 
        {
        	endOfProcess(runningProcess, currentProcess);
        } 
        else if (waiting) 
        {
        	waitingForProcess(runningProcess, currentProcess);
        } 
        else if (notEmpty) 
        {

        	runningProcess = readyQueue.get(0);
        	incWaitTime(runningProcess);

            startRunningProcess(runningProcess, currentTime);
        
            boolean timeRemaining = runningProcess.remainingTime > 0;
            boolean outOfTime = runningProcess.remainingTime == 0;
            
            if (timeRemaining) 
            {
                readyQueue.add(runningProcess);
                sortByremainingTime(readyQueue);
                
            } 
            else if (outOfTime) 
            {
            	replacedProcessWaitTimeNotSet(runningProcess, currentProcess, currentTime);
                sortByremainingTime(readyQueue);
            }

            setProcess(runningProcess, currentProcess);    
        }

        sortByremainingTime(readyQueue);
        return currentProcess;
    }
}
