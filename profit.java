import java.util.Scanner;


public class profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

       
        double hargaJualHp, hargaJualKabel, hargaJualEarphone, biayaPengiriman, biayaPengemasan, Diskon, resiko; 

       // Input data untuk 3 produk (handphone, kabel, earphone)
       System.out.println("Masukkan data untuk Handphone");
       System.out.print("Harga jual Hp (Rp): ");
       hargaJualHp  = input.nextDouble();
       System.out.print("Harga jual kabel (Rp): ");
       hargaJualKabel  = input.nextDouble();
       System.out.print("Harga jual earphone (Rp): ");
       hargaJualEarphone = input.nextDouble();
       //input hargabeli
       double hargaBeliHp, hargaBeliKabel, hargaBeliEarphone ;
       System.out.print("Masukan Harga beli HP ");
       hargaBeliHp = input.nextDouble();
       System.out.print("Masukan Harga beli kabel ");
       hargaBeliKabel = input.nextDouble();
       System.out.print("Masukan Harga beli earphone ");
       hargaBeliEarphone = input.nextDouble();

        // input biaya pengiriman, diskon, pengemasan, resiko,untung yang diharapkan
       System.out.print("Biaya pengiriman (Rp): ");
       biayaPengiriman = input.nextDouble();
       System.out.print("Biaya pengemasan (Rp): ");
       biayaPengemasan = input.nextDouble();
       System.out.print("Diskon (Rp): ");
        Diskon = input.nextDouble();
       System.out.print("Faktor resiko kerusakan (%): ");
        resiko = input.nextDouble();
        System.out.print("Masukkan target keuntungan yang diharapkan (%): ");
         double targetKeuntungan = input.nextDouble() / 100;
        //dihitung
        double untungHp, untungKabel,untungEarphone, totalKeuntungan, rataUntung, persentaseKeuntungan;
         untungHp = (hargaJualHp - hargaBeliHp - biayaPengiriman - biayaPengemasan - Diskon) * (1 - resiko);
        untungKabel = (hargaJualKabel - hargaBeliKabel - biayaPengiriman - biayaPengemasan - Diskon) * (1 - resiko);
        untungEarphone = (hargaJualEarphone - hargaBeliEarphone - biayaPengiriman - biayaPengemasan - Diskon) * (1 - resiko);

       totalKeuntungan = untungHp + untungEarphone + untungKabel ;
       rataUntung = totalKeuntungan / 3;
       persentaseKeuntungan = (totalKeuntungan / (targetKeuntungan * totalKeuntungan)) * 100;

        //output 
       System.out.println("ketuntungan hp : Rp " + untungHp);
       System.out.println("ketuntungan kabel : Rp " + untungKabel);
       System.out.println("ketuntungan earphone : RP" + untungEarphone);
       System.out.println("total keuntungan : Rp " + totalKeuntungan);
        System.out.println("rata-rata untung : Rp" + rataUntung);
        System.out.println("presentase keuntungan RP" + persentaseKeuntungan);




    }
}