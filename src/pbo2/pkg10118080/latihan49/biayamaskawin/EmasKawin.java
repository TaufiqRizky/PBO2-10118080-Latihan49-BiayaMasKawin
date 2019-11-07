/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan49.biayamaskawin;

/**
 *
 * @author USER
 */
public class EmasKawin {
    private double mahar;
    private String Nama;
    public final int harga=570000;

    public double getMahar() {
        return mahar;
    }

    public void setMahar(double mahar) {
        this.mahar = mahar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public double total(){
        return this.mahar*this.harga;
    }
   
    
    
    
}
