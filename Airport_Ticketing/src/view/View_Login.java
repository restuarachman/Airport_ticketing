/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author restu
 */
public class View_Login extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View_Login() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSignup = new javax.swing.JLabel();
        panelBackground = new javax.swing.JPanel();
        moveableFrame = new javax.swing.JPanel();
        forSignup = new javax.swing.JLabel();
        labeQuestion = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        Line = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        labelUsername = new javax.swing.JLabel();
        txtUsername = new app.bolivia.swing.JCTextField();
        BackgroundIMG = new javax.swing.JLabel();

        btnSignup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(255, 255, 255));
        btnSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignup.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\asset\\render Sign Up.png")); // NOI18N
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moveableFrame.setOpaque(false);
        moveableFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveableFrameMouseDragged(evt);
            }
        });
        moveableFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveableFrameMousePressed(evt);
            }
        });

        javax.swing.GroupLayout moveableFrameLayout = new javax.swing.GroupLayout(moveableFrame);
        moveableFrame.setLayout(moveableFrameLayout);
        moveableFrameLayout.setHorizontalGroup(
            moveableFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        moveableFrameLayout.setVerticalGroup(
            moveableFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelBackground.add(moveableFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        forSignup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        forSignup.setForeground(new java.awt.Color(255, 255, 255));
        forSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forSignup.setText("Sign Up");
        forSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forSignupMouseClicked(evt);
            }
        });
        panelBackground.add(forSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        labeQuestion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labeQuestion.setForeground(new java.awt.Color(255, 255, 255));
        labeQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeQuestion.setText("Does'nt have an account ?");
        panelBackground.add(labeQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/render Log In.png"))); // NOI18N
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        panelBackground.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 170, 50));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        panelBackground.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 20));

        Line.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        Line.setForeground(new java.awt.Color(255, 255, 255));
        Line.setText("_____");
        panelBackground.add(Line, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, -1, -1));

        Title.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Sign in to Account");
        panelBackground.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        labelPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password :");
        panelBackground.add(labelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        txtPassword.setBackground(new java.awt.Color(16, 11, 46));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setToolTipText("sssss");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        panelBackground.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 308, 340, 30));

        labelUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Username :");
        panelBackground.add(labelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, -1, -1));

        txtUsername.setBackground(new java.awt.Color(16, 11, 46));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 14)); // NOI18N
        txtUsername.setPhColor(new java.awt.Color(255, 255, 255));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        panelBackground.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 340, -1));

        BackgroundIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackgroundIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/Background.png"))); // NOI18N
        panelBackground.add(BackgroundIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Login");
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnSignupMouseClicked

    private void forSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forSignupMouseClicked
        // TODO add your handling code here:
        
        View_Signup frameSignup = new View_Signup();
        frameSignup.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_forSignupMouseClicked
    
    private int xMouse, yMouse;
    
    private void moveableFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableFrameMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse ,y-yMouse);
        
        
    }//GEN-LAST:event_moveableFrameMouseDragged

    private void moveableFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableFrameMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_moveableFrameMousePressed

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
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundIMG;
    private javax.swing.JLabel Line;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSignup;
    private javax.swing.JLabel forSignup;
    private javax.swing.JLabel labeQuestion;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel moveableFrame;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPasswordField txtPassword;
    private app.bolivia.swing.JCTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}