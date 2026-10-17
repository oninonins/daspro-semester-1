import java.util.Scanner;
public class SearchNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan banyaknya nilai yang akan diinput:  ");
        int jmlNilai =  input.nextInt();

        int [] arrNilai = new int[jmlNilai];
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0 ; i < arrNilai.length; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i + 1) +": " );
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukan nilai yang ingin dicari: ");
        int key = input.nextInt();

        for(int i=0 ; i < arrNilai.length; i++){
            if (arrNilai[i] == key) {
                ditemukan = true ; 
                posisi = i = 1;
                break;
            }
        }
        //ditemukan atau tidak
        if (ditemukan) {
            System.out.println("Nilai " + key + " ditemukan pada nilai mahasiswa ke-" + posisi);
        } else{
            System.out.println("Nilai " + key + " tidak ditemukan" );
        }
    }
}
