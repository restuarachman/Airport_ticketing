/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.kasir.menu;

import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        
        printStruk();
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrint = new javax.swing.JButton();
        fieldStruk = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        btnPrint.setBackground(new java.awt.Color(47, 54, 64));
        btnPrint.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("PRINT");
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        fieldStruk.setEditable(false);
        fieldStruk.setColumns(20);
        fieldStruk.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(fieldStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(fieldStruk, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
        // TODO add your handling code here:

        //        this.setVisible(false);
    }//GEN-LAST:event_btnPrintMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            // TODO add your handling code here:

            fieldStruk.print();
        } catch (PrinterException ex) {
            Logger.getLogger(invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }
    
    
    public void printStruk() {
        String total = "5";
        String bayar = "5000";
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = "2022-01-01";
            
        String totalPenumpang ="4";
        String hargaSatuan    ="Rp.1.000.000";
        String subTotal       ="Rp.4.000.000";
        String uangAnda       ="Rp.5.000.000";
        String kembalian      ="Rp.1.000.000";
        
        
        
        fieldStruk.setText(fieldStruk.getText() + "--------------------------------------------------------------------------------------------\n");
        fieldStruk.setText(fieldStruk.getText() + "\tSTRUK PEMBELIAN TIKET PESAWAT\n");
        fieldStruk.setText(fieldStruk.getText() + "--------------------------------------------------------------------------------------------\n");

        
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Kode Booking \t\t:   #" + "1234" + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Nama Pemesan \t:   " + "Restu Arofah" + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        
        fieldStruk.setText(fieldStruk.getText() + "Total Penumpang \t:   " + totalPenumpang + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Harga Satuan \t\t:   " + hargaSatuan + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Sub Total \t\t:   " + subTotal + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Uang Anda \t\t:   " + uangAnda + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "Kembalian \t\t:   " + kembalian + "\n");
        
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        fieldStruk.setText(fieldStruk.getText() + "\n");
        
        fieldStruk.setText(fieldStruk.getText() + "--------------------------------------------------------------------------------------------\n");
        fieldStruk.setText(fieldStruk.getText() + "--------------------------------------------------------------------------------------------\n");
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JTextArea fieldStruk;
    // End of variables declaration//GEN-END:variables
}