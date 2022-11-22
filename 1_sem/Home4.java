import java.util.Scanner;

public class Home4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an equation like (3? + ?6 = 56): ");
        String eq = s.nextLine();
        s.close();
        eq = eq.replaceAll(" ","");
        int ind1 = eq.indexOf("+");
        int ind2 = eq.indexOf("=");
        String a = "";
        String b = "";
        String res = "";
        for (int i = 0; i < ind1; i++) {
            a += eq.charAt(i);
        }
        for (int i = ind1+1; i < ind2; i++) {
            b += eq.charAt(i);
        }
        for (int i = ind2+1; i < eq.length(); i++) {
            res += eq.charAt(i);
        }
        int res_t = 0;
        int count = 0;
        String a2 = null, b2 = null;
        int l = 0,r = 0;
        if(a.indexOf("?") == 0) l = 1;
        if(b.indexOf("?") == 0) r = 1;
        calcul:
            for (int i = 0 + l; i < 10; i++) {
                a2 = a.replace("?", String.format("%d",i));
                for (int j = 0 + r; j < 10; j++) {
                    b2 = b.replace("?", String.format("%d",j));
                    res_t = Integer.parseInt(a2) + Integer.parseInt(b2);
//                    System.out.printf("%d + %d = %d\n", Integer.parseInt(a2), Integer.parseInt(b2), res_t);
                    if (res_t == Integer.parseInt(res)) break calcul;
                }
            }
        if (res_t == Integer.parseInt(res)) System.out.printf("Combination: %d + %d = %d", Integer.parseInt(a2), Integer.parseInt(b2), Integer.parseInt(res));
        else System.out.println("Combination not found");
    }
}
