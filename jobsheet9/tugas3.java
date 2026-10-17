import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("------------------Kafe---------------");
        System.out.println("--------------------------------------");

        System.out.println("Anda mau pesan apa ?");
        
        //menu 
        String[]menu = {"Nasi goreng", "Mie goreng",  "Gado-gado", "Sate", "Es teler", "Es teh"};

        //tampilkan menu 
        for (int i = 0 ; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String namaMakanan = input.nextLine();
      
        
        // linear search
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(namaMakanan)) {
                ditemukan = true;
                break;
            }
        }
        
        // Tampilkan hasil pencarian
        if (ditemukan) {
            System.out.println(namaMakanan + " tersedia di menu.");
        } else {
            System.out.println(namaMakanan + " tidak tersedia di menu.");
        }


    }
}
