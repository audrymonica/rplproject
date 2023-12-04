/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anggotawjma")

public class anggotabaru {
    @Id
    @Column(name = "nama", length = 8)
    private String nama;

    @Column(name = "level", length = 50)
    private String level;

    @Column(name = "kode anggota", length = 10)
    private String kdanggota;

    @Column(name = "email", length = 150)
    private String email;
    
    @Column(name = "umur", length = 150)
    private int umur;

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

}
