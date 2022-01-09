package model;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JTextField;

public class Rupiah {
    private int rupiah;

    public Rupiah(int rupiahInt) {
        this.rupiah = rupiahInt;
    }
    
    public Rupiah(String rupiah) {
        rupiah = rupiah.split(",")[0];
        rupiah = rupiah.replaceAll("[Rp.]", "");
        this.rupiah = Integer.parseInt(rupiah);
    }

    public Rupiah(JTextField txtUangAnda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRupiahInt(int rupiahInt) {
        this.rupiah = rupiahInt;
    }

    public int getRupiahInt() {
        return rupiah;
    }
    
    public String getRupiahString() {
        return NumberFormat.getCurrencyInstance(new Locale("id","id")).format(rupiah).split(",")[0];
    }
    
    public String getRupiahNoRp() {
        String str = NumberFormat.getCurrencyInstance(new Locale("id","id")).format(rupiah).split("Rp")[1].split(",00")[0];
        
        return str;
    }
}
