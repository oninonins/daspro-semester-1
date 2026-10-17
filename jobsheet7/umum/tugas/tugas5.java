import java.util.Scanner;;

public class tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int hasil = 0;

        
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();

        
        for (int i = 1; i <= bil2; i++) {
            hasil += bil1; 
        }
        System.out.println("Hasil perkalian menggunakan penjumlahan adalah: " + hasil);
    }
    
}
