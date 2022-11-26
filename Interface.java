

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author scott
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form ScheudlingAlgorithmsUI
     */
    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Algorithms = new javax.swing.JPanel();
        fcfs_rb = new javax.swing.JRadioButton();
        sjf_rb = new javax.swing.JRadioButton();
        srt_rb = new javax.swing.JRadioButton();
        rr_rb = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        run = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        waitTime = new javax.swing.JLabel();
        turnAround = new javax.swing.JLabel();
        thrPut = new javax.swing.JLabel();
        avgWaitTime = new javax.swing.JLabel();
        avgTurnAroundTime = new javax.swing.JLabel();
        throughput = new javax.swing.JLabel();
        changeData = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        processData = new javax.swing.JTable();
        resetBtn = new javax.swing.JButton();

        buttonGroup1.add(fcfs_rb);
        buttonGroup1.add(sjf_rb);
        buttonGroup1.add(srt_rb);
        buttonGroup1.add(rr_rb);
        buttonGroup1.setSelected(fcfs_rb.getModel(), true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fcfs_rb.setText("First Come First Served");
        sjf_rb.setText("Shortest Job First");
        srt_rb.setText("Shortest Remaining Time");
        rr_rb.setText("Round Robin");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder((Integer)0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        run.setText("Run");
        run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                runMouseClicked(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder((Integer)0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1", null, null, null, null, null, null, null},
                {"P2", null, null, null, null, null, null, null},
                {"P3", null, null, null, null, null, null, null},
                {"P4", null, null, null, null, null, null, null},
                {"P5", null, null, null, null, null, null, null},
                {"P6", null, null, null, null, null, null, null},
                {"P7", null, null, null, null, null, null, null},
                {"P8", null, null, null, null, null, null, null}
            },
            new String [] {
                "Process", "Arrive Time", "CPU Burst", "Start Time", "Wating Time", "Remaining Time", "Finish Time", "Turn Around"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Quantum:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
      

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder((Integer)0));

        waitTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        waitTime.setText("Average Wait Time: ");

        turnAround.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        turnAround.setText("Avergae Turn Around Time: ");

        thrPut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        thrPut.setText("Throughput: ");

        avgWaitTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        avgTurnAroundTime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        throughput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(waitTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avgWaitTime))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thrPut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(throughput))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(turnAround)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(avgTurnAroundTime)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waitTime)
                    .addComponent(avgWaitTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnAround)
                    .addComponent(avgTurnAroundTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thrPut)
                    .addComponent(throughput))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AlgorithmsLayout = new javax.swing.GroupLayout(Algorithms);
        Algorithms.setLayout(AlgorithmsLayout);
        AlgorithmsLayout.setHorizontalGroup(
            AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(AlgorithmsLayout.createSequentialGroup()
                .addGroup(AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlgorithmsLayout.createSequentialGroup()
                        .addComponent(fcfs_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sjf_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srt_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rr_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(run))
                    .addGroup(AlgorithmsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(AlgorithmsLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        AlgorithmsLayout.setVerticalGroup(
            AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlgorithmsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcfs_rb)
                    .addComponent(sjf_rb)
                    .addComponent(srt_rb)
                    .addComponent(rr_rb)
                    .addComponent(run)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlgorithmsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Algortihms", Algorithms);

        processData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P1", "0", "10"},
                {"P2", "0", "10"},
                {"P3", "0", "10"},
                {"P4", "0", "10"},
                {"P5", "0", "10"},
                {"P6", "0", "10"},
                {"P7", "0", "10"},
                {"P8", "0", "10"}
            },
            new String [] {
                "Process", "Arrive Time", "CPU Burst Length"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        processData.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(processData);
        if (processData.getColumnModel().getColumnCount() > 0) {
            processData.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        resetBtn.setText("Reset");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout changeDataLayout = new javax.swing.GroupLayout(changeData);
        changeData.setLayout(changeDataLayout);
        changeDataLayout.setHorizontalGroup(
            changeDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
            .addGroup(changeDataLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(resetBtn))
        );
        changeDataLayout.setVerticalGroup(
            changeDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(resetBtn))
        );

        jTabbedPane1.addTab("Change Data", changeData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                                                 

    private void runMouseClicked(java.awt.event.MouseEvent evt) {                                 
                for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                            selectedAlgorithm = button.getText();
                    }
                }

                quantum = Integer.parseInt(jComboBox1.getSelectedItem().toString());

                Process p1 = new Process(1, Integer.parseInt(processData.getValueAt(0, 1).toString()), Integer.parseInt(processData.getValueAt(0, 2).toString()));
                Process p2 = new Process(2, Integer.parseInt(processData.getValueAt(1, 1).toString()), Integer.parseInt(processData.getValueAt(1, 2).toString()));
                Process p3 = new Process(3, Integer.parseInt(processData.getValueAt(2, 1).toString()), Integer.parseInt(processData.getValueAt(2, 2).toString()));
                Process p4 = new Process(4, Integer.parseInt(processData.getValueAt(3, 1).toString()), Integer.parseInt(processData.getValueAt(3, 2).toString()));
                Process p5 = new Process(5, Integer.parseInt(processData.getValueAt(4, 1).toString()), Integer.parseInt(processData.getValueAt(4, 2).toString()));
                Process p6 = new Process(6, Integer.parseInt(processData.getValueAt(5, 1).toString()), Integer.parseInt(processData.getValueAt(5, 2).toString()));
                Process p7 = new Process(7, Integer.parseInt(processData.getValueAt(6, 1).toString()), Integer.parseInt(processData.getValueAt(6, 2).toString()));
                Process p8 = new Process(8, Integer.parseInt(processData.getValueAt(7, 1).toString()), Integer.parseInt(processData.getValueAt(7, 2).toString()));

                ArrayList<Process> processes = new ArrayList<Process>();

                processes.add(p1);
                processes.add(p2);
                processes.add(p3);
                processes.add(p4);
                processes.add(p5);
                processes.add(p6);
                processes.add(p7);
                processes.add(p8);

                CPU.setQuantum(quantum);
                CPU.setprocessList(processes);
                CPU.setAlgorithm(selectedAlgorithm);
                
                
                setTableData();

                

    }                
    
    private void setTableData(){

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (int i = 0; i < CPU.getprocessList().size(); i++) {
            model.addRow(new Object[]{CPU.getprocessList().get(i).getprocessNum(), CPU.getprocessList().get(i).getArrivalTime(), CPU.getprocessList().get(i).getBurstTime(), CPU.getprocessList().get(i).getWaitTime(), CPU.getprocessList().get(i).getTurnAroundTime()});
        }
    }

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {                                      
        for (int i = 0; i < processData.getRowCount(); i++) {
            for (int j = 1; j < processData.getColumnCount(); j++) {
                processData.setValueAt("0", i, j++);
                processData.setValueAt("10", i, j);
            }
        }
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Algorithms;
    private javax.swing.JLabel avgTurnAroundTime;
    private javax.swing.JLabel avgWaitTime;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel changeData;
    private javax.swing.JRadioButton fcfs_rb;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable processData;
    private javax.swing.JButton resetBtn;
    private javax.swing.JRadioButton rr_rb;
    private javax.swing.JButton run;
    private javax.swing.JRadioButton sjf_rb;
    private javax.swing.JRadioButton srt_rb;
    private javax.swing.JLabel thrPut;
    private javax.swing.JLabel throughput;
    private javax.swing.JLabel turnAround;
    private javax.swing.JLabel waitTime;
    private String selectedAlgorithm;
    private int quantum;
   
    // End of variables declaration                   
}
