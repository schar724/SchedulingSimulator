
/**
 * Round Robin Algorithm
 * 
 * @author Scott Charles & Daniel Bahrami
 */

import java.util.ArrayList;

public class RR extends Algorithm {

    private int iterations = 0;

    public RR(ArrayList<Process> processList) {
        super(processList);
    }

    @Override
    public CurrentProcess nextMove(int currentTime) {
        Process runningProcess = null;

        addArrivedToWaitingQueue(currentTime);

        boolean endOfAlgorithm = waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean waiting = !waitingQueue.isEmpty() && readyQueue.isEmpty();
        boolean notEmpty = !readyQueue.isEmpty();

        if (endOfAlgorithm) {
            endOfProcess(runningProcess, currentProcess);
            iterations = 0;
        } else if (waiting) {
            waitingForProcess(runningProcess, currentProcess);
            iterations = 0;
        } else if (notEmpty) {

            runningProcess = readyQueue.get(0);
            iterations++;
            incWaitTime(runningProcess);

            startRunningProcess(runningProcess, currentTime);

            boolean timeRemaining = runningProcess.remainingTime > 0;
            boolean outOfTime = runningProcess.remainingTime == 0;

            if (timeRemaining && iterations < CPU.getQuantum()) {

                addArrivedToWaitingQueue(currentTime);
                readyQueue.add(0, runningProcess);

            } else if (timeRemaining && iterations >= CPU.getQuantum()) {
                addArrivedToWaitingQueue(currentTime + 1);
                readyQueue.add(runningProcess);
                iterations = 0;

            } else if (outOfTime) {
                replacedProcessWaitTimeNotSet(runningProcess, currentProcess, currentTime);
                iterations = 0;
            }

            setProcess(runningProcess, currentProcess);
        }

        return currentProcess;
    }
}
