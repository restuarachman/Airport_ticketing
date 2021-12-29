/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.kasir.menu;

import view.user.*;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Kasir_Pembayaran_Rincian_Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form View_Panel_User_RincianHarga
     */
    public Kasir_Pembayaran_Rincian_Pembayaran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_List_Penerbangan = new javax.swing.JPanel();
        btnBack2 = new javax.swing.JLabel();
        moveableFrame1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotalPenumpang = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHargaTiket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUangAnda = new javax.swing.JTextField();
        Background = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_List_Penerbangan.setBackground(new java.awt.Color(255, 255, 255));
        Panel_List_Penerbangan.setForeground(new java.awt.Color(255, 255, 255));
        Panel_List_Penerbangan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/btnBack2.png"))); // NOI18N
        btnBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBack2MouseClicked(evt);
            }
        });
        Panel_List_Penerbangan.add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 40, 40));

        moveableFrame1.setOpaque(false);
        moveableFrame1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveableFrame1MouseDragged(evt);
            }
        });
        moveableFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveableFrame1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout moveableFrame1Layout = new javax.swing.GroupLayout(moveableFrame1);
        moveableFrame1.setLayout(moveableFrame1Layout);
        moveableFrame1Layout.setHorizontalGroup(
            moveableFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        moveableFrame1Layout.setVerticalGroup(
            moveableFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Panel_List_Penerbangan.add(moveableFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        jLabel11.setBackground(new java.awt.Color(48, 57, 82));
        jLabel11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(48, 57, 82));
        jLabel11.setText("Rincian Pembayaran");
        Panel_List_Penerbangan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel6.setBackground(new java.awt.Color(48, 57, 82));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 57, 82));
        jLabel6.setText("Sub Total                  : ");
        Panel_List_Penerbangan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Total Penumpang       :");
        Panel_List_Penerbangan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        txtSubTotal.setEnabled(false);
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 160, 30));

        txtTotalPenumpang.setEnabled(false);
        txtTotalPenumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPenumpangActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txtTotalPenumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 160, 30));

        btnBayar.setBackground(new java.awt.Color(47, 54, 64));
        btnBayar.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBayarMouseClicked(evt);
            }
        });
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 180, 50));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("Harga Satuan TIket     : ");
        Panel_List_Penerbangan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        txtHargaTiket.setEnabled(false);
        txtHargaTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaTiketActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txtHargaTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 160, 30));

        jLabel9.setBackground(new java.awt.Color(48, 57, 82));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 57, 82));
        jLabel9.setText("Masukan Jumlah Uang :");
        Panel_List_Penerbangan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        txtUangAnda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangAndaActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txtUangAnda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 160, 30));

        getContentPane().add(Panel_List_Penerbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 580));

        Background.setBackground(new java.awt.Color(48, 57, 82));
        Background.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private int xMouse, yMouse;
    private void moveableFrame1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableFrame1MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse ,y-yMouse);
    }//GEN-LAST:event_moveableFrame1MouseDragged

    private void moveableFrame1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveableFrame1MousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_moveableFrame1MousePressed

    private void btnBayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBayarMouseClicked
        // TODO add your handling code here:

        //        this.setVisible(false);
    }//GEN-LAST:event_btnBayarMouseClicked

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtTotalPenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPenumpangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPenumpangActionPerformed

    private void txtHargaTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaTiketActionPerformed

    private void txtUangAndaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangAndaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangAndaActionPerformed

    private void btnBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MouseClicked

    }//GEN-LAST:event_btnBack2MouseClicked

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
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Rincian_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Rincian_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Rincian_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Rincian_Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir_Pembayaran_Rincian_Pembayaran().setVisible(true);
            }
        });
    }

    public JLabel getBtnBack2() {
        return btnBack2;
    }

    public void setBtnBack2(JLabel btnBack2) {
        this.btnBack2 = btnBack2;
    }

    public JButton getBtnBayar() {
        return btnBayar;
    }

    public void setBtnBayar(JButton btnBayar) {
        this.btnBayar = btnBayar;
    }

    public JTextField getTxtHargaTiket() {
        return txtHargaTiket;
    }

    public void setTxtHargaTiket(JTextField txtHargaTiket) {
        this.txtHargaTiket = txtHargaTiket;
    }

    public JTextField getTxtSubTotal() {
        return txtSubTotal;
    }

    public void setTxtSubTotal(JTextField txtSubTotal) {
        this.txtSubTotal = txtSubTotal;
    }

    public JTextField getTxtTotalPenumpang() {
        return txtTotalPenumpang;
    }

    public void setTxtTotalPenumpang(JTextField txtTotalPenumpang) {
        this.txtTotalPenumpang = txtTotalPenumpang;
    }

    public JTextField getTxtUangAnda() {
        return txtUangAnda;
    }

    public void setTxtUangAnda(JTextField txtUangAnda) {
        this.txtUangAnda = txtUangAnda;
    }
    
    public void addListener(MouseListener mouseListener) {
        btnBack2.addMouseListener(mouseListener);
        btnBayar.addMouseListener(mouseListener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Panel_List_Penerbangan;
    private javax.swing.JLabel btnBack2;
    private javax.swing.JButton btnBayar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel moveableFrame1;
    private javax.swing.JTextField txtHargaTiket;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalPenumpang;
    private javax.swing.JTextField txtUangAnda;
    // End of variables declaration//GEN-END:variables
}
