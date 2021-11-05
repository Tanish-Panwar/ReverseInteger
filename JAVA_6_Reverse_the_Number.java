import java.util.Scanner;

public class JAVA_6_Reverse_the_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = 0, rev = 0;
        
        for (int i = 0; i < T; i++) {
            n = sc.nextInt();
            int size = (int) Math.log10(n) + 1;
            for (int j = 0; j < size; j++) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println(rev);
            rev = 0;
        }

        sc.close();
        
    }    
}