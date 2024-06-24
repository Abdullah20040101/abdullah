/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author asus
 */

public class berita {
    private String idberita;
    private String judul;
    private String isiberita;
    private String tglberita;

    public berita() {}

    public berita(String idberita, String judul, String isiberita, String tglberita) {
        this.idberita = idberita;
        this.judul = judul;
        this.isiberita = isiberita;
        this.tglberita = tglberita;
    }

    public String getidberita() {
        return idberita;
    }

    public void setidberita(String idberita) {
        this.idberita = idberita;
    }

    public String getjudul() {
        return judul;
    }

    public void setjudul(String judul) {
        this.judul = judul;
    }

    public String getisiberita() {
        return isiberita;
    }

    public void setisiberita(String isiberita) {
        this.isiberita = isiberita;
    }

    public String gettglberita() {
        return tglberita;
    }

    public void settglberita(String tglberita) {
        this.tglberita = tglberita;
    }

    public void cetakinfoberita() {
        System.out.println("ID BERITA : " + idberita);
        System.out.println("JUDUL: " + judul);
        System.out.println("ISI BERITA: " + isiberita);
        System.out.println("TANGGAL BERITA: " + tglberita);
    }
}