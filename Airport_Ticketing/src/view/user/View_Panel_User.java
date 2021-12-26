/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.View_Login;
import view.user.dialog.dialogFrame_Penerbangan_notFound;

/**
 *
 * @author restu
 */
public class View_Panel_User extends javax.swing.JFrame {

    /**
     * Creates new form View
     */

    public View_Panel_User() {
  
        
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
        DynamicPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        buyTiketPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnCariPenerbangan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        btnBeliTiket.setText("BUY TICKET");
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

        DynamicPanel.setBackground(new java.awt.Color(52, 73, 94));
        DynamicPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        DynamicPanel.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(48, 57, 82));
        welcome.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(48, 57, 82));
        welcome.setText("WELCOME,");
        dashboardPanel.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        username.setBackground(new java.awt.Color(48, 57, 82));
        username.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(48, 57, 82));
        username.setText("username");
        dashboardPanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 21, -1, -1));

        backgroundImage.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/Dashboard_Image.png"))); // NOI18N
        backgroundImage.setText("username");
        dashboardPanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -120, 1090, 850));

        DynamicPanel.add(dashboardPanel, "card2");

        buyTiketPanel.setBackground(new java.awt.Color(255, 255, 255));
        buyTiketPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(48, 57, 82));
        jLabel2.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 57, 82));
        jLabel2.setText("BUY TICKET");
        buyTiketPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        jLabel5.setBackground(new java.awt.Color(48, 57, 82));
        jLabel5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 57, 82));
        jLabel5.setText("Detail Penerbangan");
        buyTiketPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 83, -1, -1));

        jLabel6.setBackground(new java.awt.Color(48, 57, 82));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 57, 82));
        jLabel6.setText("Dari");
        buyTiketPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 149, -1, -1));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("Ke");
        buyTiketPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Tanggal Keberangkatan");
        buyTiketPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        buyTiketPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 170, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Jakarta", "Surabaya", "Bali / Denpasar", "Semarang", "Balikpapan" }));
        buyTiketPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Jakarta", "Surabaya", "Bali / Denpasar", "Semarang", "Balikpapan" }));
        buyTiketPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, -1));

        jLabel9.setBackground(new java.awt.Color(48, 57, 82));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 57, 82));
        jLabel9.setText("Jumlah Penumpang");
        buyTiketPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 244, -1, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setForeground(new java.awt.Color(255, 51, 51));
        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135791105000L));
        buyTiketPanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 160, 30));

        jLabel10.setBackground(new java.awt.Color(48, 57, 82));
        jLabel10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 57, 82));
        jLabel10.setText("Kelas Penerbangan");
        buyTiketPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "Fist Class", " " }));
        buyTiketPanel.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, -1));

        btnCariPenerbangan.setBackground(new java.awt.Color(47, 54, 64));
        btnCariPenerbangan.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnCariPenerbangan.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPenerbangan.setText("CARI PENERBANGAN");
        btnCariPenerbangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariPenerbanganMouseClicked(evt);
            }
        });
        btnCariPenerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPenerbanganActionPerformed(evt);
            }
        });
        buyTiketPanel.add(btnCariPenerbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 190, 60));

        DynamicPanel.add(buyTiketPanel, "card2");

        bodyPanel.add(DynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 6, 797, 588));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        }else{
            System.out.println("batal logout");

        }
    }//GEN-LAST:event_btnHome3ActionPerformed

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

    private void btnDashboard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboard1ActionPerformed

    private void btnCariPenerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPenerbanganActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCariPenerbanganActionPerformed

    private void btnCariPenerbanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariPenerbanganMouseClicked
        // TODO add your handling code here:
        
        
//        this.setVisible(false);
    }//GEN-LAST:event_btnCariPenerbanganMouseClicked
    
    private int xMouse, yMouse;
    
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
            java.util.logging.Logger.getLogger(View_Panel_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new View_Panel_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBeliTiket;
    private javax.swing.JButton btnCariPenerbangan;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnHome3;
    private javax.swing.JPanel buyTiketPanel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel moveableFrame;
    private javax.swing.JLabel username;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    public int getxMouse() {
        return xMouse;
    }

    public void setxMouse(int xMouse) {
        this.xMouse = xMouse;
    }

    public int getyMouse() {
        return yMouse;
    }

    public void setyMouse(int yMouse) {
        this.yMouse = yMouse;
    }

    public JPanel getDynamicPanel() {
        return DynamicPanel;
    }

    public void setDynamicPanel(JPanel DynamicPanel) {
        this.DynamicPanel = DynamicPanel;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public JPanel getBodyPanel() {
        return bodyPanel;
    }

    public void setBodyPanel(JPanel bodyPanel) {
        this.bodyPanel = bodyPanel;
    }

    public JButton getBtnAbout() {
        return btnAbout;
    }

    public void setBtnAbout(JButton btnAbout) {
        this.btnAbout = btnAbout;
    }

    public JButton getBtnBeliTiket() {
        return btnBeliTiket;
    }

    public void setBtnBeliTiket(JButton btnBeliTiket) {
        this.btnBeliTiket = btnBeliTiket;
    }

    public JButton getBtnCariPenerbangan() {
        return btnCariPenerbangan;
    }

    public void setBtnCariPenerbangan(JButton btnCariPenerbangan) {
        this.btnCariPenerbangan = btnCariPenerbangan;
    }

    public JButton getBtnDashboard() {
        return btnDashboard;
    }

    public void setBtnDashboard(JButton btnDashboard) {
        this.btnDashboard = btnDashboard;
    }

    public JButton getBtnDashboard1() {
        return btnDashboard1;
    }

    public void setBtnDashboard1(JButton btnDashboard1) {
        this.btnDashboard1 = btnDashboard1;
    }

    public JButton getBtnHome3() {
        return btnHome3;
    }

    public void setBtnHome3(JButton btnHome3) {
        this.btnHome3 = btnHome3;
    }

    public JPanel getBuyTiketPanel() {
        return buyTiketPanel;
    }

    public void setBuyTiketPanel(JPanel buyTiketPanel) {
        this.buyTiketPanel = buyTiketPanel;
    }

    public JPanel getDashboardPanel() {
        return dashboardPanel;
    }

    public void setDashboardPanel(JPanel dashboardPanel) {
        this.dashboardPanel = dashboardPanel;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    public void setjComboBox3(JComboBox<String> jComboBox3) {
        this.jComboBox3 = jComboBox3;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public void setjDateChooser1(JDateChooser jDateChooser1) {
        this.jDateChooser1 = jDateChooser1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public void setMenuPanel(JPanel menuPanel) {
        this.menuPanel = menuPanel;
    }

    public JPanel getMoveableFrame() {
        return moveableFrame;
    }

    public void setMoveableFrame(JPanel moveableFrame) {
        this.moveableFrame = moveableFrame;
    }

    public JLabel getUsername() {
        return username;
    }

    public void setUsername(JLabel username) {
        this.username = username;
    }

    public JLabel getWelcome() {
        return welcome;
    }

    public void setWelcome(JLabel welcome) {
        this.welcome = welcome;
    }
    
    public void addListener(MouseListener listener) {
        btnCariPenerbangan.addMouseListener(listener);
    }
}
