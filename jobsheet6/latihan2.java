import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisBuku ;
        float diskon= 0 ;
        int jumlah ;


        System.out.println("-------------------------------");
        System.out.println("-----------TOKO BUKU-----------");
        System.out.println("-------------------------------");
        

        //tanya jenis buku 
        System.out.print("jenis buku : ");
        jenisBuku = input.nextLine();
        System.out.print("Jumlah buku : ");
        jumlah = input.nextInt();

        //kamus
        if (jenisBuku.equalsIgnoreCase("kamus") ) {
            diskon = 0.10f;
            }if (jumlah > 2) {
            diskon += 0.02f;
            }   
         else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07f;
            if (jumlah > 3) {
                diskon += 0.02f;
            }else if (jumlah <= 3) {
                diskon += 0.01f;
            }
         }else if (jumlah > 3) {
            diskon += 0.05f;

         }else {
            System.out.println("input tidak valid ");
         }
          
         
         System.out.println("jumlah diskon : " + diskon);

    }
}
