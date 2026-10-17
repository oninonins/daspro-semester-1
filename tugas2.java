import java.util.Scanner;

public class tugas2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlAtlet = 5;
        String namaAtlet;

        System.out.print("Masukan jumlah Politeknik yang daftar :");
        int jmlPoliteknik = input.nextInt();
        input.nextLine();

        //perulangan politeknik
        for (int i=1; i <= jmlPoliteknik; i++){

            System.out.println("Politeknik " + i);

            //cabor
            System.out.println("Cabor : Badminton");
            for (int j=1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }
            System.out.println("Cabor : Tenis Meja");
            for (int j=1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }
            System.out.println("Cabor : Basket");
            for (int j=1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }
            System.out.println("Cabor : Bola Voly");
            for (int j=1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }



        }



    }
}
