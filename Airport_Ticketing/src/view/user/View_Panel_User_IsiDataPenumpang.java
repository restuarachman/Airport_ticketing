/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class View_Panel_User_IsiDataPenumpang extends javax.swing.JFrame {

    /**
     * Creates new form View_Panel_User_IsiDataPenumpang
     */
    public View_Panel_User_IsiDataPenumpang() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelesai = new javax.swing.JButton();
        Panel_List_Penerbangan = new javax.swing.JPanel();
        moveableFrame1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_noHP = new javax.swing.JTextField();
        txt_namaPenumpang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Counter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Alamat = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSimpanData = new javax.swing.JButton();
        Background = new javax.swing.JPanel();

        btnSelesai.setBackground(new java.awt.Color(47, 54, 64));
        btnSelesai.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnSelesai.setForeground(new java.awt.Color(255, 255, 255));
        btnSelesai.setText("Selesai");
        btnSelesai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelesaiMouseClicked(evt);
            }
        });
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_List_Penerbangan.setBackground(new java.awt.Color(255, 255, 255));
        Panel_List_Penerbangan.setForeground(new java.awt.Color(255, 255, 255));
        Panel_List_Penerbangan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel6.setBackground(new java.awt.Color(48, 57, 82));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 57, 82));
        jLabel6.setText("Alamat  :");
        Panel_List_Penerbangan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Nama   :");
        Panel_List_Penerbangan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        txt_noHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noHPActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_noHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 300, 30));

        txt_namaPenumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaPenumpangActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(txt_namaPenumpang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 300, 30));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("No HP   :");
        Panel_List_Penerbangan.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        txt_Counter.setBackground(new java.awt.Color(48, 57, 82));
        txt_Counter.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        txt_Counter.setForeground(new java.awt.Color(48, 57, 82));
        txt_Counter.setText("x");
        Panel_List_Penerbangan.add(txt_Counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 30, -1));

        txt_Alamat.setColumns(20);
        txt_Alamat.setRows(5);
        jScrollPane1.setViewportView(txt_Alamat);

        Panel_List_Penerbangan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 300, 100));

        jLabel12.setBackground(new java.awt.Color(48, 57, 82));
        jLabel12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(48, 57, 82));
        jLabel12.setText("Isi Data Penumpang");
        Panel_List_Penerbangan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel13.setBackground(new java.awt.Color(48, 57, 82));
        jLabel13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(48, 57, 82));
        jLabel13.setText("Data Penumpang");
        Panel_List_Penerbangan.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        btnSimpanData.setBackground(new java.awt.Color(47, 54, 64));
        btnSimpanData.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnSimpanData.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpanData.setText("Simpan Data");
        btnSimpanData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanDataMouseClicked(evt);
            }
        });
        btnSimpanData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDataActionPerformed(evt);
            }
        });
        Panel_List_Penerbangan.add(btnSimpanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 180, 50));

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

    private void txt_noHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noHPActionPerformed

    private void txt_namaPenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaPenumpangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaPenumpangActionPerformed

    private void btnSelesaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelesaiMouseClicked
        // TODO add your handling code here:

        //        this.setVisible(false);
    }//GEN-LAST:event_btnSelesaiMouseClicked

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnSimpanDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanDataMouseClicked

    private void btnSimpanDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDataActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        System.out.println(txt_Counter);
        System.out.println(txt_namaPenumpang);
        System.out.println(txt_noHP);
        System.out.println(txt_Alamat);
    }//GEN-LAST:event_btnSimpanDataActionPerformed

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
            java.util.logging.Logger.getLogger(View_Panel_User_IsiDataPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User_IsiDataPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User_IsiDataPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Panel_User_IsiDataPenumpang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
//        View_Panel_User_IsiDataPenumpang frame = new View_Panel_User_IsiDataPenumpang();
//        frame.setVisible(true);
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

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

    

    public void setBackground(JPanel Background) {
        this.Background = Background;
    }

    public JPanel getPanel_List_Penerbangan() {
        return Panel_List_Penerbangan;
    }

    public void setPanel_List_Penerbangan(JPanel Panel_List_Penerbangan) {
        this.Panel_List_Penerbangan = Panel_List_Penerbangan;
    }

    public JButton getBtnSimpanData() {
        return btnSelesai;
    }

    public void setBtnSimpanData(JButton btnSimpanData) {
        this.btnSelesai = btnSimpanData;
    }

    public JLabel getjLabel11() {
        return txt_Counter;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.txt_Counter = jLabel11;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTextArea getjTextArea1() {
        return txt_Alamat;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.txt_Alamat = jTextArea1;
    }

    public JTextField getjTextField1() {
        return txt_noHP;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.txt_noHP = jTextField1;
    }

    public JTextField getjTextField2() {
        return txt_namaPenumpang;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.txt_namaPenumpang = jTextField2;
    }

    public JPanel getMoveableFrame1() {
        return moveableFrame1;
    }

    public void setMoveableFrame1(JPanel moveableFrame1) {
        this.moveableFrame1 = moveableFrame1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Panel_List_Penerbangan;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JButton btnSimpanData;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel moveableFrame1;
    private javax.swing.JTextArea txt_Alamat;
    private javax.swing.JLabel txt_Counter;
    private javax.swing.JTextField txt_namaPenumpang;
    private javax.swing.JTextField txt_noHP;
    // End of variables declaration//GEN-END:variables


    
    public static void ulang(int count){
        
        
        
        for (int i = 1; i <= count; i++) {
            
            View_Panel_User_IsiDataPenumpang frame = new View_Panel_User_IsiDataPenumpang();
            
            frame.setVisible(true);
            frame.txt_Counter.setText(String.valueOf(i));
            
            
            
        }
    }


}
