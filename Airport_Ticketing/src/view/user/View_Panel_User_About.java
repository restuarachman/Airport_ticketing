/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.user;

import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class View_Panel_User_About extends javax.swing.JFrame {

    /**
     * Creates new form AboutView
     */
    public View_Panel_User_About() {
        initComponents();

//        Set Fixed ukuran Panel
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutPanel = new javax.swing.JPanel();
        copyright1 = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        copyright2 = new javax.swing.JLabel();
        copyright3 = new javax.swing.JLabel();
        copyright4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aboutPanel.setBackground(new java.awt.Color(255, 255, 255));
        aboutPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(48, 57, 82)));
        aboutPanel.setForeground(new java.awt.Color(255, 255, 255));
        aboutPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                aboutPanelComponentHidden(evt);
            }
        });
        aboutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        copyright1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        copyright1.setForeground(new java.awt.Color(48, 57, 82));
        copyright1.setText("Irwan Reza Firmansyah  -  1301194018");
        aboutPanel.add(copyright1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        copyright.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        copyright.setForeground(new java.awt.Color(48, 57, 82));
        copyright.setText("About Us");
        aboutPanel.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(48, 57, 82));
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        aboutPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));

        copyright2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        copyright2.setForeground(new java.awt.Color(48, 57, 82));
        copyright2.setText("Restu Aditya Rachman   -  1301190433");
        aboutPanel.add(copyright2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        copyright3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        copyright3.setForeground(new java.awt.Color(48, 57, 82));
        copyright3.setText("Ramadito Ferdian Assa  -  1301194005");
        aboutPanel.add(copyright3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        copyright4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        copyright4.setForeground(new java.awt.Color(48, 57, 82));
        copyright4.setText("Copyright 2021");
        aboutPanel.add(copyright4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        getContentPane().add(aboutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aboutPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_aboutPanelComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutPanelComponentHidden

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked

    }//GEN-LAST:event_btnCloseMouseClicked

    public JLabel getBtnClose() {
        return btnClose;
    }

    public void setBtnClose(JLabel btnClose) {
        this.btnClose = btnClose;
    }

    public void addListener(MouseListener mouseListener) {
        btnClose.addMouseListener(mouseListener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel copyright1;
    private javax.swing.JLabel copyright2;
    private javax.swing.JLabel copyright3;
    private javax.swing.JLabel copyright4;
    // End of variables declaration//GEN-END:variables

    private View_Panel_User View_Panel_User() {
        return null;
        
    }

    
}
