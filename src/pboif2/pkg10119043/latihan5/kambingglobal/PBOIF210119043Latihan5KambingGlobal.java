/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA : FERMI NAUFAL AKBAR
 * KELAS     : IF2 
 * NIM       : 10119043 
 * DESKRIPSI : Program ini berisi program dengan variabel global
 */
public class PBOIF210119043Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // variabel instance
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+ jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119043Latihan5KambingGlobal kambingSusu = new PBOIF210119043Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
