/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Booking;
import model.JadwalPenerbangan;

/**
 *
 * @author restu
 */
public class TabelBookingModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    
    private List<Booking> list;

    public TabelBookingModel(List<Booking> list) {
        this.list = list;
    }

    public Booking getRow(int row) { return list.get(row); }
    
    @Override
    public int getRowCount() { return list.size(); }
    
    @Override
    public int getColumnCount() { return 4; }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return Integer.toString(list.get(rowIndex).getId());
            case 1 : return list.get(rowIndex).getCustomer().getNama(); 
            case 2 : return list.get(rowIndex).getCustomer().getNomor_hp();
            case 3 : return Integer.toString(list.get(rowIndex).getJumlahPenumpang());
          
            default : return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "ID Booking";
            case 1 : return "Nama Pemesan";
            case 2 : return "Nomor HP";
            case 3 : return "Jumlah Penumpang";
            
            default : return null;
        }
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
