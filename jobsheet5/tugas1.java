import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas, nilaiHuruf = "", kualifikasi = "";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS;

        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine();
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

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir < 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nomor Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

       
    }
}
