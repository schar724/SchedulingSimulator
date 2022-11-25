package Main;

import javax.swing.JButton;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Scott Charles & Daniel Bahrami
 */
public class Animator extends Thread {

    JButton btn;
    public boolean allprocesssDone = false;
    
    public Animator() {
    }

    public Animator(JButton btn) {
        this.btn = btn;
    }

    public void setAllprocesssDone(boolean allprocesssDone) {
        this.allprocesssDone = allprocesssDone;
    }
    
    

    @Override
    public void run(){
        try {

            while (!allprocesssDone) {
                btn.doClick();
                Thread.sleep(500);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Animator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
