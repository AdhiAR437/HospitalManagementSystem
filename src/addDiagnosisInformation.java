import Project.ConnectionProvider;
import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
//import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
//import net.proteanit.sql.DbUtils;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAMOD
 */
public class addDiagnosisInformation extends javax.swing.JFrame {

    public int flag=0;
    /**
     * Creates new form addDiagnosisInformation
     */
    public addDiagnosisInformation() {
        initComponents();
        
        //Thsi is to Hide the Label when the form is loaded initially
         jLabel2.setVisible(false);
         jLabel7.setVisible(false);
         jComboBox1.setVisible(false);
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1360, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PatientID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 31));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, 31));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 133, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 806, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Warning!!! PatientID Does Not Exist !!!");
        jLabel2.setIconTextGap(6);
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 520, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Symptom's");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Diagnosis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("medicines");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 190, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 190, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ward Required ?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Type of Ward");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 151, -1));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setText("Yes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCheckBox1KeyTyped(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 104, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single ", "Duo", " " }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.jpg"))); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 111, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close-GOOGLE.jpg"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 680, 129, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
        if(jCheckBox1.isSelected())
        {
            jLabel7.setVisible(true);
            jComboBox1.setVisible(true);
        }
        else
        {
            jLabel7.setVisible(false);
            jComboBox1.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String patientID=jTextField1.getText();
        
        try
        {
            
            Connection con = ConnectionProvider.getCon();
                // System.out.print("a");
            Statement st = con.createStatement();
                // System.out.print("c");
            ResultSet rs=st.executeQuery("SELECT * FROM project.patient where patientID ='"+patientID+"'");
            // rs.next();
            //System.out.print("d");
            //  System.out.print(rs.first());
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                   
                   
                   
        /*
            Connection con=ConnectionProvider.getCon();
            System.out.println("A");
                 
             con.setAutoCommit(false);
             System.out.println("B");
            
             
             String sql = "SELECT * FROM project.patient";
             PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             
            Statement st=con.createStatement();
            System.out.println("C");
           
            ResultSet rs=st.executeQuery("SELECT * FROM project.patient where patientID ='"+patientID+"'");
            System.out.println("D");
            
            //con.commit();
            System.out.println("E");
            
        */
            
             
            if(!rs.isAfterLast())     // isAfterLast() method is V.V Important l; 
            {
                 getToolkit().beep();
                 jLabel2.setVisible(true);
                
            }
            else
            {
                jLabel2.setVisible(false);
                jTextField1.setEditable(false);
                flag=1;
            }
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,"Error !!!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(flag==1)
        {
            String patientID=jTextField1.getText();
            String symptom=jTextField2.getText();
            String diagnosis=jTextField3.getText();
            String medicines=jTextField4.getText();
            String wardReq;
            String typeWard;
            
            if(jCheckBox1.isSelected())
            {
                wardReq="YES";
                typeWard=(String)jComboBox1.getSelectedItem();
            }
            else
            {
                wardReq="NO";
                typeWard="";
            }
            
            try
            {
                Connection con=ConnectionProvider.getCon();
                System.out.println("A");
                
                   con.setAutoCommit(false);//IMPORTANT 1
                   System.out.println("B");
                   
                Statement st = con.createStatement();
                System.out.println("C");
                
                st.executeUpdate("INSERT INTO project.patientreport values('"+patientID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+typeWard+"')"); JOptionPane.showMessageDialog(null,"Successfully Updated");
                System.out.println("D");
                
                 con.commit();
                 System.out.println("E");
                
                setVisible(false);
                System.out.println("F");
                
                new addDiagnosisInformation().setVisible(true);
                System.out.println("G");
                
            }
            catch(Exception e)
            {
                 getToolkit().beep();
                JOptionPane.showMessageDialog(this,e,"Select",2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PatientID Field is empty" );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

       

if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{

      String patientID=jTextField1.getText();
        
        try
        {
            
            Connection con = ConnectionProvider.getCon();
                // System.out.print("a");
            Statement st = con.createStatement();
                // System.out.print("c");
            ResultSet rs=st.executeQuery("SELECT * FROM project.patient where patientID ='"+patientID+"'");
            // rs.next();
            //System.out.print("d");
            //  System.out.print(rs.first());
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           
                   
                   
                   
        /*
            Connection con=ConnectionProvider.getCon();
            System.out.println("A");
                 
             con.setAutoCommit(false);
             System.out.println("B");
            
             
             String sql = "SELECT * FROM project.patient";
             PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             
            Statement st=con.createStatement();
            System.out.println("C");
           
            ResultSet rs=st.executeQuery("SELECT * FROM project.patient where patientID ='"+patientID+"'");
            System.out.println("D");
            
            //con.commit();
            System.out.println("E");
            
        */
            
             
            if(!rs.isAfterLast())     // isAfterLast() method is V.V Important l; 
            {
                 getToolkit().beep(); //IMPORTANT---------------------------------------------------------
                 jLabel2.setVisible(true);
                
            }
            else
            {
                jLabel2.setVisible(false);
                jTextField1.setEditable(false);
                flag=1;
            }
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(null,"Error !!!!!");
        }   
}
       int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jTable2.requestFocus();
        }
        
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
         int key = evt.getKeyCode();
        if(key==10)             
        {
            jTable2.requestFocus();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        
        
         int key = evt.getKeyCode();
        if(key==10)             
        {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
      
        
        
         int key = evt.getKeyCode();
        if(key==10)             
        {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        
        
         int key = evt.getKeyCode();
        if(key==10)              
        {
            jCheckBox1.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jCheckBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyPressed
        
        
         int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jCheckBox1KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        
        
         int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jButton2.requestFocus();
        }
     
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
      
        
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
{
           if(flag==1)
        {
            String patientID=jTextField1.getText();
            String symptom=jTextField2.getText();
            String diagnosis=jTextField3.getText();
            String medicines=jTextField4.getText();
            String wardReq;
            String typeWard;
            
            if(jCheckBox1.isSelected())
            {
                wardReq="YES";
                typeWard=(String)jComboBox1.getSelectedItem();
            }
            else
            {
                wardReq="NO";
                typeWard="";
            }
            
            try
            {
                Connection con=ConnectionProvider.getCon();
                System.out.println("A");
                
                   con.setAutoCommit(false);//IMPORTANT 1
                   System.out.println("B");
                   
                Statement st = con.createStatement();
                System.out.println("C");
                
                st.executeUpdate("INSERT INTO project.patientreport values('"+patientID+"','"+symptom+"','"+diagnosis+"','"+medicines+"','"+wardReq+"','"+typeWard+"')"); JOptionPane.showMessageDialog(null,"Successfully Updated");
                System.out.println("D");
                
                 con.commit();
                 System.out.println("E");
                
                setVisible(false);
                System.out.println("F");
                
                new addDiagnosisInformation().setVisible(true);
                System.out.println("G");
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PatientID Field is empty" );
        }
}
        
        
    }//GEN-LAST:event_jButton2KeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        
        int key = evt.getKeyCode();
        if(key==10)              
        {
            jTextField2.requestFocus();
        }
         
    }//GEN-LAST:event_jTable2KeyPressed

    private void jCheckBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyTyped
       
        int key = evt.getKeyCode();
        if(key==10)              
        {
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jCheckBox1KeyTyped

    private void jTable2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyTyped
       
        
        int key = evt.getKeyCode();
        if(key==10)             
        {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTable2KeyTyped

    private void jTable2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyReleased
       
        int key = evt.getKeyCode();
        if(key==10)             
        {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTable2KeyReleased

    private void jCheckBox1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox1KeyReleased
        int key = evt.getKeyCode();
        if(key==10)              
        {
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jCheckBox1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        
          int key = evt.getKeyCode();
        if(key==10)              
        {
            jTextField1.requestFocus();
        }
        
        
    }//GEN-LAST:event_jLabel2KeyPressed

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
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDiagnosisInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
