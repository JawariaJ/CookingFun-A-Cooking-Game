/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CookingFun;

/**
 *
 * @author Hassan ul haq
 */
public class PizzaMenu extends javax.swing.JFrame {
//     in pizza menu we have three pizza menus:
//    1- pepperoni pizza
//    2- plain pizza
//    3- chicken pizza
//   
    /**
     * Creates new form PizzaManue
     */
    public PizzaMenu() {
        initComponents();
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
        pizzamanue = new javax.swing.JLabel();
        chef = new javax.swing.JLabel();
        plainbutton = new javax.swing.JButton();
        plain = new javax.swing.JLabel();
        pepperinobutton = new javax.swing.JButton();
        pepperino = new javax.swing.JLabel();
        chickenbutton = new javax.swing.JButton();
        chicken = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(null);

        pizzamanue.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        pizzamanue.setForeground(new java.awt.Color(255, 255, 0));
        pizzamanue.setText("PIZZA MENU");
        jPanel1.add(pizzamanue);
        pizzamanue.setBounds(190, 30, 210, 50);

        chef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chef-ichh.png"))); // NOI18N
        jPanel1.add(chef);
        chef.setBounds(230, 80, 240, 290);

        plainbutton.setBackground(new java.awt.Color(0, 102, 0));
        plainbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plain .p.png"))); // NOI18N
        plainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plainbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(plainbutton);
        plainbutton.setBounds(60, 110, 60, 50);

        plain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plain.setForeground(new java.awt.Color(255, 255, 0));
        plain.setText("Plain Pizza");
        jPanel1.add(plain);
        plain.setBounds(60, 160, 100, 30);

        pepperinobutton.setBackground(new java.awt.Color(0, 102, 0));
        pepperinobutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pepp.p.png"))); // NOI18N
        pepperinobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepperinobuttonActionPerformed(evt);
            }
        });
        jPanel1.add(pepperinobutton);
        pepperinobutton.setBounds(60, 200, 60, 50);

        pepperino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pepperino.setForeground(new java.awt.Color(255, 255, 0));
        pepperino.setText("Pepperino Pizza");
        jPanel1.add(pepperino);
        pepperino.setBounds(50, 250, 130, 30);

        chickenbutton.setBackground(new java.awt.Color(0, 102, 0));
        chickenbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chick.p.png"))); // NOI18N
        chickenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(chickenbutton);
        chickenbutton.setBounds(60, 300, 60, 50);

        chicken.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chicken.setForeground(new java.awt.Color(255, 255, 0));
        chicken.setText("Chicken pizza");
        jPanel1.add(chicken);
        chicken.setBounds(60, 360, 120, 30);

        back.setBackground(new java.awt.Color(255, 255, 0));
        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(51, 153, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(200, 410, 100, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void plainbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plainbuttonActionPerformed
        PlainPizza pp = new PlainPizza();
        pp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_plainbuttonActionPerformed

    private void pepperinobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepperinobuttonActionPerformed
        PepperoniPizza pp = new PepperoniPizza();
        pp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_pepperinobuttonActionPerformed

    private void chickenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenbuttonActionPerformed
        ChickenPizza pp = new ChickenPizza();
        pp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_chickenbuttonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Menu mf = new Menu();
        mf.setVisible(true);
       this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel chef;
    private javax.swing.JLabel chicken;
    private javax.swing.JButton chickenbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pepperino;
    private javax.swing.JButton pepperinobutton;
    private javax.swing.JLabel pizzamanue;
    private javax.swing.JLabel plain;
    private javax.swing.JButton plainbutton;
    // End of variables declaration//GEN-END:variables
}
