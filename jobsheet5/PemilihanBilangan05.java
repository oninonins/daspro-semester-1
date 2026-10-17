import java.util.Scanner;

public class PemilihanBilangan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " termasuk bilangan " + hasil + ".");

       
    }
}