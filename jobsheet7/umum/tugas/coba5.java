import java.util.Scanner;


public class coba5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (jumlah elemen deret): ");
        int n = input.nextInt();
        
        int angka = 3; 
        int penambahan = 1; 
        
        System.out.print("Deret angka: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(angka + " ");
            angka += penambahan; 
            penambahan += 2; 
        }
    }
}
    
    
    
    