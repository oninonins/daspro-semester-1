import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1 , bil2 , bil3 , billmax = 0 ;
        System.out.print("input bilangan 1 = ");
        bil1 = input.nextInt();
        System.out.print("input bilangan 2 = ");
        bil2 = input.nextInt();
        System.out.print("input bilangan 3 = ");
        bil3 = input.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                billmax = bil1;
            }
            else{
                billmax = bil3 ;
            }
        }
        else {
            if (bil2 > bil3) {
                billmax = bil2;
            }
            else {
                billmax =bil3 ;
            }
        }

        System.out.println("billmax : " + billmax);
    }
}
