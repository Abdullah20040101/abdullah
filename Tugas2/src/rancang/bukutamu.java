/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author asus
 */
public class bukutamu extends berita{
    private String idtamu;
    private String email;
    private String tglmasuk;
    private String jammasuk;
    private String komentar;

    public bukutamu() {}

    public bukutamu(String idtamu, String email, String tglmasuk, String jammasuk, String komentar) {
        this.idtamu = idtamu;
        this.email = email;
        this.tglmasuk = tglmasuk;
        this.jammasuk = jammasuk;
        this.komentar = komentar;
    }

    public String getidtamu() {
        return idtamu;
    }

    public void setidtamu(String idtamu) {
        this.idtamu = idtamu;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String gettglmasuk() {
        return tglmasuk;
    }

    public void settglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String getjammasuk() {
        return jammasuk;
    }

    public void setjammasuk(String jammasuk) {
        this.jammasuk = jammasuk;
    }

    public String getkomentar() {
        return komentar;
    }

    public void setkomentar(String komentar) {
        this.komentar = komentar;
    }

    public void cetakinfobukutamu() {
        System.out.println("ID TAMU: " + idtamu);
        System.out.println("EMAIL: " + email);
        System.out.println("TANGGAL MASUK: " + tglmasuk);
        System.out.println("JAM MASUK: " + jammasuk);
        System.out.println("KOMENTAR: " + komentar);
    }
}