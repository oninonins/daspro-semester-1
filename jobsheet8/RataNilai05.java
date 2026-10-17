import java.util.Scanner;;
public class RataNilai05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,j;
        float nilai, totalNilai = 0, rataNilai;

        i=1;
        while (i <=5 ) {
            totalNilai = 0;
            
            System.out.println("input mahasiswa ke " + i);
            for(j=1; j<=5; j++){
                System.out.print("Nilai ke-" + j + " = ");
                nilai = input.nextInt();
                totalNilai+=nilai;
            }
            rataNilai=totalNilai/5;

            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah : " + rataNilai + "\n");

            i++;
            
        }

    }
}
