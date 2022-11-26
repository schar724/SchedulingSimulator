

import java.util.ArrayList;



/**
 *
 * @authors Scott Charles & Daniel Bahrami
 */
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
    	if(algorithm == "FCFS") {
    		//First Come First Serve
    		CPU.algorithm = new FCFS(processList);
    	}
    	else if(algorithm == "SJF") {
    		//Shortest process First
    		CPU.algorithm = new SJF(processList);
    	} 
    	else if(algorithm == "SRTF") {
    		//Shortest Remaining Time First
    		CPU.algorithm = new SRTF(processList);
    	}else {
    		//Round Robin
    		CPU.algorithm = new RR(processList);
    	}
    }
}
