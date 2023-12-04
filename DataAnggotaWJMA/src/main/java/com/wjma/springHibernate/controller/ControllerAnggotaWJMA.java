/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.controller;

import com.mycompany.dataanggotawjma.anggotabaru;
import com.wjma.springHibernate.app;
import com.wjma.springHibernate.configuration.AnggotaTableModel;
import com.wjma.springHibernate.model.Anggota;
import com.wjma.springHibernate.view.ViewAnggota;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerAnggotaWJMA {
    private final ViewAnggota ViewAnggota;
    private AnggotaTableModel anggotaTableModel;
    private List<anggotabaru> anggotas;
    
    public ControllerAnggotaWJMA ViewAnggota ViewAnggota) {
        this.ViewAnggota = ViewAnggota;
    }

    public ControllerAnggotaWJMA(EntryData aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tampilData() {
	Anggota = app.getAnggotaService().getanggotas();
	anggotaTableModel = new AnggotaTableModel(anggotas);	
	this.ViewAnggota.getTabel().setModel(anggotaTableModel);
    }
    
    public void show() {
	int index = this.ViewAnggota.gettablelist().getSelectedRow();
	this.ViewAnggota.getNama().setText(String.valueOf(
	this.ViewAnggota.getTabel().getValueAt(index, 0)));
	this.ViewAnggota.getLevel().setText(String.valueOf(
	this.ViewAnggota.getTabel().getValueAt(index, 1)));
	this.ViewAnggota.getKdanggota().setText(String.valueOf(
	this.ViewAnggota.getTabel().getValueAt(index, 2)));
	this.ViewAnggota.getEmail().setText(String.valueOf(
	this.ViewAnggota.getTabel().getValueAt(index, 3)));
        this.ViewAnggota.getUmur().setText(String.valueOf(
	this.ViewAnggota.getTabel().getValueAt(index, 3)));
    }
    
    public void clear() {
	this.ViewAnggota.getNama().setText("");
	this.ViewAnggota.getLevel().setText("");
	this.ViewAnggota.getKdanggota().setText("");
	this.ViewAnggota.getEmail().setText("");
        this.ViewAnggota.getUmur().setText("");
    }
    
    public void saveAnggota() {
	Anggota anggota = new Anggota();
	anggota.setNama(this.ViewAnggota.getNpm().getText());
	anggota.setLevel(this.ViewAnggota.getNama().getText());
	anggota.setKdanggota(this.ViewAnggota.getKelas().getText());
	anggota.setEmail(this.ViewAnggota.getAlamat().getText());
        anggota.setUmur(this.ViewAnggota.getAlamat().getText());
	app.getAnggotaService().save(anggota);
	JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan", "info",
	JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateAnggota() {
	Anggota anggota = new Anggota();
	anggota.setNama(this.ViewAnggota.getNpm().getText());
	anggota.setLevel(this.ViewAnggota.getNama().getText());
	anggota.setKdanggota(this.ViewAnggota.getKelas().getText());
	anggota.setEmail(this.ViewAnggota.getAlamat().getText());
        anggota.setUmur(this.ViewAnggota.getAlamat().getText());
	app.getAnggotaService().update(anggota);
	JOptionPane.showMessageDialog(null, "Data Berhasil di Edit", "info",
	JOptionPane.INFORMATION_MESSAGE);
	clear();
	tampilData();
    }
    
    public void deleteAnggota(){
        if(this.ViewAnggota.getKdanggota().getText() == null){
            JOptionPane.showMessageDialog(null, "Mahasiswa belum dipilih", "error",JOptionPane.ERROR_MESSAGE);
        }else{
            Anggota anggota = new anggota();
            anggota.setNpm(this.ViewAnggota.getNpm().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(pilih == JOptionPane.YES_OPTION){
                app.getAnggotaService().delete(anggota);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }






}
