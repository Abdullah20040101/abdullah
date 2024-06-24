/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;
import curd.*;
import rancang.bukutamu;
import rancang.berita;
import rancang.saung_release;
import rancang.sungai_kecil;
import gui.frameUtama;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        new frameUtama().setVisible(true);
        
        //Scanner input = new Scanner(System.in);
        //database db =new database();
        
        //db.simpansaungrelease("2", "kesukaann", "n", "2004-01-03", "4");
        //db.ubahsaungrelease("1", "kematian", "2", "2003-01-01", "7");
       //db.hapussaungrelease("1");
       
       //db.simpansungaikecil("1", "mantap", "sungai pitung");
       //db.ubahsungaikecil("1", "mantapppp", "sungai pitung");
       //db.hapussungaikecil("2");
        
        //db.simpanBerita("2", "kematian" , "berita3" , "2005-01-03");
        // db.ubahBerita("1", "kehancuran" , "berita2" , "2006-01-03");
        // db.hapusBerita("2");
       
        //db.simpanTamu("2", "Abdullah", "Abdullah88@gmail.com", "2004-01-02", "06:00", "jangan terlambat lagi");
        //db.ubahTamu("1", "Abdullah", "Abdullah88@gmail.com", "2003-02-09", "07:00", "nanti seperti ini datangnya");
        //db.hapusTamu("2");
        
        //db.cariberita("1");
        
        //db.caritamu("1");
        
        //db.databerita();
        
        //db.datatamu();
        
        //db.carisaungrelease("2");
        //db.datasaungrelease();
        
        //db.carisungaikecil("1");
       //db.datasungaikecil();
        
   

        // Input untuk kelas berita
        /* System.out.println("== Input Data Berita ==");
        System.out.println("\nMasukkan ID Berita: ");
        String idberita = input.nextLine();

        System.out.println("Masukkan Judul Berita: ");
        String judul = input.nextLine();

        System.out.println("Masukkan Isi Berita: ");
        String isiberita = input.nextLine();

        System.out.println("Masukkan Tanggal Berita: ");
        String tglberita = input.nextLine();

        // Membuat objek berita
        berita beritaObjek = new berita(idberita, judul, isiberita, tglberita);
        beritaObjek.cetakinfoberita();
        
        // Input untuk kelas bukutamu
        System.out.println("== Input Data buku tamu ==");
        System.out.println("\nMasukkan ID Tamu: ");
        String idtamu = input.nextLine();

        System.out.println("Masukkan Email Tamu: ");
        String email = input.nextLine();

        System.out.println("Masukkan Tanggal Masuk: ");
        String tglmasuk = input.nextLine();

        System.out.println("Masukkan Jam Masuk: ");
        String jammasuk = input.nextLine();

        System.out.println("Masukkan Komentar: ");
        String komentar = input.nextLine();

        // Membuat objek bukutamu
        bukutamu bukutamuObjek = new bukutamu(idtamu, email, tglmasuk, jammasuk, komentar);
        bukutamuObjek.cetakinfobukutamu();
        
         // Menampilkan informasi berita
        System.out.println("=================");
        System.out.println("Informasi berita:");
        System.out.println("=================");
        System.out.println("ID berita: " + beritaObjek.getidberita());
        System.out.println("judul: " + beritaObjek.getjudul());
        System.out.println("isi berita: " + beritaObjek.getisiberita());
        System.out.println("tanggal berita: " + beritaObjek.gettglberita());
        
        //menampilkan informasi buku tamu
        System.out.println("=================");
        System.out.println("Informasi buku tamu:");
        System.out.println("=================");
        System.out.println("ID tamu: " + bukutamuObjek.getidtamu());
        System.out.println("email: " + bukutamuObjek.getemail());
        System.out.println("tanggal masuk: " + bukutamuObjek.gettglmasuk());
        System.out.println("jam masuk: " + bukutamuObjek.getjammasuk());
        System.out.println("komentar: " + bukutamuObjek.getkomentar()); */
        
        // Input untuk kelas saung_release
        /* System.out.println("== Input Data saung release ==");
        System.out.println("\nMasukkan ID release: ");
        String idrelease = input.nextLine();

        System.out.println("Masukkan Judul : ");
        String judul = input.nextLine();

        System.out.println("Masukkan kategori: ");
        String kategori = input.nextLine();

        System.out.println("Masukkan Tanggal release: ");
        String tglrelease = input.nextLine();
        
        System.out.println("Masukkan isi release: ");
        String isirelease = input.nextLine();

        // Membuat objek saung_release
        saung_release saungreleaseObjek = new saung_release(idrelease, judul, kategori, tglrelease, isirelease);
        saungreleaseObjek.cetakinfosaungrelease();
        
        // Input untuk kelas sungai_kecil
        System.out.println("== Input Data sungai kecil ==");
        System.out.println("\nMasukkan kode unsur: ");
        String kodeunsur = input.nextLine();

        System.out.println("Masukkan shape: ");
        String shape = input.nextLine();

        System.out.println("Masukkan nama sungai: ");
        String namasungai = input.nextLine();

        // Membuat objek sungai_kecil
        sungai_kecil sungaikecilObjek = new sungai_kecil(kodeunsur, shape, namasungai);
        sungaikecilObjek.cetakinfosungaikecil();
        
         // Menampilkan informasi saung_release
        System.out.println("=================");
        System.out.println("Informasi saung release:");
        System.out.println("=================");
        System.out.println("ID release: " + saungreleaseObjek.getidrelease());
        System.out.println("judul: " + saungreleaseObjek.getjudul());
        System.out.println("kategori: " + saungreleaseObjek.getkategori());
        System.out.println("tanggal release: " + saungreleaseObjek.gettglrelease());
        System.out.println("isi release: " + saungreleaseObjek.getisirelease());
        
        //menampilkan informasi sungai_kecil
        System.out.println("=================");
        System.out.println("Informasi sungai kecil:");
        System.out.println("=================");
        System.out.println("ID tamu: " + sungaikecilObjek.getkodeunsur());
        System.out.println("email: " + sungaikecilObjek.getshape());
        System.out.println("tanggal masuk: " + sungaikecilObjek.getnamasungai()); */
    
}
}

       
   
        
        
