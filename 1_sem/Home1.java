import java.math.BigInteger;
import java.util.Scanner;
public class Home1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;
        BigInteger k;
        do {
            System.out.print("Enter a number: ");
            while (!scan.hasNextInt()){
                System.out.println("\nIt's not a number!");
                scan.next();
            }
            x = scan.nextInt();
        }while (x < 0);
        k = fact2(x);
        System.out.printf("Factorial = %d\n", k);
        scan.close();
    }
    public static BigInteger fact2(int a){
        if (a == 1 | a == 0) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(a).multiply(fact2(a - 1));
        }
    }
}
