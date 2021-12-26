/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import view.user.*;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import view.View_Login;
import view.user.dialog.dialogFrame_Penerbangan_notFound;

/**
 *
 * @author restu
 */
public class View_Panel_Admin extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    private User user;
    public View_Panel_Admin(User user) {
        this.user = user;
        
        System.out.println(user.getUsername());
        
        initComponents();
        username.setText(user.getUsername());
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
        btnAddPlane = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnHome3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDashboard1 = new javax.swing.JButton();
        btnEditPanel = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();
        AddPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnCariPenerbangan1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        EditPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCariPenerbangan = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();

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

        btnAddPlane.setBackground(new java.awt.Color(47, 54, 64));
        btnAddPlane.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnAddPlane.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPlane.setText("ADD PLANE");
        btnAddPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaneActionPerformed(evt);
            }
        });
        menuPanel.add(btnAddPlane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 164, 53));

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

        btnEditPanel.setBackground(new java.awt.Color(47, 54, 64));
        btnEditPanel.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnEditPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnEditPanel.setText("EDIT");
        btnEditPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPanelActionPerformed(evt);
            }
        });
        menuPanel.add(btnEditPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 164, 53));

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

        AddPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(48, 57, 82));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 57, 82));
        jLabel9.setText("EDIT ");
        AddPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        jLabel10.setBackground(new java.awt.Color(48, 57, 82));
        jLabel10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 57, 82));
        jLabel10.setText("Detail Penerbangan");
        AddPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 83, -1, -1));

        jLabel14.setBackground(new java.awt.Color(48, 57, 82));
        jLabel14.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(48, 57, 82));
        jLabel14.setText("Nama Pesawat");
        AddPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 149, -1, -1));

        jLabel15.setBackground(new java.awt.Color(48, 57, 82));
        jLabel15.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(48, 57, 82));
        jLabel15.setText("Ke");
        AddPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel16.setBackground(new java.awt.Color(48, 57, 82));
        jLabel16.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(48, 57, 82));
        jLabel16.setText("Slot Kursi");
        AddPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        btnCariPenerbangan1.setBackground(new java.awt.Color(47, 54, 64));
        btnCariPenerbangan1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnCariPenerbangan1.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPenerbangan1.setText("Tambah Penerbangan");
        btnCariPenerbangan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariPenerbangan1MouseClicked(evt);
            }
        });
        btnCariPenerbangan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPenerbangan1ActionPerformed(evt);
            }
        });
        AddPanel.add(btnCariPenerbangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 190, 60));

        jLabel17.setBackground(new java.awt.Color(48, 57, 82));
        jLabel17.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(48, 57, 82));
        jLabel17.setText("Kelas Pesawat");
        AddPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel18.setBackground(new java.awt.Color(48, 57, 82));
        jLabel18.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(48, 57, 82));
        jLabel18.setText("Dari");
        AddPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AddPanel.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AddPanel.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 70, -1));
        AddPanel.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, -1));

        jLabel19.setBackground(new java.awt.Color(48, 57, 82));
        jLabel19.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(48, 57, 82));
        jLabel19.setText("Jadwal Penerbangan");
        AddPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AddPanel.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 70, -1));

        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        AddPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        AddPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        DynamicPanel.add(AddPanel, "card2");

        EditPanel.setBackground(new java.awt.Color(255, 255, 255));
        EditPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(48, 57, 82));
        jLabel2.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 57, 82));
        jLabel2.setText("EDIT ");
        EditPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, -1, -1));

        jLabel5.setBackground(new java.awt.Color(48, 57, 82));
        jLabel5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 57, 82));
        jLabel5.setText("Detail Penerbangan");
        EditPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 83, -1, -1));

        jLabel6.setBackground(new java.awt.Color(48, 57, 82));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(48, 57, 82));
        jLabel6.setText("Nama Pesawat");
        EditPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 149, -1, -1));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("Ke");
        EditPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Slot Kursi");
        EditPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        btnCariPenerbangan.setBackground(new java.awt.Color(47, 54, 64));
        btnCariPenerbangan.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        btnCariPenerbangan.setForeground(new java.awt.Color(255, 255, 255));
        btnCariPenerbangan.setText("Edit Penerbangan");
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
        EditPanel.add(btnCariPenerbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 190, 60));

        jLabel11.setBackground(new java.awt.Color(48, 57, 82));
        jLabel11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(48, 57, 82));
        jLabel11.setText("Kelas Pesawat");
        EditPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel12.setBackground(new java.awt.Color(48, 57, 82));
        jLabel12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(48, 57, 82));
        jLabel12.setText("Dari");
        EditPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EditPanel.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EditPanel.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 70, -1));
        EditPanel.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 150, -1));

        jLabel13.setBackground(new java.awt.Color(48, 57, 82));
        jLabel13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(48, 57, 82));
        jLabel13.setText("Jadwal Penerbangan");
        EditPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EditPanel.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 70, -1));

        jTextField3.setText("jTextField1");
        EditPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EditPanel.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        DynamicPanel.add(EditPanel, "card2");

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

    private void btnAddPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaneActionPerformed
        // TODO add your handling code here:

        // remove panel
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();

        // add panel
        DynamicPanel.add(AddPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
    }//GEN-LAST:event_btnAddPlaneActionPerformed

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
        this.setVisible(false);
//        View_Panel_User_ListPenerbangan frameListPenerbangan = new View_Panel_User_ListPenerbangan();
//        frameListPenerbangan.setVisible(true);
        
        dialogFrame_Penerbangan_notFound frame = new dialogFrame_Penerbangan_notFound();
        frame.setVisible(true);
        
    }//GEN-LAST:event_btnCariPenerbanganActionPerformed

    private void btnCariPenerbanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariPenerbanganMouseClicked
        // TODO add your handling code here:
        
        
//        this.setVisible(false);
    }//GEN-LAST:event_btnCariPenerbanganMouseClicked

    private void btnEditPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPanelActionPerformed
        // TODO add your handling code here:
         // remove panel
        DynamicPanel.removeAll();
        DynamicPanel.repaint();
        DynamicPanel.revalidate();

        // add panel
        DynamicPanel.add(EditPanel);
        DynamicPanel.repaint();
        DynamicPanel.revalidate();
    }//GEN-LAST:event_btnEditPanelActionPerformed

    private void btnCariPenerbangan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariPenerbangan1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariPenerbangan1MouseClicked

    private void btnCariPenerbangan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPenerbangan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariPenerbangan1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(View_Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Panel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new View_Panel_Admin(new User("username","username")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel EditPanel;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnAddPlane;
    private javax.swing.JButton btnCariPenerbangan;
    private javax.swing.JButton btnCariPenerbangan1;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDashboard1;
    private javax.swing.JButton btnEditPanel;
    private javax.swing.JButton btnHome3;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel moveableFrame;
    private javax.swing.JLabel username;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAbout() {
        return btnAbout;
    }

    public void setBtnAbout(JButton btnAbout) {
        this.btnAbout = btnAbout;
    }

    public JPanel getDynamicPanel() {
        return DynamicPanel;
    }

    public JPanel getDashboardPanel() {
        return dashboardPanel;
    }

    public User getUser() {
        return user;
    }

    
    
    private Object View_Panel_User_ListPenerbangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}