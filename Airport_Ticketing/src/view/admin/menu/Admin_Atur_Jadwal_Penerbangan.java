/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin.menu;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Bandara;
import model.Pesawat;
import model.Rupiah;
import tabel.TabelJadwalPenebanganModel;

/**
 *
 * @author restu
 */
public class Admin_Atur_Jadwal_Penerbangan extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    
    public Admin_Atur_Jadwal_Penerbangan() {
        
        
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

    public JComboBox<String> getTxt_bandara_asal() {
        return txt_bandara_asal;
    }

    public void setTxt_bandara_asal(JComboBox<String> txt_bandara_asal) {
        this.txt_bandara_asal = txt_bandara_asal;
    }

    public JComboBox<String> getTxt_bandara_tujuan() {
        return txt_bandara_tujuan;
    }

    public void setTxt_bandara_tujuan(JComboBox<String> txt_bandara_tujuan) {
        this.txt_bandara_tujuan = txt_bandara_tujuan;
    }

    public JTextField getTxt_cari_nama_pesawat() {
        return txt_cari_nama_pesawat;
    }

    public void setTxt_cari_nama_pesawat(JTextField txt_cari_nama_pesawat) {
        this.txt_cari_nama_pesawat = txt_cari_nama_pesawat;
    }

    public JTextField getTxt_harga() {
        return txt_harga;
    }

    public void setTxt_harga(JTextField txt_harga) {
        this.txt_harga = txt_harga;
    }

    public JLabel getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JLabel txt_id) {
        this.txt_id = txt_id;
    }

    public JComboBox<String> getTxt_kelas_penerbangan() {
        return txt_kelas_penerbangan;
    }

    public void setTxt_kelas_penerbangan(JComboBox<String> txt_kelas_penerbangan) {
        this.txt_kelas_penerbangan = txt_kelas_penerbangan;
    }

    public JDateChooser getTxt_tanggal_penerbangan() {
        return txt_tanggal_penerbangan;
    }

    public void setTxt_tanggal_penerbangan(JDateChooser txt_tanggal_penerbangan) {
        this.txt_tanggal_penerbangan = txt_tanggal_penerbangan;
    }

    public JComboBox<String> getTxt_pesawat() {
        return txt_pesawat;
    }

    public void setTxt_pesawat(JComboBox<String> txt_pesawat) {
        this.txt_pesawat = txt_pesawat;
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
        txt_harga.setText(null);
        txt_id.setText(null);
        txt_cari_nama_pesawat.setText(null);
        txt_bandara_asal.setSelectedIndex(0);
        txt_bandara_tujuan.setSelectedIndex(0);
        txt_kelas_penerbangan.setSelectedIndex(0);
        txt_pesawat.setSelectedIndex(0);
        txt_tanggal_penerbangan.setDate(null);
        ErrorAsal.setText(null);
        ErrorHarga.setText(null);
        ErrorKelas.setText(null);
        ErrorPeswat.setText(null);
        ErrorTanggal.setText(null);
        ErrorTujuan.setText(null);
    }

    public void fillTableJadwalPesawat(TabelJadwalPenebanganModel jadwal) {
        jTable1.setModel(jadwal);
    }
     public void setDataField(){
        int row;
        row = jTable1.getSelectedRow();
        
        if (row != -1){
            try {
                txt_id.setText((String)jTable1.getModel().getValueAt(row, 0));
                txt_tanggal_penerbangan.setDate((Date)jTable1.getModel().getValueAt(row, 1));
                txt_bandara_asal.setSelectedItem((String)jTable1.getModel().getValueAt(row, 2));
                txt_bandara_tujuan.setSelectedItem((String)jTable1.getModel().getValueAt(row, 3));
                txt_pesawat.setSelectedItem((String)jTable1.getModel().getValueAt(row, 4));
                txt_kelas_penerbangan.setSelectedItem((String)jTable1.getModel().getValueAt(row, 5));
                txt_harga.setText((String)jTable1.getModel().getValueAt(row, 6));
            } catch (SecurityException ex) {
                Logger.getLogger(Admin_Atur_Data_Bandara.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
   }
    
    public void fillComboBox(List<Bandara> bandaras, List<Pesawat> pesawats) {
        txt_pesawat.removeAllItems();
        txt_bandara_asal.removeAllItems();
        txt_bandara_tujuan.removeAllItems();
        txt_kelas_penerbangan.removeAllItems();
        
        txt_pesawat.addItem("-");
        txt_bandara_asal.addItem("-");
        txt_bandara_tujuan.addItem("-");
        txt_kelas_penerbangan.addItem("-");
        
        for (Pesawat pesawat : pesawats) {
            txt_pesawat.addItem(pesawat.getKodePesawat()+" - "+pesawat.getNamaPesawat());
        }
        
        for (Bandara bandara : bandaras) {
            txt_bandara_asal.addItem(bandara.getKodeBandara()+" - "+bandara.getNamaBandara());
            txt_bandara_tujuan.addItem(bandara.getKodeBandara()+" - "+bandara.getNamaBandara());
        }
        
        txt_kelas_penerbangan.addItem("Economy");
        txt_kelas_penerbangan.addItem("Business");
        txt_kelas_penerbangan.addItem("First Class");
    }
    
    public boolean validateInput() {
        boolean condition1 = txt_bandara_asal.getSelectedItem() == "-";
        boolean condition2 = txt_bandara_tujuan.getSelectedItem() == "-";
        boolean condition3 = "".equals(txt_harga.getText());
        boolean condition4 = txt_kelas_penerbangan.getSelectedItem() == "-";
        boolean condition5 = txt_pesawat.getSelectedItem() == "-";
        boolean condition6 = txt_tanggal_penerbangan.getDate()== null;
        
        if(condition1 || condition2 || condition3 || condition4 || condition5 || condition6) {
            if (condition1) {
                ErrorAsal.setText("*perlu diisi");
            } else {
                ErrorAsal.setText(null);
            }
            if (condition2) {
                ErrorTujuan.setText("*perlu diisi");
            } else {
                ErrorTujuan.setText(null);
            }
            if (condition3) {
                ErrorHarga.setText("*perlu diisi");
            } else {
                ErrorHarga.setText(null);
            }
            if (condition4) {
                ErrorKelas.setText("*perlu diisi");
            } else {
                ErrorKelas.setText(null);
            }
            if (condition5) {
                ErrorPeswat.setText("*perlu diisi");
            } else {
                ErrorPeswat.setText(null);
            }
            if (condition1) {
                ErrorTanggal.setText("*perlu diisi");
            } else {
                ErrorTanggal.setText(null);
            }
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        moveableFrame = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_kelas_penerbangan = new javax.swing.JComboBox<>();
        txt_bandara_asal = new javax.swing.JComboBox<>();
        txt_bandara_tujuan = new javax.swing.JComboBox<>();
        txt_tanggal_penerbangan = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txt_pesawat = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JLabel();
        ErrorTanggal = new javax.swing.JLabel();
        ErrorAsal = new javax.swing.JLabel();
        ErrorTujuan = new javax.swing.JLabel();
        ErrorPeswat = new javax.swing.JLabel();
        ErrorKelas = new javax.swing.JLabel();
        ErrorHarga = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

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
        jLabel2.setText("Bandara Asal                  :");
        bodyPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 190, 30));

        jLabel5.setBackground(new java.awt.Color(48, 57, 82));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(48, 57, 82));
        jLabel5.setText("Cari Data");
        bodyPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 70, 30));

        txt_cari_nama_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cari_nama_pesawatActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_cari_nama_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 160, 30));

        btnRefresh.setBackground(new java.awt.Color(47, 54, 64));
        btnRefresh.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        bodyPanel.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 90, 30));

        btnSimpan.setBackground(new java.awt.Color(0, 153, 102));
        btnSimpan.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        bodyPanel.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 90, 30));

        btnUbah.setBackground(new java.awt.Color(153, 153, 0));
        btnUbah.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        bodyPanel.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 90, 30));

        btnHapus.setBackground(new java.awt.Color(153, 0, 0));
        btnHapus.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        bodyPanel.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 90, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Atur Jadwal Penerbangan");
        bodyPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel7.setBackground(new java.awt.Color(48, 57, 82));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(48, 57, 82));
        jLabel7.setText("ID                                     :");
        bodyPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 190, 30));

        btnBatal.setBackground(new java.awt.Color(47, 54, 64));
        btnBatal.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        bodyPanel.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 90, 30));

        btnCari.setBackground(new java.awt.Color(47, 54, 64));
        btnCari.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("CARI");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        bodyPanel.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 90, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Bandara Asal", "Bandara Tujuan", "Kelas Penerbangan", "Harga", "Tanggal Penerbangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        bodyPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 430, 390));

        jLabel8.setBackground(new java.awt.Color(48, 57, 82));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(48, 57, 82));
        jLabel8.setText("Bandara Tujuan              :");
        bodyPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 190, 30));

        jLabel9.setBackground(new java.awt.Color(48, 57, 82));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(48, 57, 82));
        jLabel9.setText("Kelas Penerbangan       :");
        bodyPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 190, 30));

        txt_harga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_hargaMouseClicked(evt);
            }
        });
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        txt_harga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_hargaKeyReleased(evt);
            }
        });
        bodyPanel.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 210, 30));

        jLabel10.setBackground(new java.awt.Color(48, 57, 82));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(48, 57, 82));
        jLabel10.setText("Harga                               :");
        bodyPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 30));

        jLabel11.setBackground(new java.awt.Color(48, 57, 82));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(48, 57, 82));
        jLabel11.setText("Tanggal Penerbangan   :");
        bodyPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 190, 30));

        txt_kelas_penerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelas_penerbanganActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_kelas_penerbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 210, 30));

        txt_bandara_asal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bandara_asalActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_bandara_asal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 210, 30));

        bodyPanel.add(txt_bandara_tujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 210, 30));
        bodyPanel.add(txt_tanggal_penerbangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 210, 30));

        jLabel12.setBackground(new java.awt.Color(48, 57, 82));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(48, 57, 82));
        jLabel12.setText("Pesawat                          :");
        bodyPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 190, 30));

        txt_pesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesawatActionPerformed(evt);
            }
        });
        bodyPanel.add(txt_pesawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 210, 30));

        txt_id.setBackground(new java.awt.Color(48, 57, 82));
        txt_id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(48, 57, 82));
        bodyPanel.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 210, 30));

        ErrorTanggal.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorTanggal.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        ErrorAsal.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorAsal.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorAsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        ErrorTujuan.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorTujuan.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        ErrorPeswat.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorPeswat.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorPeswat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        ErrorKelas.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorKelas.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        ErrorHarga.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ErrorHarga.setForeground(new java.awt.Color(255, 51, 51));
        bodyPanel.add(ErrorHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

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

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_pesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pesawatActionPerformed

    private void txt_kelas_penerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelas_penerbanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelas_penerbanganActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        setDataField();
    }//GEN-LAST:event_jTable1MouseClicked

    private void txt_bandara_asalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bandara_asalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bandara_asalActionPerformed

    private void txt_hargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_hargaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaMouseClicked

    private void txt_hargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hargaKeyReleased
        // TODO add your handling code here:
        if (!"".equals(txt_harga.getText())) {
            Rupiah rp = new Rupiah(txt_harga.getText());
            txt_harga.setText(rp.getRupiahString().split(",")[0].replace("//", ""));
        }
    }//GEN-LAST:event_txt_hargaKeyReleased
    
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
            java.util.logging.Logger.getLogger(Admin_Atur_Jadwal_Penerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Jadwal_Penerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Jadwal_Penerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Atur_Jadwal_Penerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorAsal;
    private javax.swing.JLabel ErrorHarga;
    private javax.swing.JLabel ErrorKelas;
    private javax.swing.JLabel ErrorPeswat;
    private javax.swing.JLabel ErrorTanggal;
    private javax.swing.JLabel ErrorTujuan;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel moveableFrame;
    private javax.swing.JComboBox<String> txt_bandara_asal;
    private javax.swing.JComboBox<String> txt_bandara_tujuan;
    private javax.swing.JTextField txt_cari_nama_pesawat;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JLabel txt_id;
    private javax.swing.JComboBox<String> txt_kelas_penerbangan;
    private javax.swing.JComboBox<String> txt_pesawat;
    private com.toedter.calendar.JDateChooser txt_tanggal_penerbangan;
    // End of variables declaration//GEN-END:variables

    
    
    private Object View_Panel_User_ListPenerbangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
