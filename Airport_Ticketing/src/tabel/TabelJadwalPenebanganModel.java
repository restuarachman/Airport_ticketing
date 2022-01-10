/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.JadwalPenerbangan;
import model.Rupiah;

/**
 *
 * @author restu
 */
public class TabelJadwalPenebanganModel extends AbstractTableModel{
    private List<JadwalPenerbangan> list;

    public TabelJadwalPenebanganModel(List<JadwalPenerbangan> list) {this.list = list; }
    
    public JadwalPenerbangan getRow(int row) { return list.get(row); }
    
    @Override
    public int getRowCount() { return list.size(); }
    
    @Override
    public int getColumnCount() { return 7; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return Integer.toString(list.get(rowIndex).getId());
            case 1 : return list.get(rowIndex).getDate(); 
            case 2 : return list.get(rowIndex).getBandaraAsal().getKodeBandara()+" - "+list.get(rowIndex).getBandaraAsal().getNamaBandara();
            case 3 : return list.get(rowIndex).getBandaraTujuan().getKodeBandara()+" - "+list.get(rowIndex).getBandaraTujuan().getNamaBandara();
            case 4 : return list.get(rowIndex).getPesawat().getKodePesawat()+" - "+list.get(rowIndex).getPesawat().getNamaPesawat();
            case 5 : return list.get(rowIndex).getKelas();
            case 6 : return new Rupiah(list.get(rowIndex).getHarga()).getRupiahString();
          
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "ID";
            case 1 : return "Tanggal";
            case 2 : return "Asal";
            case 3 : return "Tujuan";
            case 4 : return "Pesawat";
            case 5 : return "Kelas";
            case 6 : return "Harga";
            
            default : return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
