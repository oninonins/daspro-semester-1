import java.util.Scanner;


public class Kafe05 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        

    String menu ;
    char ukuranCup ;
    int jumlah ;
    boolean keanggotaan;

    System.out.print("Masukan menu: ");
    menu = input.nextLine();
    System.out.print("Masukan ukuran cup: ");
    ukuranCup = input.nextLine().charAt(0);
    System.out.print("Masukan jumlah: ");
    jumlah = input.nextInt();
    System.out.print("Masukan keanggotaan (true/false):  ");
    keanggotaan = input.nextBoolean();

    double hargaMenu = 0;
    switch (menu.toLowerCase()) {
        case "kopi":
            hargaMenu = 12000;
            break;
        case "teh":
            hargaMenu = 7000;
            break;
        case "coklat":
            hargaMenu = 20000;
            break;
    }
    double totalHarga = hargaMenu * jumlah;  

switch (ukuranCup) {
    case 'S':
        break;
    case 'M':
        totalHarga += 0.25 * totalHarga;
        break;
    case 'L':
        totalHarga += 0.4 * totalHarga;
        break;
    default:
            System.out.println("Menu tidak tersedia.");
        return;
}


    double diskon = keanggotaan ? 0.1 : 0;  
    double nominalBayar = totalHarga - (diskon * totalHarga);

    System.out.println("Item pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
    System.out.println("Nominal bayar : " + nominalBayar);

    
        
    }


    }

