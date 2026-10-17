import java.util.Scanner;

public class Pemilihan2Percobaan105 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int tahun;
        System.out.print("Masukkan Tahun: ");
        tahun = input05.nextInt();

        
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat.");
                }
            } else {
                System.out.println(tahun + " adalah tahun kabisat.");
            }
        } else {
            System.out.println(tahun + " bukan tahun kabisat.");
        }
    }
}
