import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i ;

        System.out.print("Masukan nilai : ");
        n = input.nextInt();

        for (i = n; i >= 1; i-- ) {
            System.out.print(i);

            if (i > 1) {
                System.out.print(", ");
            }
        }
        

    }
}
