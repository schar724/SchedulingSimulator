
/**
 *
 * Represents a process in the operating system
 * 
 * @author Scott Charles & Daniel Bahrami
 */

import java.util.Comparator;

public class Process {
    
    public int processNum;
    public int arrivalTime;
    public int burstTime;
    
    public int startTime;
    public int waitTime;
    public boolean finished;
    public boolean started;
    public int turnAroundTime;
    public int remainingTime;
    public int timeFinished;

    public Process(int processNum, int arrivalTime, int burstTime){
        this.processNum = processNum;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        
        this.startTime = 0;
        this.timeFinished = 0;
        this.finished = false;
        this.started = false;
        this.remainingTime = burstTime;
        this.waitTime = 0;
        this.turnAroundTime = 0;
    }

    public void setWaitTime() {
        this.waitTime = startTime - arrivalTime;
    }
    
    public void incrementWaitTime(){
        this.waitTime = this.waitTime + 1;
    }
    
    
    public void setprocessNum(int processNum) {
        this.processNum = processNum;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void settimeFinished(int timeFinished) {
        this.timeFinished = timeFinished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void setTurnAroundTime() {
        this.turnAroundTime = waitTime + burstTime;
    }
    
    public void setStarted(boolean started) {
        this.started = started;
    }

    public int getprocessNum() {
        return processNum;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getStartTime() {
        return startTime;
    }
    
    public int getWaitTime() {
        return waitTime;
    }

    public int gettimeFinished() {
        return timeFinished;
    }

    public boolean isFinished() {
        return finished;
    }
    
    
    public boolean isStarted() {
        return started;
    }
    
    public int getRemainingTime() {
        return remainingTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }
    
    public Process getCopy(){
        Process copy = new Process(this.processNum, this.arrivalTime, this.burstTime);
        return copy;
    }

    public String toString(){
        return "Process Number: " + processNum + " Arrival Time: " + arrivalTime + " Burst Time: " + burstTime;
    }
     
    public static Comparator<Process> arrivalTimeComparator = new Comparator<Process>() {

	public int compare(Process p1, Process p2) {
	   int arrivalTime1 = p1.getArrivalTime();
	   int arrivalTime2 = p2.getArrivalTime();

	   return arrivalTime1 - arrivalTime2;
    }};
    
    public static Comparator<Process> burstTimeComparator = new Comparator<Process>() {

	public int compare(Process p1, Process p2) {
	   int burstTime1 = p1.getBurstTime();
	   int burstTime2 = p2.getBurstTime();
           
	 //Sort in Ascending Order
      return burstTime1 - burstTime2;
    }};
    
    public static Comparator<Process> remainingTimeComparator = new Comparator<Process>() {

	public int compare(Process p1, Process p2) {
	   int remainingTime1 = p1.getRemainingTime();
	   int remainingTime2 = p2.getRemainingTime();
           
	 //Sort in Ascending Order
     return remainingTime1 - remainingTime2;
    }};


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Process other = (Process) obj;
        if (this.processNum != other.processNum) {
            return false;
        }
        return true;
    }

}
