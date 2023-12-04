/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.service;

import com.wjma.springHibernate.service.service.model.Mahasiswa;
import java.util.List;

public interface AnggotaService {
    public void save(Anggota anggota);
    public void update(Anggota anggota);
    public void delete(Anggota anggota);
    public Anggota getAnggota(String npm);
    public List<anggotabaru> getAnggotas();
}
