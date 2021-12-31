/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.JadwalPenerbangan;

/**
 *
 * @author restu
 */
public class TabelPilihPesawat extends AbstractTableModel{
    private static final long serialVersionUID = 1L;
    
    private List<JadwalPenerbangan> list;

    public TabelPilihPesawat(List<JadwalPenerbangan> list) {
        this.list = list;
    }
    
    public JadwalPenerbangan getRow(int row) { return list.get(row); }
    
    @Override
    public int getRowCount() { return list.size(); }
    
    @Override
    public int getColumnCount() { return 4; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return list.get(rowIndex).getPesawat().getKodePesawat();
            case 1 : return list.get(rowIndex).getPesawat().getNamaPesawat(); 
            case 2 : return Integer.toString(list.get(rowIndex).getHarga());
            case 3 : return list.get(rowIndex).getKelas();
          
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "Kode";
            case 1 : return "Nama";
            case 2 : return "Harga";
            case 3 : return "Kelas";
            
            default : return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
