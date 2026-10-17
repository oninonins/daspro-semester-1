//Nama : Farrelino Athaillah Ribera 
// Nim : 244107020122
// Absen : 05

import java.util.Scanner;
public class UASIF05 {
 
     // Variabel global
     static Scanner input05 = new Scanner(System.in);
     static int tim05[][] = new int[5][2]; // Menyimpan skor tim
     static String namaTim05[] = new String[5]; // Menyimpan nama tim
     static int jumlahTim05 = 0;
     static int totalSkor05 = 0;
 
 


    public static void main(String[] args) {

        int pilih05;

        // perulangan tampilan
        do{
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input data skor Tim");
            System.out.println("2. Tampilkan tabel skor ");
            System.out.println("3. Tentukan juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4) : ");
            pilih05 = input05.nextInt();

            switch (pilih05) {
                case 1:
                    inputSkorTim();
                    break;
                case 2:
                    tableSkor();
                    break;
                case 3:
                    juara();
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
                
                default:
                System.out.println("Pilihan tidak valid");
                    break;
            }

        }while(pilih05 != 4);


        
    }

    //fungsi input data skor tim 
    public static void inputSkorTim(){

        //perulangan memasukan data tim

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
            input05.nextLine(); 
            namaTim05[i] = input05.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.print("Masukkan skor untuk level " + (j + 1) + ": ");
                tim05[i][j] = input05.nextInt();
            }
            System.out.println();
        }
    }



    

    //fungsi menampilkan tabel skor tim
    public static void tableSkor(){

        System.out.println("TABEL SKOR TURNAMEN ");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");

        //total skor per tim untuk table 
      
        for (int i = 0 ; i < 5; i++) {
            int total05 = 0;
            for (int j = 0; j < 2; j++) {
                total05 += tim05[i][j];

            }
            System.out.printf("%-10s %-10d %-10d %-10s\n", namaTim05[i], tim05[i][0], tim05[i][1], total05);
            
        }
        
      
       

    }

    //fungsi menentukan juara 
    public static void juara(){
        int maxSkor05 = 0;
        String timJuara05 = "";

        for (int i = 0; i < 5; i++) {
            int totalSkor05 = tim05[i][0] + tim05[i][1];
            if (totalSkor05 > maxSkor05) {
                maxSkor05 = totalSkor05;
                timJuara05 = namaTim05[i];
            }
        }
        System.out.println("Selamat kepada " + timJuara05 + " yang telah memenangkan kompetisi! ");


        //pengecekan apakah ada tim dengan skor yang sama 
        

        

    }

}
