package jobsheet7;

import java.util.Scanner;

public class JOBSHEET7 {
    
    public static void main(String[] args) {
       String identitas = "Yulius Jati Satrito Utomo / XRPL2 / 41";
       System.out .println("identitas : "+ identitas);
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nilai a ?");
       int a = scanner.nextInt();
       
       System.out.println("\nIF.. 1");
       if(a < 5) System.out.println("nilai a kurang dari 5");
       
       System.out.println("\nIF.. 2");
       if(a == 5)
           System.out.println("nilai a sma dengan 5");
       
       System.out.println("\nIF.. 3");
       if(a > 5) {
           System.out.println("isi variable a : "+ a);
           System.out.println("nilai a lebih dari 5");
       }
       System.out.println("\nIF..ELSE..");
       if(a < 5){
           System.out.println("isi variable a : "+ a);
           System.out.println("nilai a kurang dari 5");
       } else System.out.println("nilai a lebih dari atau sama dengan 5");
       
       System.out.println("\nIF..ELSE IF..ELSE.. 1");
       if(a < 5) {
           System.out.println("nilai a kurang dari 5");
       } else if(a == 5) {
           System.out.println("nilai a sama dengan 5");
       } else
           System.out.println("nilai a lebih dari 5");
       
       System.out.println("\nIF..ELSE IF..ELSE.. 2");
       if(a < 2) {
           System.out.println("nilai a kurang dari 2");
       } else if(a < 4) {
           System.out.println("nilai a kurang dari 4");
       } else if(a < 6) {
           System.out.println("nilai a kurang dari 6");
       } else if(a == 6) {
           System.out.println("nilai a sama dengan 6");
       } else {
           
       }
       
    }
         
}



    