import java.util.Scanner;

public class siakad05 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS;
        
        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas =  sc.nextLine();
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte(); 
        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble(); 
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);
      
        System.out.println("Nama: " + nama);
        System.out.println("NIM " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir );

      
        

    
    }

    
}