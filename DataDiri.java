/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class DataDiri {
    
    public static void main(String[]args) {
        // membuat variabel
       String nama, alamat, motto;
       int usia;
       double tinggi;
    
       // mengisi variable
       nama = "ANJING GALAK";
       alamat = "PINGGIR JALAN";
       motto = "sehat itu simple kuncinya cuma satu jangan sakit";
       usia = 2;
       tinggi = 30;
       
       // mencetak ke layar isi variabel
       System.out.println("Nama: " + nama);
       System.out.println("Alamat: " + alamat);
       System.out.println("motto: " + motto);
       System.out.println("Usia: " + usia + "tahun");
       System.out.println("Tinggi: " + tinggi + "cm");
    }
}