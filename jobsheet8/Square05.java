import java.util.Scanner;;
public class Square05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai N = ");
        int N = input.nextInt();

        for(int iOuter=1; iOuter<=N; iOuter++){
            for(int i=0; i<=N; i++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
    
}