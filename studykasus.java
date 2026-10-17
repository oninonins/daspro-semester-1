import java.util.Scanner;

public class studykasus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah jenis barang : ");
        int jenis = input.nextInt();

        System.out.print("Masukan jumlah lokasi penyimpanan : ");
        int kota = input.nextInt();

        int[][] stok = new int[jenis][kota] ;
        String[] nama = new String[kota];

        for (int i = 0 ; i < kota; i++) {
            System.out.print("kota untuk lokasi penyimpanan ke-" + (i+1) + " : ");
            nama[i] = input.next();
            
        }


        while (true) {
            System.out.println("Mengisi data stok");
            System.out.print("Jenis barang (0-2) :" );
            int jenisbarang = input.nextInt();
            System.out.print("Lokasi penyimpanan (0-3) : ");
            int lokasipenyimpanan = input.nextInt();
            System.out.print("tambah stok : ");
            int tambahstok = input.nextInt();
            System.out.println("apakah nambah y/n");
            String jawaban = input.next();

            if (jenisbarang < 0 || jenisbarang >= jenis || lokasipenyimpanan < 0 || lokasipenyimpanan >= kota) {
                System.out.println("Error: Indeks tidak valid. Silakan coba lagi.");
                continue;
            }

            if (jawaban.equalsIgnoreCase("y")) {
                stok[jenisbarang][lokasipenyimpanan] += tambahstok;
            }
            else if (jawaban.equalsIgnoreCase("n")) {
                stok[jenisbarang][lokasipenyimpanan] += tambahstok;
                break;
            }
        }
        //kota
        System.out.print("          ");
        for (int i = 0 ; i < kota; i++) {
            System.out.print("       " + nama[i]);
        }
        System.out.println();

        //barang
        for (int i = 0; i < jenis; i++) {
            System.out.print("Barang " + (i+1) + " : ");
            for (int j = 0; j < kota; j++) {
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println("");
        }

        //output stok 
        System.out.println("\nTotal stok untuk setiap jenis barang:");
        for (int i = 0; i < jenis; i++) {
            int totalStok = 0;
            for (int j = 0; j < kota; j++) {
                totalStok += stok[i][j];
            }
            System.out.println("Jenis barang ke-" + (i + 1) + ": " + totalStok);
        }

        System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang:");
        for (int i = 0; i < jenis; i++) {
            int lokasiMax = 0;
            
               
            System.out.println("Jenis barang ke-" + (i + 1) + " memiliki stok terbanyak di kota : " + nama[lokasiMax]);
        }

       
    }
}
