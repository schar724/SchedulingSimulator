

import java.util.ArrayList;

/**
 *
 * @author Scott Charles & Daniel Bahrami
 */
public class CurrentProcess {
    
    public ArrayList<Process> tableData = new ArrayList<Process>();
    public Process CurrentProcess;

    //Returns Table Data
    public ArrayList<Process> getTableData() {
        return tableData;
    }
    
    public void setTableData(ArrayList<Process> tableData) {
        this.tableData = tableData;
    }

    public void setCurrentProcess(Process CurrentProcess) {
        this.CurrentProcess = CurrentProcess;
    }
    
    //Returns the currently running process
    public Process getCurrentProcess() {
        return CurrentProcess;
    }


    
    
    
}
