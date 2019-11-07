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
public class PBO210118080Latihan49BiayaMasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmasKawin ek = new EmasKawin();
        ek.setNama("Hendi");
        ek.setMahar(15.7);
        System.out.println("Nama            : "+ek.getNama());
        System.out.println("Mahar           : "+ek.getMahar()+" gram");
        System.out.println("Harga Emas/gr   : Rp "+ek.harga);
        System.out.println("Total Harga     : Rp "+ek.total());
    }
    
}
