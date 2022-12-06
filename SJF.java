
/**
 * Shortest Job First Algorithm
 * 
 * @author Scott Charles & Daniel Bahrami
 */

import java.util.ArrayList;

public class SJF extends Algorithm {

    boolean newprocess = true;

    public SJF(ArrayList<Process> processList) {
        super(processList);
    }

    @Override
    public CurrentProcess nextMove(int currentTime) {
        Process runningProcess = null;

        addArrivedToWaitingQueue(currentTime);

        //If a new process has arrived, sort the ready queue by burst times to see the new order.
        if (newprocess == true) {
            sortByBurstTime(readyQueue);
        }
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
        else if (notEmpty) {

            runningProcess = readyQueue.get(0);
            newprocess = false;

            startRunningProcess(runningProcess , currentTime);
            
            
            boolean timeRemaining = runningProcess.remainingTime > 0;
            boolean outOfTime = runningProcess.remainingTime == 0;

            if (timeRemaining) 
            {
                readyQueue.set(0, runningProcess);
                currentProcess.tableData.set(runningProcess.getprocessNum() - 1, runningProcess);

            } 
            else if (outOfTime) 
            {
            	replaceProcess(runningProcess, currentProcess, currentTime);
                newprocess = true;
            }

            setProcess(runningProcess, currentProcess);    
        }

        return currentProcess;
    }
}
