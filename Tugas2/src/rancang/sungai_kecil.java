/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rancang;

/**
 *
 * @author asus
 */
public class sungai_kecil extends saung_release{
    private String kodeunsur;
    private String shape;
    private String namasungai;
    

    public sungai_kecil() {}

    public sungai_kecil(String kodeunsur, String shape, String namasungai) {
        this.kodeunsur = kodeunsur;
        this.shape = shape;
        this.namasungai = namasungai;
    }

    public String getkodeunsur() {
        return kodeunsur;
    }

    public void setkodeunsur(String kodeunsur) {
        this.kodeunsur = kodeunsur;
    }

    public String getshape() {
        return shape;
    }

    public void setshape(String shape) {
        this.shape = shape;
    }

    public String getnamasungai() {
        return namasungai;
    }

    public void setnamasungai(String namasungai) {
        this.namasungai = namasungai;
    }

    public void cetakinfosungaikecil() {
        System.out.println("KODE UNSUR: " + kodeunsur);
        System.out.println("SHAPE: " + shape);
        System.out.println("NAMA SUNGAI: " + namasungai);
    }
}
