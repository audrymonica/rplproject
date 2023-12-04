/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.service;

import com.wjma.springHibernate.dao.AQnggotaDAO;
import com.wjma.springHibernate.model.Anggota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AnggotaService")
@Transactional(readOnly = true)

public class AnggotaServiceImpl implements AnggotaService {
    @Autowired
    private anggotaDAO anggotaDao;
    
    @Transactional
    @Override
    public void save(Anggota anggota) {
	anggotaDao.save(anggota);
    }
    
    @Transactional
    @Override
    public void update(Anggota anggota) {
	anggotaDao.update(anggota);
    }
    
    @Transactional
    @Override
    public void delete(Anggota anggota) {
	anggotaDao.delete(anggota);
    }
    
    @Override
    public Anggota getAnggota(String npm) {
	return anggotaDao.getAnggota(npm);
    }
    
    @Override
    public List<anggotabaru> getAnggotas() {
	return anggotaDao.getAnggotas();
    }
}
