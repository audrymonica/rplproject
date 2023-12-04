/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wjma.springHibernate.dao;

import com.wjma.springHibernate.model.anggotabaru;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class AnggotaDAOImpl implements AnggotaDAO {
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(anggotabaru anggota) {
	sessionFactory.getCurrentSession().save(mahasiswa);
    }
    
    @Override
    public void update(anggotabaru anggota) {
	sessionFactory.getCurrentSession().update(mahasiswa);
    }
    
    @Override
    public void delete(anggotabaru anggota) {
	sessionFactory.getCurrentSession().delete(mahasiswa);
    }
    
    @Override
    public anggotabaru getAnggota(String npm) {
	return (anggotabaru) sessionFactory.getCurrentSession().get(anggotabaru.class, npm);
    }
    
    @Override
    public List<anggotabaru> getAnggotas() {
	return sessionFactory.getCurrentSession().createCriteria(anggotabaru.class).list();
    }

}
