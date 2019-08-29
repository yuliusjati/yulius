package operatoraritmatika2;

public class operatorbitwise {
    public static void main(String[]args) {
        int x = 12; // dikonversi ke biner = 0000 1100
        int y = 20; // dikonversi ke biner = 0001 0100
        
        int z;
        z = x | y;
        System.out.println("Hasil operasi bitwise OR: " + z);
        
        z = x & y;
        System.out.println("Hasil operasi bitwise AND: " + z);
        
        z = x ^ y;
        System.out.println("Hasil operasi bitwise XOR: " + z);
        
        z = ~x;
        System.out.println("Hasil operasi bitwise NOT: " + z);
        
        z = x << 3;
        System.out.println("Hasil operasi bitwise ahift left: " + z);
        
        z = y >> 2;
        System.out.println("Hasil operasi bitwise shift right: " + z);

    } 
        
}
