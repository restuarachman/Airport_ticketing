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
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Kasir_Pembayaran_Cari_ID_Booking extends javax.swing.JFrame {

    /**
     * Creates new form View_Panel_User_ListPenerbangan
     */
    public Kasir_Pembayaran_Cari_ID_Booking() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_jumlah_penumpang = new javax.swing.JTextField();
        txt_id_booking = new javax.swing.JTextField();
        btnLanjutkanPembayaran = new javax.swing.JButton();
        txt_nama_penumpang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nomor_hp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cari_id_booking = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        Background = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 57, 82));
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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        moveableFrame1Layout.setVerticalGroup(
            moveableFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Panel_List_Penerbangan.add(moveableFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 40));

        jLabel11.setBackground(new java.awt.Color(48, 57, 82));
        jLabel11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(48, 57, 82));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cari ID Booking");
        Panel_List_Penerbangan.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel6.setBackground(new java.awt.Color(48, 57, 82));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 57, 82));
        jLabel6.setText("Jumlah Penumpang");
        Panel_List_Penerbangan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("Masukan ID Booking");
        Panel_List_Penerbangan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("ID Booking");
        Panel_List_Penerbangan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        txt_jumlah_penumpang.setEnabled(false);
        txt_jumlah_penumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_penumpangActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_jumlah_penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 180, 30));

        txt_id_booking.setEnabled(false);
        txt_id_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_bookingActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_id_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 180, 30));

        btnLanjutkanPembayaran.setBackground(new java.awt.Color(47, 54, 64));
        btnLanjutkanPembayaran.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnLanjutkanPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        btnLanjutkanPembayaran.setText("Lanjutkan Pembayaran");
        btnLanjutkanPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLanjutkanPembayaranMouseClicked(evt);
            }
        });
        btnLanjutkanPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutkanPembayaranActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(btnLanjutkanPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 220, 50));

        txt_nama_penumpang.setEnabled(false);
        txt_nama_penumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_penumpangActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_nama_penumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 180, 30));

        jLabel9.setBackground(new java.awt.Color(48, 57, 82));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 57, 82));
        jLabel9.setText("Nama Penumpang");
        Panel_List_Penerbangan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        txt_nomor_hp.setEnabled(false);
        txt_nomor_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomor_hpActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_nomor_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 180, 30));

        jLabel10.setBackground(new java.awt.Color(48, 57, 82));
        jLabel10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 57, 82));
        jLabel10.setText("Nomor HP");
        Panel_List_Penerbangan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        txt_cari_id_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_id_bookingActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_cari_id_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 160, 30));

        btnCari.setBackground(new java.awt.Color(47, 54, 64));
        btnCari.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, 30));

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

    private void btnLanjutkanPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLanjutkanPembayaranMouseClicked
        // TODO add your handling code here:

        //        this.setVisible(false);
    }//GEN-LAST:event_btnLanjutkanPembayaranMouseClicked

    private void btnLanjutkanPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutkanPembayaranActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnLanjutkanPembayaranActionPerformed

    private void txt_jumlah_penumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_penumpangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlah_penumpangActionPerformed

    private void txt_id_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_bookingActionPerformed

    private void txt_nama_penumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_penumpangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_penumpangActionPerformed

    private void txt_nomor_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomor_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomor_hpActionPerformed

    private void btnBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack2MouseClicked

    }//GEN-LAST:event_btnBack2MouseClicked

    private void txt_cari_id_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_id_bookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cari_id_bookingActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Cari_ID_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Cari_ID_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Cari_ID_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir_Pembayaran_Cari_ID_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir_Pembayaran_Cari_ID_Booking().setVisible(true);
            }
        });
    }

   
    
    public void addListener(MouseListener mouseListener) {
        btnLanjutkanPembayaran.addMouseListener(mouseListener);
        btnBack2.addMouseListener(mouseListener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Panel_List_Penerbangan;
    private javax.swing.JLabel btnBack2;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnLanjutkanPembayaran;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel moveableFrame1;
    private javax.swing.JTextField txt_cari_id_booking;
    private javax.swing.JTextField txt_id_booking;
    private javax.swing.JTextField txt_jumlah_penumpang;
    private javax.swing.JTextField txt_nama_penumpang;
    private javax.swing.JTextField txt_nomor_hp;
    // End of variables declaration//GEN-END:variables
}