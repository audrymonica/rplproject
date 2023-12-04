// VERSI DUA

package com.mycompany.dataanggotawjma;

import com.mycompany.dataanggotawjma.anggotabaru;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataAnggotaWJMA {
    public static void main(String[] args) {
        List<anggotabaru> daftarAnggota = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Tambah Data Anggota Baru (y/n) : ");
            String jawaban = input.nextLine();
            
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.print("Nama Anggota : ");
            String nama = input.nextLine();
            
            System.out.print("Level : ");
            String level = input.nextLine();
            
            System.out.print("Kode Anggota : ");
            String kdanggota = input.nextLine();
            
            System.out.print("Email : ");
            String email = input.nextLine();
            
            System.out.print("Umur : ");
            int umur = input.nextInt();
            input.nextLine();
            
            anggotabaru anggota = new anggotabaru(nama, level, kdanggota, email, umur);
            daftarAnggota.add(anggota);
        }
        System.out.println("======DAFTAR ANGGOTA WJMA====== ");
        for (anggotabaru anggota: daftarAnggota){
            System.out.println(anggota);
        }
    }
}
