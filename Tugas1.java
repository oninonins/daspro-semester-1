import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlTiket, tiket = 50000, totalTiket = 0, harga = 0;

        // Perulangan untuk meminta input sampai valid
        while (true) {
            System.out.print("Masukan jumlah tiket yang dibeli : ");
            jmlTiket = input.nextInt();

            // Periksa apakah input valid (tidak negatif)
            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukan lagi.");
                continue;
            }

            // Hitung total tiket yang terjual
            totalTiket += jmlTiket;

            // Hitung total harga penjualan tiket
            if (jmlTiket > 10) {
                harga += (jmlTiket * tiket) * 0.85; // diskon 15%
            } else if (jmlTiket > 4) {
                harga += (jmlTiket * tiket) * 0.90; // diskon 10%
            } else {
                harga += jmlTiket * tiket;
            }

            // Tampilkan hasil
            System.out.println("Total tiket yang terjual: " + totalTiket);
            System.out.println("Total harga penjualan tiket: " + harga);

            // Apakah ingin meminta input lagi?
            System.out.println("Apakah ingin meminta input lagi? (y/n)");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}