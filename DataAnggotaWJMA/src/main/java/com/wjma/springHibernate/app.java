/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.wjma.springHibernate;

/**
 *
 * @author asus
 */

import com.wjma.springHibernate.service.MahasiswaService;
import com.wjma.springHibernate.view.MahasiswaView;
import com.wjma.springHibernate.ApplicationContext;
import com.wjma.springHibernate.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = newClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new ViewAnggota().setVisible(true);
    }
    
    public static AnggotaService getMahasiswaService(){
        return(AnggotaService)applicationContext.getBean("AnggotaService");
    }

    public static Object getAnggotaService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
}
