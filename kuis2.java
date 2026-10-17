import java.util.Scanner;

public class kuis2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //BPSDA
        System.out.println("--------------BPSDA-------------");
        System.out.print("Masukkan jumlah wilayah: ");
        int jumlahWilayah = input.nextInt();
        input.nextLine(); 


        


        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        String[] wilayah = new String[jumlahWilayah];
        double[][] konsumsi = new double[jumlahWilayah][7]; 


        for (int i = 0; i < jumlahWilayah; i++) {
            System.out.print("Masukkan nama wilayah ke-" + (i + 1) + ": ");
            wilayah[i] = input.nextLine();

            System.out.println("Masukkan konsumsi air untuk wilayah " + wilayah[i] + ":");
            for (int j = 0; j < hari.length; j++) {
                System.out.print("  " + hari[j] + ": ");
                konsumsi[i][j] = input.nextDouble();
            }
        }

        // total rata
        int rata ; 

        


        


       
       
        

    }
}
            

