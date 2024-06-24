/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author asus
 */
public class saung_release {
    private String idrelease;
    private String judul;
    private String kategori;
    private String tglrelease;
    private String isirelease;

    public saung_release() {}

    public saung_release(String idrelease, String judul, String kategori, String tglrelease, String isirelease) {
        this.idrelease = idrelease;
        this.judul = judul;
        this.kategori = kategori;
        this.tglrelease = tglrelease;
        this.isirelease = isirelease;
    }

    public String getidrelease() {
        return idrelease;
    }

    public void setidrelease(String idrelease) {
        this.idrelease = idrelease;
    }

    public String getjudul() {
        return judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getkategori() {
        return kategori;
    }

    public void setkategori(String kategori) {
        this.kategori = kategori;
    }

    public String gettglrelease() {
        return tglrelease;
    }

    public void settglrelease(String tglrelease) {
        this.tglrelease = tglrelease;
    }
    
     public String getisirelease() {
        return isirelease;
    }

    public void setisirelease(String isirelease) {
        this.isirelease = isirelease;
    }
    
    

    public void cetakinfosaungrelease() {
        System.out.println("ID RELEASE : " + idrelease);
        System.out.println("JUDUL: " + judul);
        System.out.println("KATEGORI: " + kategori);
        System.out.println("TANGGAL RELEASE: " + tglrelease);
        System.out.println("ISI RELEASE: " + isirelease);
    }  
}
