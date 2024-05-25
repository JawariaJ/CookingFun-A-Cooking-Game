/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CookingFun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan ul haq
 */
public class BakedPlainPizza extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    int c;
    
    // this var is used for looser frame's try again button 
    // we use it for transfering the string to looser frame 
    // suppose if user is playing on any of pizza interface and he lost with the score 0 and < 0 
    // then he want to try it again , for this purpose to show him the specific pizza interface again 
    // for this we are passing the string alphabet as the "type of pizza" user is playing ,eg: for plain  "plp" , for chicken "chp" etc
    // and then for making same burger again he will get the same interface again
    String cound;

    /**
     * Creates new form BakedPlainPizza
     */
    public BakedPlainPizza() {
        initComponents();
    }

    public BakedPlainPizza(int count) {
        initComponents();
        try {
            String urlDB = System.getProperty("user.dir").concat("\\records1.accdb");

            con = DriverManager.getConnection("jdbc:ucanaccess://" + urlDB + ";memory=true");
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("select* from records");
        } catch (SQLException ex) {

            ex.printStackTrace();
        }

        if (count < 0) {
            count = 0;
            score.setText(count + "");
        } else {
            score.setText(count + "");
        }
        c = count;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        oven = new javax.swing.JLabel();
        done = new javax.swing.JButton();
        jdone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        score = new javax.swing.JButton();
        scorelabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("BAKED");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(500, 100, 110, 50);

        oven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oven.png"))); // NOI18N
        jPanel1.add(oven);
        oven.setBounds(292, 160, 180, 120);

        done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/doneOrange.PNG"))); // NOI18N
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        jPanel1.add(done);
        done.setBounds(520, 200, 70, 60);

        jdone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jdone.setForeground(new java.awt.Color(51, 204, 0));
        jdone.setText("Done");
        jPanel1.add(jdone);
        jdone.setBounds(540, 280, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plain pizza.png"))); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 220, 120, 70);

        score.setBackground(new java.awt.Color(255, 204, 204));
        score.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        score.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(score);
        score.setBounds(50, 140, 80, 40);

        scorelabel.setBackground(new java.awt.Color(204, 255, 204));
        scorelabel.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        scorelabel.setForeground(new java.awt.Color(51, 153, 0));
        scorelabel.setText("SCORE");
        jPanel1.add(scorelabel);
        scorelabel.setBounds(60, 100, 70, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kitchen.PNG"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 620, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        try {
              while(rs.next()){
                  PreparedStatement s = con.prepareStatement("UPDATE records SET Score=? where Name='"+ login.name +"'");
           
                  if (c > 0 && c < 3) {
                 s.setInt(1, c);
                s.executeUpdate();
                JOptionPane.showMessageDialog(this, "score added");
                
                Successful S = new Successful();
                S.setVisible(true);
               this.dispose();
            } 
                  else if (c <= 0) {
                 s.setInt(1, c);
                s.executeUpdate();
                JOptionPane.showMessageDialog(this, "score added");
                
                // cond will store string according to menu name eg: plain pizza so "plp" 
                cound = "plp";
                LooserFrame l = new LooserFrame(cound);
                l.setVisible(true);
                this.dispose();
            } else if (c > 2) {
                 s.setInt(1, c);
                s.executeUpdate();
                JOptionPane.showMessageDialog(this, "score added");
                
                Winner w = new Winner();
                w.setVisible(true);
               this.dispose();
            }
              }
        } catch (SQLException ex) {
            Logger.getLogger(SimpleBurger.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
             con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BakedPlainPizza.class.getName()).log(Level.SEVERE, null, ex);
       
        }

    }//GEN-LAST:event_doneActionPerformed

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
            java.util.logging.Logger.getLogger(BakedPlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BakedPlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BakedPlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BakedPlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BakedPlainPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jdone;
    private javax.swing.JLabel oven;
    private javax.swing.JButton score;
    private javax.swing.JLabel scorelabel;
    // End of variables declaration//GEN-END:variables
}
