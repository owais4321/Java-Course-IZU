/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dell
 */
public class NewJFrame extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    
public void loadTable() {
    try {
        // Prepare and execute query
        pst = con.prepareStatement("SELECT * FROM student");
        ResultSet rs = pst.executeQuery();

        // Get table model and clear existing data
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        // Populate table row by row
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("stdname"),
                rs.getString("stdno"),
                rs.getString("dept")
            });
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

    public void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/myfirstdb", "root", "");
            if(con!=null){
            System.out.print("Connection Successful");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        connect();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("SIMPLE CRUD APP");

        jLabel2.setText("STUDENT NUMBER");

        jLabel3.setText("STUDENT NAME");

        jLabel4.setText("DEPARTMENT");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOFTWARE ENGINEERING", "INDUSTRIAL ENGINEERING", "MATHEMATICS", "PHYSICS", "LAW" }));

        b1.setText("ADD");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("UPDATE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("DELETE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", " S. NO", "DEPT"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(35, 35, 35))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(23, 23, 23)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(b3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)
                            .addComponent(b3)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
                
                String stdname = t1.getText();
                String stdno = t2.getText();
                String dept = (String) c1.getSelectedItem();
                try {
                    pst = con.prepareStatement("INSERT INTO student(stdname, stdno, dept) VALUES(?, ?, ?)");
                    pst.setString(1, stdname);
                    pst.setString(2, stdno);
                    pst.setString(3, dept);
                    pst.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Record Added!");
                    loadTable();  // Refresh the table to show new data

                    // Clear fields
                    t1.setText("");
                    t2.setText("");
                    c1.setSelectedIndex(0);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        String stdname = t1.getText();
    String stdno = t2.getText();
    String dept = (String) c1.getSelectedItem();

    try {
        // Check if the student exists
        pst = con.prepareStatement("SELECT * FROM student WHERE stdno = ?");
        pst.setString(1, stdno);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Student exists, perform update
            pst = con.prepareStatement("UPDATE student SET stdname = ?, dept = ? WHERE stdno = ?");
            pst.setString(1, stdname);
            pst.setString(2, dept);
            pst.setString(3, stdno);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Record Updated!");
            loadTable();  // Refresh table after update
        } else {
            // Show popup if student not found
            JOptionPane.showMessageDialog(null, "Student not found!");
        }

        // Clear fields after update
        t1.setText("");
        t2.setText("");
        c1.setSelectedIndex(0);

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
            String stdno = t2.getText();  // Get student number from text field

    try {
        // Check if the student exists
        pst = con.prepareStatement("SELECT * FROM student WHERE stdno = ?");
        pst.setString(1, stdno);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Student exists, perform delete
            pst = con.prepareStatement("DELETE FROM student WHERE stdno = ?");
            pst.setString(1, stdno);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Record Deleted!");
            loadTable();  // Refresh table after delete
        } else {
            // Show popup if student not found
            JOptionPane.showMessageDialog(null, "Student not found!");
        }

        // Clear student number field after delete
        t2.setText("");

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables
}
