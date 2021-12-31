/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Bandara;

/**
 *
 * @author restu
 */
public class TabelBandaraModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    
    private List<Bandara> list;
    
    public TabelBandaraModel(List<Bandara> list) { this.list = list; }
    
    public Bandara getRow(int row) { return list.get(row); }
    
    @Override
    public int getRowCount() { return list.size(); }
    
    @Override
    public int getColumnCount() { return 2; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return list.get(rowIndex).getKodeBandara(); 
            case 1 : return list.get(rowIndex).getNamaBandara();
          
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "Kode Bandara";
            case 1 : return "Nama Bandara";
            
            default : return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

}
