import java.util.Scanner; 


public class gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jamKerja, upahJam ;
        double pajak, gajiKotor, gajiBersih, bonus;


        System.out.print("input jam kerja : ");
        jamKerja = input.nextInt();
        System.out.print("input upah per jam : ");
        upahJam = input.nextInt();

      gajiKotor = jamKerja * upahJam;
      bonus = gajiKotor * 0.1 ;
      pajak = (gajiKotor + bonus) * 0.05 ;
      gajiBersih = gajiKotor + bonus - pajak ;
      
      System.out.println("Gaji kotor: " + gajiKotor);
      System.out.println("Bonus: " + bonus);
      System.out.println("Pajak: " + pajak);
      System.out.println("Total gaji anda : Rp " + gajiBersih);
        


    }
    
}
