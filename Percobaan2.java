import java.util.Scanner;
public class Percobaan2 {
    
 
    static String deret = "";

    static int hitungPangkat(int x, int y ){
        if (y == 0) {
            deret += "1" ;
            return (1);
        }else {
            deret += x + "x"; ;
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin di hitung: ");
        int bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat);

        System.out.println("Deret perhitungan : " + deret + " = " + hasil );
       
    }

}
