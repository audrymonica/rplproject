package com.mycompany.dataanggotawjma;

public class anggotabaru {
    private String nama;
    private String level;
    private String kdanggota;
    private String email;
    private int umur;
    
    public anggotabaru(String nama, String level, String kdanggota, String email, int umur) {
        this.nama = nama;
        this.level = level;
        this.kdanggota = kdanggota;
        this.email = email;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getLevel() {
        return level;
    }
    
    public String getKdanggota() {
        return kdanggota;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setKdanggota(String kdanggota) {
        this.kdanggota = kdanggota;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    @Override
    public String toString (){
        return "Nama Anggota : " +nama+ ", Level : " +level+ ", Kode Anggota : " +kdanggota+ ",Email : " +email+ ",Umur : " +umur;
    }
}
