/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan54.koordinat;

/**
 *
 * @author       
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas : Koordinat
 */
public class PBO2_10118083_Latihan54_Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "
                + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    }
    
}
