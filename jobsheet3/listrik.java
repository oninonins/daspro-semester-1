import java.util.Scanner;

public class listrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlListrik, tarif, batas = 500;
        boolean statusTagihan;

        System.out.print("Penggunaan listrik (dalam kWh) = ");
        jmlListrik = sc.nextInt();

        tarif = jmlListrik * 1500;
        statusTagihan = jmlListrik > batas;  
        System.out.println("Jumlah tagihan: " + tarif + " rupiah");
        System.out.println("Status tagihan melebihi batas 500 kWh: " + statusTagihan);
        System.out.println("Jumlah tagihan : Rp" + tarif  ); 

    }
}
