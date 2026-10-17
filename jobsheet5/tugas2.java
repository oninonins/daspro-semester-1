import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("masukan usia anda : ");
    if (input.hasNextInt()) {
        int usia = input.nextInt();

        if (usia >= 0) {
            if (usia <= 12) {
                System.out.println("kategori usia anda anak ");                
            } else if (usia <= 19) {
                System.out.println("Usia anda remaja");
            } else if (usia <= 64) {
                System.out.println("kategori usia anda dewasa");
            } else if (usia >= 65) {
                System.out.println("kategori usia anda lansia");
            }

        } else {
            System.out.println("Input tidak valid");
        }
        
    } else {
        System.out.println("input tidak valid ");
    }

    }
}
 
    

