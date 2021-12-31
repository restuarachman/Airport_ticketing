/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pesawat;

/**
 *
 * @author restu
 */
public class TabelPesawatModel extends AbstractTableModel{
    private static final long serialVersionUID = 1L;
    
    private List<Pesawat> list;
    
    public TabelPesawatModel(List<Pesawat> list) { this.list = list; }
    
    public Pesawat getRow(int row) { return list.get(row); }
    
    @Override
    public int getRowCount() { return list.size(); }
    
    @Override
    public int getColumnCount() { return 3; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return Integer.toString(list.get(rowIndex).getId());
            case 1 : return list.get(rowIndex).getKodePesawat(); 
            case 2 : return list.get(rowIndex).getNamaPesawat();
          
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "ID";
            case 1 : return "Kode Pesawat";
            case 2 : return "Nama Bandara";
            
            default : return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
