


package com.mycompany.dataanggotawjma;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerAnggotaWJMA {
    ArrayList<anggotabaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerAnggotaWJMA(){
        ArrayData = new ArrayList<>();
    }
    
    public void InsertData (String nama, String level, String kdanggota, String email, int umur){
        anggotabaru mbr = new anggotabaru(nama, level, kdanggota, email, umur);
        ArrayData.add(mbr);
    }
    
    public boolean updateData(int index, String nama, String level, String kdanggota, String email, int umur) {
        if (index >= 0 && index < ArrayData.size()) {
            anggotabaru mbr = ArrayData.get(index);
            mbr.setNama(nama);
            mbr.setLevel(level);
            mbr.setKdanggota(kdanggota);
            mbr.setEmail(email);
            mbr.setUmur(umur);
            return true;
        }
        return false;
    }

    public boolean deleteData(int index) {
        if (index >= 0 && index < ArrayData.size()) {
            ArrayData.remove(index);
            return true;
        }
        return false;
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Nama", "Level", "Kode Anggota", "Email", "Umur"};
        Object[][] objData = new Object [ArrayData.size()][5];
        int x = 0;
        
        for (anggotabaru mbr : ArrayData){
            String[] arrData = {mbr.getNama(), mbr.getLevel(), mbr.getKdanggota(), mbr.getEmail(), String.valueOf(mbr.getUmur())};
            objData[x] = arrData;
            x++;
        }
        
        tablelist = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        return tablelist;
    }
}
