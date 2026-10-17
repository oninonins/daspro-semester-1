import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1. Mobil 2. Motor 0. Keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) { // Jika jenis kendaraan adalah mobil atau motor
                System.out.println("Input durasi: ");
                durasi = input.nextInt();

                if (durasi > 5) { // Kondisi jika durasi lebih dari 5
                    total += 125000;
                } else if (jenis == 1) { // Hitung total jika jenis kendaraan adalah mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // Hitung total jika jenis kendaraan adalah motor
                    total += durasi * 2000;
                }
            } else if (jenis == 0) { // Jika jenis kendaraan adalah 0, keluar dari loop
                break;
            } else {
                System.out.println("Jenis kendaraan tidak valid. Masukkan jenis yang benar.");
            }
        } while (true);
        System.out.println("Total biaya parkir: Rp " + total);
    }
}
