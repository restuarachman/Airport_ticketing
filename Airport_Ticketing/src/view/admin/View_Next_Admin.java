/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

/**
 *
 * @author ASUS
 */
public class View_Next_Admin extends javax.swing.JFrame {

    /**
     * Creates new form View_Next_Admin
     */
    public View_Next_Admin() {
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

        bodyPanel = new javax.swing.JPanel();
        moveableFrame = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnBeliTiket = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnHome3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDashboard1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyPanel.setBackground(new java.awt.Color(52, 73, 94));
        bodyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        bodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        moveableFrameLayout.setVerticalGroup(
            moveableFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bodyPanel.add(moveableFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 20));

        menuPanel.setBackground(new java.awt.Color(48, 57, 82));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBeliTiket.setBackground(new java.awt.Color(47, 54, 64));
        btnBeliTiket.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnBeliTiket.setForeground(new java.awt.Color(255, 255, 255));
        btnBeliTiket.setText("Admin");
        btnBeliTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliTiketActionPerformed(evt);
            }
        });
        menuPanel.add(btnBeliTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 164, 53));

        btnDashboard.setBackground(new java.awt.Color(47, 54, 64));
        btnDashboard.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("DASHBOARD");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });
        menuPanel.add(btnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 164, 53));

        btnAbout.setBackground(new java.awt.Color(47, 54, 64));
        btnAbout.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setText("ABOUT");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        menuPanel.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 164, 53));

        btnHome3.setBackground(new java.awt.Color(47, 54, 64));
        btnHome3.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnHome3.setForeground(new java.awt.Color(255, 255, 255));
        btnHome3.setText("LOGOUT");
        btnHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome3ActionPerformed(evt);
            }
        });
        menuPanel.add(btnHome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 164, 53));

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/Logo-removebg-preview.png"))); // NOI18N
        menuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Airport Ticketing");
        menuPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnDashboard1.setBackground(new java.awt.Color(47, 54, 64));
        btnDashboard1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard1.setText("DASHBOARD");
        btnDashboard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboard1ActionPerformed(evt);
            }
        });
        menuPanel.add(btnDashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 164, 53));

        bodyPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 185, 588));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBeliTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliTiketActionPerformed
        // TODO add your handling code here:

        // remove panel
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();

        // add panel
        DynamicPanel.add(buyTiketPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
    }//GEN-LAST:event_btnBeliTiketActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:

        // remove panel
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();

        // add panel
        DynamicPanel.add(dashboardPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        View_Panel_User_About view_about = new View_Panel_User_About();
        view_about.setVisible(true);
        view_about.setAlwaysOnTop(true);

        //        btnAbout.setEnabled(false);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome3ActionPerformed
        // TODO add your handling code here:

        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda yakin ingin keluar?", "PERINGATAN", dialogBtn);

        if (dialogResult == 0) {
            View_Login frame = new View_Login();
            frame.setVisible(true);
            frame.getTxtUsername().setText(user.getUsername());
        }

        this.dispose();
    }//GEN-LAST:event_btnHome3ActionPerformed

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Next_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Next_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Next_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Next_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Next_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBeliTiket;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnHome3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel moveableFrame;
    // End of variables declaration//GEN-END:variables
}