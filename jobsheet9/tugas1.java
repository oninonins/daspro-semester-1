import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan banyak nilai yang ingin anda input: ");
        int jmlNilai = input.nextInt();

        int [] nilai = new int[jmlNilai];

        for (int i = 0; i < jmlNilai; i++){
            System.out.print("Masukan nilai Mahasiswa ke -" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        
        //logika tertinggi dan terendah 
        int nilaiMax = nilai[0];
        int  nilaiMin = nilai[0];
        int total = 0; 

        for (int  i = 1; i < jmlNilai; i++){
            if (nilai[i] > nilaiMax) {
                nilaiMax = nilai[i];
            }
            if (nilai[i]  < nilaiMin) {
                nilaiMin = nilai[i];
            }
            total += nilai[0];   
        }
        
        
        //hitung rata-rata 
        double rata2 = (double) total / jmlNilai;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rata2);
        System.out.println("Nilai tertinggi adalah: " + nilaiMax);
        System.out.println("Nilai terendah adalah: " + nilaiMin);

        for (int i = 0; i < jmlNilai; i++){
            System.out.println("Nilai mahasiswa ke -" + (i+1) + " adalah :" + nilai[i]);
                
            }
            
        

    }
}
