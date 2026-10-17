import java.util.Scanner;
public class tugas1 {

    static int rekursif(int Jumlah, int angka [] ){
        if (Jumlah == 0) {
            return 0;
        }else{
            return angka[Jumlah-1] + rekursif(Jumlah-1, angka);
            
        }

    }

    static int iteratif(int Jumlah, int angka [] ){
        int hasil = 0;
        for (int i = 0; i < angka.length; i++) {
            hasil = hasil + angka[i];
        }
        return hasil;
    }


    public static void main(String[] args) {
        
        int jumlah ;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah angka yang akan diinput :");
        jumlah = input.nextInt();

        int angka [] = new int [jumlah];
        

        for (int i = jumlah; i >= 1; i--) {
            System.out.print("Masukan angka ke-" + i + " :");
            angka[i-1] = input.nextInt();

        }

        
        System.out.println("Total(rekursif) dari " + jumlah + "angka adalah : " + rekursif(jumlah, angka));
        System.out.println("Total(iteratif) dari " + jumlah + "angka adalah : " + iteratif(jumlah, angka));
    }
}