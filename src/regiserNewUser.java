import Project.ConnectionProvider;
import com.sun.glass.events.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRAMOD
 */
public class regiserNewUser extends javax.swing.JFrame {

    /**
     * Creates new form regiserNewUser
     */
    public regiserNewUser() {
        initComponents();
        
          new login().setVisible(true);
          jLabel9.setVisible(false);
          jLabel8.setVisible(false);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(411, 198));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1133, 724));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("E-Mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Security Question");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Answer");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 120, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 280, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 280, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 280, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 280, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 280, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "What Is your favorite book?", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first/current/favorite pet?", "What was the first company that you worked for?", "Where did you meet your spouse?", "Where did you go to high school/college?", "What is your favorite food?", "What city were you born in?", "Where is your favorite place to vacation?" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 280, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 280, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Create");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 110, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home Final$$.png"))); // NOI18N
        jButton2.setText(" Back");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 130, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("  May Not be NULL  !!");
        jLabel9.setToolTipText("");
        jLabel9.setAutoscrolls(true);
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 170, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 0));
        jLabel8.setText("Registered Successfully");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 220, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("*");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("*");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("*");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Register New User$.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
       //This code is to connect database and get the value entered in the jTextField will be stored in the database---------https://youtu.be/B6mWG_4xV8g------------
        try
        {
            //816, 780
          
            String username = jTextField1.getText();
            String name = jTextField2.getText();
            String mobileno = jTextField3.getText();
            String password = jPasswordField1.getText();
            String email = jTextField4.getText();
            String SecurityQ =(String) jComboBox1.getSelectedItem();
            String answer = jTextField5.getText();
            
          
            
            
             Connection con = ConnectionProvider.getCon();
           System.out.print("a");
         
          con.setAutoCommit(false);//IMPORTANT 1
          System.out.print("b");
         
          
          Statement st = con.createStatement();
          System.out.print("c");
          
          st.executeUpdate("INSERT INTO project.registernewuser values('"+ username+"','"+name+"','"+mobileno+"','"+password+"','"+email+"','"+SecurityQ+"','"+answer+"')");
          
           System.out.print("d");
            con.commit();//IMPORTANT 3
            
            
            if(username.isEmpty() || answer.isEmpty())
            {
                jLabel9.setVisible(true);
            }
            else
            {
         
             jLabel8.setVisible(true);
             JOptionPane.showMessageDialog(null,"Thank You For Registration !");
        
              System.out.print("e");
          
            }
          
          
          
            
          
          
             setVisible(false);
            new login().setVisible(true);
            
            /*
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","123456");
            
             con.setAutoCommit(false);
            
            Statement st = con.createStatement();
           // st.executeUpdate("INSERT INTO student ( username,password,mobileno,email,securityQ,answer,name) vallues ('"+username+"','"+password+"','"+mobileno+"','"+email+"','"+SecurityQ+"','"+answer+"','"+name+"')");
           
            st.executeUpdate("INSERT INTO project.student values('"+ username+"','"+name+"','"+mobileno+"','"+password+"','"+email+"','"+SecurityQ+"','"+answer+"')");
            
            con.commit();
            JOptionPane.showMessageDialog(null, " Thanks For The Registration");*/
            
          }
        catch(Exception e)
        {
            getToolkit().beep();
            jLabel9.setVisible(true);
            //JOptionPane.showMessageDialog(null, "Something Went Wrong ! Please Try Again ?");
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        setVisible(false);
            new login().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        
        
//        if(jComboBox1.getSelectedItem()=="Select--")
//        {
//            getToolkit().beep();
//        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
       
        
         int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        
        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed

        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
       
        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jComboBox1.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        
        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        
        
        int key = evt.getKeyCode();
        if(key==10)              // If Enter is pressed then it will return the key code 10
        {
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
        
        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             
           try
            {
            
          
            String username = jTextField1.getText();
            String name = jTextField2.getText();
            String mobileno = jTextField3.getText();
            String password = jPasswordField1.getText();
            String email = jTextField4.getText();
            String SecurityQ =(String) jComboBox1.getSelectedItem();
            String answer = jTextField5.getText();
            
          
            
            
              Connection con = ConnectionProvider.getCon();
              con.setAutoCommit(false);//IMPORTANT 1
              Statement st = con.createStatement();
              
              st.executeUpdate("INSERT INTO project.registernewuser values('"+ username+"','"+name+"','"+mobileno+"','"+password+"','"+email+"','"+SecurityQ+"','"+answer+"')");
              
              con.commit();//IMPORTANT 3
            
            
            if(username.isEmpty() || answer.isEmpty())
            {
                jLabel9.setVisible(true);
            }
            else
            {
         
             jLabel8.setVisible(true);
             JOptionPane.showMessageDialog(null,"Thank You For Registration !");
            
            }
            
            setVisible(false);
            new login().setVisible(true);
        
        }
        catch(Exception e)
        {
            getToolkit().beep();
            jLabel9.setVisible(true);
        }
             
             
         }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(regiserNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regiserNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regiserNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regiserNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regiserNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}



//jFrame Form  1.Location: [819, 198]
//             2.Form Size :721, 724