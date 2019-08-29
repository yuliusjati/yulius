package jobsheet8;

import java.util.Scanner;

public class jobsheet8tugas {
      public static void main(String[] args) {

      String golonganA, golonganB, golonganC;
      double total, biaya, pajak;
      
       Scanner baca = new Scanner(System.in);
       int Pemakaian = baca.nextInt();
       
       if (Pemakaian <= 450) {
           System.out.println("Golongan C");
           biaya = (Pemakaian * 1000) + 20000;
           System.out.println("Biaya = Rp." + biaya);
           pajak = (Pemakaian +(biaya * 10/100)) ;
           System.out.println("Pajak = Rp." + pajak);
           
                           
       } else if (Pemakaian <= 900) {
           System.out.println("Golongan B");
           biaya = Pemakaian * 2500 + 35000;
           System.out.println("Biaya = Rp." + biaya);
           pajak = (Pemakaian +(biaya * 15/100)) ;
           System.out.println("Pajak = Rp." + pajak);

         } else if (Pemakaian <= 1200) {
             System.out.println("Golongan A");
             biaya = Pemakaian * 3000 + 50000;
             System.out.println("Biaya = Rp." + biaya);
             pajak = (Pemakaian +(biaya * 20/100)) ;
             System.out.println("Pajak = Rp." + pajak);
           
       } 
           
               
      }
       
        




    }

      

