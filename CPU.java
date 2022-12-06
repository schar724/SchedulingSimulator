/**
 * CPU class represents the scheduling component of a CPU.
 * 
 * @authors Scott Charles & Daniel Bahrami
 */

import java.util.ArrayList;

public class CPU {
    
	public static int quantum;
    private static Algorithm algorithm;
    public static ArrayList<Process> processList;

    public static void setprocessList(ArrayList<Process> processList){
        CPU.processList = processList;
    }

    public static ArrayList<Process> getprocessList(){
        return CPU.processList;
    }
    
    public static void setQuantum(int quantum){
        CPU.quantum = quantum;
    }

    public static int getQuantum() {
        return quantum;
    }
    
    public static CurrentProcess nextMove(int currentTime){
        CurrentProcess CurrentProcess = algorithm.nextMove(currentTime);
        return CurrentProcess;
    }
    
    //Which Algorithm was picked
    public static void setAlgorithm(String algorithm){
    	if(algorithm == "First Come First Served") {
    		CPU.algorithm = new FCFS(processList);
    	}
    	else if(algorithm == "Shortest Job First") {
    		CPU.algorithm = new SJF(processList);
    	} 
    	else if(algorithm == "Shortest Remaining Time First") {
    		CPU.algorithm = new SRTF(processList);
    	}else {
    		CPU.algorithm = new RR(processList);
    	}
    }
}
