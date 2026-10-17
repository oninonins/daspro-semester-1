import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int harga, jmlBarang ;
    double pajak , toHa, hargaDiskon, diskon = 0.15 ;

    System.out.print("Jumlah barang yang dibeli : ");
    jmlBarang = input.nextInt();
    System.out.print("harga barang : ");
    harga = input.nextInt();

    harga = jmlBarang * harga ;
    hargaDiskon = harga * diskon ;
    pajak = (harga - hargaDiskon) * 0.1 ;
    toHa = (harga - hargaDiskon) + pajak ;

    System.out.println("Harga sebelum diskon : " + harga);
    System.out.println("Harga setelah diskon : " + (harga - hargaDiskon));
    System.out.println("Pajak sebesar : " + pajak);
    System.out.println("total harga :" + toHa);



    





    }
}
