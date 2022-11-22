import java.util.Scanner;

public class Home3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x = ");
        float x = sc.nextFloat();
        System.out.print("Enter y = ");
        float y = sc.nextFloat();
        System.out.print("Enter an operator(like: +, -, *, /): ");
        String z = sc.next();
        sc.close();
        switch (z){
            case "+":
                System.out.printf("Result: x + y = %.2f + %.2f = %.3f\n", x, y, x+y);
                break;
            case "-":
                System.out.printf("Result: x - y = %.2f - %.2f = %.3f\n", x, y, x-y);
                break;
            case "*":
                System.out.printf("Result: x * y = %.2f * %.2f = %.3f\n", x, y, x*y);
                break;
            case "/":
                System.out.printf("Result: x / y = %.2f / %.2f = %.3f\n", x, y, x/y);
                break;
        }
    }
}
