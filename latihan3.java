import java.util.Scanner;
public class latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ukuran, harga = 0 ;
        String merk, kategori;

        System.out.println("---------------------------------");
        System.out.println("-----------TOKO SEPATU-----------");
        System.out.println("---------------------------------");

        System.out.println("Daftar sepatu");
        System.out.println("1. Converse");
        System.out.println("kategori dan ukuran");
        System.out.println("--Slip On (36-40)--");
        System.out.println("--High Top (40-44)--");
        System.out.println("2. Sketcher");
        System.out.println("kategori dan ukuran");
        System.out.println("--Woman (36-41)--");
        System.out.println("--Man (41-44)--");
        System.out.println("3. Nike");
        System.out.println("kategori dan ukuran");
        System.out.println("--Kids (36-40)--");
        System.out.println("--Aldut (40-44)--");

        System.out.println("---------------------------------");

        System.out.print("input merk sepatu :");
        merk = input.nextLine();
        System.out.print("input Kategori : ");
        kategori = input.nextLine();
        System.out.print("input ukuran : ");
        ukuran = input.nextInt();
        System.out.println("---------------------------------");

        if (merk.equals("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;           
            }else if (kategori.equalsIgnoreCase("High Top")) {
                harga = 1200000;
            }
        }else if (merk.equals("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;           
            }else if (kategori.equalsIgnoreCase("Man")) {
                harga = 1800000;
            }
        }else if (merk.equals("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;           
            }else if (kategori.equalsIgnoreCase("Aldut")) {
                harga = 1500000;
        }   }
        else {
            System.out.println("Tidak Valid");
        }

        System.out.println("---------------------------------");
        System.out.println("total bayar : " + harga );
        System.out.println("---------------------------------");

    }
}
