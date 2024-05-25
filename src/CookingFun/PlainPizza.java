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
public class PlainPizza extends javax.swing.JFrame {

   // mouse pressed on the scrren 
    int xmouse1;
    int ymouse1;
    
   // mouse dragged on the screen  
    int x2;
    int y2;
    
        // mouse pressed on the object(ingredient)

    int xdough;
    int ydough;
    int xcheese;
    int ycheese;
    int xsauce;
    int ysauce;
    
     // score counting 
    protected int count;
    
    //  used for calculting the clicks on ingredient
    int click;
    
    // these boolean var are used for enabling and disabling the ingredients(labels)
    boolean d,c,s;
    
    
    /**
     * Creates new form PlainPizza
     */
    public PlainPizza() {
        initComponents();
        click =0;
        count =0;
        d=true;
        c=false;
        s=false;
       
       
   
        
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
        cheese = new javax.swing.JLabel();
        sauce = new javax.swing.JLabel();
        dough = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jback = new javax.swing.JLabel();
        cutting_board = new javax.swing.JLabel();
        bake = new javax.swing.JButton();
        oven = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        jPanel1.setLayout(null);

        cheese.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cheese.png"))); // NOI18N
        cheese.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cheeseMouseDragged(evt);
            }
        });
        cheese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cheeseMousePressed(evt);
            }
        });
        jPanel1.add(cheese);
        cheese.setBounds(280, 370, 80, 60);

        sauce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pizza sauce.png"))); // NOI18N
        sauce.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sauceMouseDragged(evt);
            }
        });
        sauce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sauceMousePressed(evt);
            }
        });
        jPanel1.add(sauce);
        sauce.setBounds(460, 370, 70, 70);

        dough.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dough.png"))); // NOI18N
        dough.setText(" ");
        dough.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                doughMouseDragged(evt);
            }
        });
        dough.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doughMousePressed(evt);
            }
        });
        jPanel1.add(dough);
        dough.setBounds(100, 370, 80, 60);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/backOrange.PNG"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(530, 120, 80, 60);

        jback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jback.setForeground(new java.awt.Color(51, 204, 0));
        jback.setText("Back");
        jPanel1.add(jback);
        jback.setBounds(540, 180, 90, 30);

        cutting_board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cutting-board128.png"))); // NOI18N
        jPanel1.add(cutting_board);
        cutting_board.setBounds(160, 210, 130, 80);

        bake.setBackground(new java.awt.Color(255, 153, 153));
        bake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bake.setForeground(new java.awt.Color(0, 102, 102));
        bake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Flame.png"))); // NOI18N
        bake.setText("Bake");
        bake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakeActionPerformed(evt);
            }
        });
        jPanel1.add(bake);
        bake.setBounds(340, 210, 110, 30);

        oven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/oven.png"))); // NOI18N
        jPanel1.add(oven);
        oven.setBounds(330, 170, 160, 120);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kitchen.PNG"))); // NOI18N
        background.setText(" ");
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        jPanel1.add(background);
        background.setBounds(0, 0, 660, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doughMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doughMousePressed
        click++;
        if(d){
        xdough= evt.getX();
      ydough =evt.getY();
      if(click==1)
          count++;
      
       }
        else 
            count--;
    }//GEN-LAST:event_doughMousePressed

    private void doughMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doughMouseDragged
       if(d){
            
        int x = evt.getXOnScreen();
          int y = evt.getYOnScreen();
         dough.setLocation((x-x2)-(xdough-xmouse1), (y-y2)-(ydough-ymouse1));
           dough.setVisible(true);
        d=true;
        s=true;
        c=false;
       }
      click=0;  
    }//GEN-LAST:event_doughMouseDragged

    private void sauceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauceMousePressed
        click++;
     if(s){
        xsauce= evt.getX();
      ysauce =evt.getY();
      if(click==1)
          count++;
      
       }
        else 
            count--;
    }//GEN-LAST:event_sauceMousePressed

    private void sauceMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sauceMouseDragged
      if(s){
        int x = evt.getXOnScreen();
          int y = evt.getYOnScreen();
         sauce.setLocation((x-x2)-(xsauce-xmouse1), (y-y2)-(ysauce-ymouse1));
           sauce.setVisible(true);
           
           d=true;
        c=true;
        s=true;
           
      }
      click=0;
    }//GEN-LAST:event_sauceMouseDragged

    private void cheeseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheeseMousePressed
     click++;
        if(c){  xcheese= evt.getX();
      ycheese =evt.getY();
      if(click==1)
          count++;
     }
        else
            count--;
    }//GEN-LAST:event_cheeseMousePressed

    private void cheeseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cheeseMouseDragged
      if(c){  int x = evt.getXOnScreen();
          int y = evt.getYOnScreen();
         cheese.setLocation((x-x2)-(xcheese-xmouse1), (y-y2)-(ycheese-ymouse1));
           cheese.setVisible(true);
      }
      click=0;
    }//GEN-LAST:event_cheeseMouseDragged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      PizzaMenu mf= new PizzaMenu();

        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void bakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakeActionPerformed
// if all the ingrediets are  true only then bake button will be enabled
        if(d && s &&c){
        
       BakedPlainPizza bp = new BakedPlainPizza(count);
       bp.setVisible(true);
     this.dispose();
      }
    }//GEN-LAST:event_bakeActionPerformed

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        xmouse1= evt.getX();
        ymouse1 =evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        int xdrag1=evt.getXOnScreen();
        int ydrag1=evt.getYOnScreen();
        x2=xdrag1;
        y2=ydrag1;
    }//GEN-LAST:event_backgroundMouseDragged

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
            java.util.logging.Logger.getLogger(PlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlainPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlainPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton bake;
    private javax.swing.JLabel cheese;
    private javax.swing.JLabel cutting_board;
    private javax.swing.JLabel dough;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jback;
    private javax.swing.JLabel oven;
    private javax.swing.JLabel sauce;
    // End of variables declaration//GEN-END:variables
}
