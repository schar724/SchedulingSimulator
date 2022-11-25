package Components;

import java.util.ArrayList;

/**
 *
 * @author Scott Charles & Daniel Bahrami
 */
public class CurrentProcess {
    
    public ArrayList<process> tableData = new ArrayList<process>();
    public process CurrentProcess;

    //Returns Table Data
    public ArrayList<process> getTableData() {
        return tableData;
    }
    
    public void setTableData(ArrayList<process> tableData) {
        this.tableData = tableData;
    }

    public void setCurrentProcess(process CurrentProcess) {
        this.CurrentProcess = CurrentProcess;
    }
    
    //Returns the currently running process
    public process getCurrentProcess() {
        return CurrentProcess;
    }


    
    
    
}
