import java.util.Scanner;;

public class uts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int AK = 30, famas = 20, heal = 25, healcount = 3;
        int nyawa, nyawaM, ronde = 1 ;

        
        System.out.println("---Game Start---");
        System.out.print("Nyawa pemain : ");
        nyawa = input.nextInt();
        System.out.print("Nyawa Musuh : ");
        nyawaM = input.nextInt();
        System.out.println("Pertarungan mulai");

        //logika
        while (nyawa > 0 && nyawaM > 0) {
            System.out.println(">>ronde"+ronde+"<<" );
            ronde++;
            

            //musuh nyerang 
            nyawa -= 15;
            System.out.println("musuh menyerang nyawamu berkurang 15, nyawamu sekarang " + nyawa);
            if (nyawa > 0) {
                System.out.println("Apa yang anda lakukan, Pilih aksi :");
                System.out.println("1. Serang");
                System.out.println("2. Hindari");
                System.out.println("3. Sembuhkan diri (" + healcount + " kali penyembuhan tersisa)");
                int pilihan = input.nextInt();

                int senjata ;

                switch (pilihan) {
                    case 1: // Pemain menyerang
                        System.out.println("Pilih senjata:");
                        System.out.println("1. AK (Poin serang: 30)");
                        System.out.println("2. Famas (Poin serang: 20)");
                        senjata = input.nextInt();
                        if (senjata == 1) {
                            nyawaM -= AK;
                            System.out.println("Kamu menyerang dengan AK! Nyawa musuh berkurang 30 poin. Nyawa musuh sekarang: " + nyawaM);
                            
                        }else if (senjata == 2) {
                            nyawaM -= famas;
                            System.out.println("Kamu menyerang dengan famas! Nyawa musuh berkurang 20 poin. Nyawa musuh sekarang: " + nyawaM);
                        }else {
                            System.out.println("Pilihan senjata tidak valid.");
                        }
                        break;
                    case 2: // Pemain menghindar
                        System.out.println("Kamu memilih menghindar!");
                        if (nyawa > nyawaM) {
                            nyawaM += nyawaM * 0.10; // Musuh mendapatkan kembali 10% nyawanya
                            System.out.println("Musuh mendapatkan 10% nyawanya kembali. Nyawa musuh sekarang: " + nyawaM);
                        } else {
                            System.out.println("Anda berhasil menghindar, tidak ada perubahan pada nyawa musuh.");
                        }
                        break;
                    case 3: // Pemain menyembuhkan diri
                        if (healcount > 0) {
                            nyawa += heal;
                            healcount--;
                            System.out.println("Kamu menyembuhkan diri sebesar 25 poin. Nyawa pemain sekarang: " + nyawa + ". Sisa penyembuhan: " + healcount);
                        } else {
                            System.out.println("Kamu tidak memiliki sisa penyembuhan.");
                        }
                        break;

                    default:
                        System.out.println("input tidak valid");
                        break;
                }    
                
    
            //pesan diakhir 
            }if (nyawa <= 0) {
                System.out.println("Nyawa Anda habis! Anda kalah.");
            } else if (nyawaM <= 0) {
                System.out.println("Musuh kalah! Selamat, Anda menang!");
            }
        }
        



        


    }
}
