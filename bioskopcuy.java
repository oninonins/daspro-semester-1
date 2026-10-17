import java.util.Scanner;

public class bioskopcuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int reguler = 50000, vip = 100000;
        int total, tiketR, tiketVip, diskon1 = 300000, diskon2 = 500000 ;

        System.out.println("Jual tiket bioskop");
        System.out.println("Tiket reguler");
        tiketR = input.nextInt();
        System.out.println("Tiket vip");
        tiketVip = input.nextInt();

        tiketR *= reguler ;
        tiketVip *= vip ;

        total = tiketR + tiketVip ;

        System.out.println("Total tagihan anda : RP" + total);
        if (total >= diskon2 ) {
            total -= (total * 0.20) ;
            System.out.println("Anda dapat diskon 10% ");
            System.out.println("Setelah didiskon jadi Rp" + total);
        }else if (total >= diskon1) {
            total -= (total * 0.10);
            System.out.println("anda mendapat diskon 20%");
            System.out.println("Setelah didiskon jadi Rp" + total);
        }else {
            System.out.println("anda tidak mendapat diskon");
        }
        




    }
}
