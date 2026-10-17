import java.util.Scanner;
public class SiakadFor05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlLulus = 0, jmlTdkLulus = 0, batasLulus = 60 ;
        double nilai, tertinggi = 0, terendah = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ":");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai ;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai <= batasLulus) {
                jmlLulus++;
            }else {
                jmlTdkLulus++;
            }


        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + jmlLulus);
        System.out.println("Jumlah tidak lulus: " + jmlTdkLulus);

    }
    
}