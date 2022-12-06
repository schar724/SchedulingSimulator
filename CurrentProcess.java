
/**
 * Represents the currently scheudled process.
 * 
 * @author Scott Charles & Daniel Bahrami
 */

import java.util.ArrayList;

public class CurrentProcess {
    
    public ArrayList<Process> tableData = new ArrayList<Process>();
    public Process CurrentProcess;

    public ArrayList<Process> getTableData() {
        return tableData;
    }
    
    public void setTableData(ArrayList<Process> tableData) {
        this.tableData = tableData;
    }

    public void setCurrentProcess(Process CurrentProcess) {
        this.CurrentProcess = CurrentProcess;
    }
    
    public Process getCurrentProcess() {
        return CurrentProcess;
    }
}
