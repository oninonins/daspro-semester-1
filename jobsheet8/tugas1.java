public class tugas1 {
    public static void main(String[] args) {
        
        int n = 5;
        int h = 1;

       while (h <= n) {
            int i = 1;
            while (i<=n) {
                if (h == 1 || h == n || i == 1|| i == n) {
                    System.out.print("5");
                }
                else {
                    System.out.print(" ");
                }
                i++;
            }
        System.out.println();
        h++;
       }
    }
}
