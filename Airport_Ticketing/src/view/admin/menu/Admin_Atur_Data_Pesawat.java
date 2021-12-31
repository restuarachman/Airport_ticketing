/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin.menu;

import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import tabel.TabelPesawatModel;

/**
 *
 * @author restu
 */
public class Admin_Atur_Data_Pesawat extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    
    public Admin_Atur_Data_Pesawat() {
        initComponents();
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public void setBtnBatal(JButton btnBatal) {
        this.btnBatal = btnBatal;
    }

    public JButton getBtnCari() {
        return btnCari;
    }

    public void setBtnCari(JButton btnCari) {
        this.btnCari = btnCari;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public void setBtnHapus(JButton btnHapus) {
        this.btnHapus = btnHapus;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public void setBtnRefresh(JButton btnRefresh) {
        this.btnRefresh = btnRefresh;
    }

    public JButton getBtnSimpan() {
        return btnSimpan;
    }

    public void setBtnSimpan(JButton btnSimpan) {
        this.btnSimpan = btnSimpan;
    }

    public JButton getBtnUbah() {
        return btnUbah;
    }

    public void setBtnUbah(JButton btnUbah) {
        this.btnUbah = btnUbah;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTextField getTxt_cari_nama_pesawat() {
        return txt_cari_nama_pesawat;
    }

    public void setTxt_cari_nama_pesawat(JTextField txt_cari_nama_pesawat) {
        this.txt_cari_nama_pesawat = txt_cari_nama_pesawat;
    }

    public JLabel getTxt_id_pesawat() {
        return txt_id_pesawat;
    }

    public void setTxt_id_pesawat(JLabel txt_id_pesawat) {
        this.txt_id_pesawat = txt_id_pesawat;
    }

   
    public JTextField getTxt_kode_pesawat() {
        return txt_kode_pesawat;
    }

    public void setTxt_kode_pesawat(JTextField txt_kode_pesawat) {
        this.txt_kode_pesawat = txt_kode_pesawat;
    }

    public JTextField getTxt_nama_pesawat() {
        return txt_nama_pesawat;
    }

    public void setTxt_nama_pesawat(JTextField txt_nama_pesawat) {
        this.txt_nama_pesawat = txt_nama_pesawat;
    }

    public void addListener(MouseListener mouseListener) {
        btnBack.addMouseListener(mouseListener);
        btnBatal.addMouseListener(mouseListener);
        btnCari.addMouseListener(mouseListener);
        btnHapus.addMouseListener(mouseListener);
        btnRefresh.addMouseListener(mouseListener);
        btnSimpan.addMouseListener(mouseListener);
        btnUbah.addMouseListener(mouseListener);
    }

    public void clearTextField() {
        txt_cari_nama_pesawat.setText(null);
        txt_id_pesawat.setText(null);
        txt_kode_pesawat.setText(null);
        txt_nama_pesawat.setText(null);
    }
    
    public void setDataField(){
        int row;
        row = jTable1.getSelectedRow();
        
        if (row != -1){
            try {
                txt_id_pesawat.setText((String)jTable1.getModel().getValueAt(row, 0));
                txt_kode_pesawat.setText((String)jTable1.getModel().getValueAt(row, 1));
                txt_nama_pesawat.setText((String)jTable1.getModel().getValueAt(row, 2));
            } catch (SecurityException ex) {
                Logger.getLogger(Admin_Atur_Data_Bandara.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_kode_pesawat = new javax.swing.JTextField();
        txt_cari_nama_pesawat = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_nama_pesawat = new javax.swing.JTextField();
        txt_id_pesawat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bodyPanel.setBackground(new java.awt.Color(255, 255, 255));
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

        Header.setBackground(new java.awt.Color(48, 57, 82));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/img/Logo-removebg-preview.png"))); // NOI18N
        Header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnBack.setBackground(new java.awt.Color(47, 54, 64));
        btnBack.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        Header.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 140, 40));

        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN PANEL");
        Header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        bodyPanel.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 110));

        jLabel2.setBackground(new java.awt.Color(48, 57, 82));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 57, 82));
        jLabel2.setText("Kode Pesawat        :");
        bodyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, 30));

        jLabel5.setBackground(new java.awt.Color(48, 57, 82));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 57, 82));
        jLabel5.setText("Cari Data");
        bodyPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 70, 30));

        txt_kode_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_pesawatActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_kode_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, 30));

        txt_cari_nama_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_nama_pesawatActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_cari_nama_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 160, 30));

        btnRefresh.setBackground(new java.awt.Color(47, 54, 64));
        btnRefresh.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bodyPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 90, 30));

        btnSimpan.setBackground(new java.awt.Color(0, 153, 102));
        btnSimpan.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        bodyPanel.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 90, 30));

        btnUbah.setBackground(new java.awt.Color(153, 153, 0));
        btnUbah.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        bodyPanel.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 90, 30));

        btnHapus.setBackground(new java.awt.Color(153, 0, 0));
        btnHapus.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        bodyPanel.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Atur Data Pesawat");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("ID Pesawat             :");
        bodyPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 30));

        btnBatal.setBackground(new java.awt.Color(47, 54, 64));
        btnBatal.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        bodyPanel.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 90, 30));

        btnCari.setBackground(new java.awt.Color(47, 54, 64));
        btnCari.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        bodyPanel.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 90, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Pesawat", "Kode Pesawat", "Nama Pesawat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bodyPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 430, 340));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Nama Pesawat        :");
        bodyPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 140, 30));

        txt_nama_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_pesawatActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_nama_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 180, 30));

        txt_id_pesawat.setBackground(new java.awt.Color(48, 57, 82));
        txt_id_pesawat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_id_pesawat.setForeground(new java.awt.Color(48, 57, 82));
        bodyPanel.add(txt_id_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, 30));

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txt_kode_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kode_pesawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kode_pesawatActionPerformed

    private void txt_cari_nama_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cari_nama_pesawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cari_nama_pesawatActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void txt_nama_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_pesawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_pesawatActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        setDataField();
    }//GEN-LAST:event_jTable1MouseClicked
    
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
            java.util.logging.Logger.getLogger(Admin_Atur_Data_Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Data_Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Data_Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Data_Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel moveableFrame;
    private javax.swing.JTextField txt_cari_nama_pesawat;
    private javax.swing.JLabel txt_id_pesawat;
    private javax.swing.JTextField txt_kode_pesawat;
    private javax.swing.JTextField txt_nama_pesawat;
    // End of variables declaration//GEN-END:variables

    
    
    private Object View_Panel_User_ListPenerbangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
