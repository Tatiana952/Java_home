package sem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class home2 {
    public static void main(String[] args) throws Exception{
        int[] arr = {1,-166, 99, 0, -5, 45, 3333, 5, 67, -98, 23};
        int k = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    k++;
                    log_txt(arr, k);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println("\nYou can find list of iterations in log file: log_home2.txt");
    }
    static void log_txt(int a[], int y) throws Exception {
        Date d = new Date();
        String username = System.getProperty("user.name");
        BufferedWriter wr = new BufferedWriter(new FileWriter("log_home2.txt", true));
        wr.write("Iteration " + y + ". ------ " + d.toString() + " ------ " + username + "\n");
        for (int i = 0; i < a.length; i++) wr.write(a[i] + " ");
        wr.write("\r\n");
        wr.flush();
        wr.close();
    }
}
