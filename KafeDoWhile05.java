import java.util.Scanner;
public class KafeDoWhile05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String namaPelanggan;
    int kopi, teh, roti;
    int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;
    do {
        System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar) : ");
        namaPelanggan = input.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan");
            break;
        }
        System.out.print("Jumlah kopi: ");
        kopi = input.nextInt();
        System.out.print("Jumlah teh: ");
        teh = input.nextInt();
        System.out.print("Jumlah roti: ");
        roti = input.nextInt();
        
        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("total harga yang harus dibayar: Rp " + totalHarga);
        input.nextLine();

    } while (true);
    System.out.println("Semua transaksi selesai");
}
}
