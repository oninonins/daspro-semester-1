import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Minta jumlah nama makanan yang akan diinput
        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahpesan = input.nextInt();
        input.nextLine();

       

        // Buat array untuk menampung nama-nama makanan
        String[] daftarMakanan = new String[jumlahpesan];
        double[] hargaMakanan = new double[jumlahpesan];
        
        //tampung harga pesanan
        for (int  i = 0; i < jumlahpesan; i++) {
            System.out.print("Masukan nama pesanan ke-"  + (i+1) + " : ");
            daftarMakanan[i] = input.nextLine();

            System.out.print("Masukan harga untuk pesanan ke-"  + (i+1) + " : ");
            hargaMakanan[i] = input.nextDouble();
            input.nextLine();
        }

        //hitung total
        double total = 0;
        for (double  harga : hargaMakanan) {   
            total += harga;
        }

        //print total 
        System.out.println("Daftar pesanan:");
        for (int  i = 0; i < jumlahpesan; i++) {
            System.out.println((i+1) + ". " + daftarMakanan[i] + " - Rp" + hargaMakanan[i]);
        } 
        System.out.println("Total biaya Rp : " + total);

        







    }
}
