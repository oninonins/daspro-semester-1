import java.util.Scanner;

public class Kafe05 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
    float diskon = 10 / 100f;

    System.out.print("Masukan keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukan jumlah pembelian kopi: ");
    jmlKopi = input.nextInt();
    System.out.print("Masukan jumlah pembelian teh: ");
    jmlTeh = input.nextInt();
    System.out.print("Masukan jumlah pembelian roti: ");
    jmlRoti = input.nextInt();

    totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
    nominalBayar = totalHarga - (diskon * totalHarga);
    byte totalByte = (byte) totalHarga;
    int nominalInt = (int) nominalBayar;
    System.out.println("keanggotaan pelanggan" + keanggotaan);
    System.out.println("item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti"); 
    System.out.println("Nominal bayar (int): Rp " + nominalInt);
    System.out.println("Total harga (byte): Rp " + totalByte);

}
}
