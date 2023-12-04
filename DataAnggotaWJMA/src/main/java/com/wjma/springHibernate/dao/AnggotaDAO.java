/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.dao;

import com.wjma.springHibernate.model.Anggota;
import java.util.List;

public interface AnggotaDAO {
    public void save(Anggota anggota);
    public void update(Anggota anggota);
    public void delete(Anggota anggota);
    public Anggota getAnggota(String npm);
    public List<Anggota> getAnggotas();

}
