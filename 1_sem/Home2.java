public class Home2 {
    public static void main(String[] args) {
        int count = 0;
        int c = 0;
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) ++count;
            }
            if (count == 2) {
                if (c == 15) {
                    c = 0;
                    System.out.println(i + "    ");
                    c++;
                } else {
                    System.out.print(i + "     ");
                    c++;
                }
            }
            count = 0;
        }
    }
}
