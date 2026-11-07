package lt.vcd;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_2 {
    static void main() throws FileNotFoundException {
        Scanner fIn = new Scanner(new File("residents.txt"));

        int n = fIn.nextInt();
        int[] masyvas = new int[n];

        for (int i = 0; i < n; i++) {
            masyvas[i] = fIn.nextInt();
        }
        int sidel = 0;
        int sidelh= 0;
        int sider = 0;
        int siderh= 0;
        int gyventojai = 0;
        for (int x : masyvas) {
            if (x % 2 == 0) {
                sidel += x;
                sidelh++;
            } else {
                sider += x;
                siderh++;
            }
            gyventojai += x;

        }


        System.out.println("Total residents: " + gyventojai);
        System.out.println("Residents on the left: " + sidel);
        System.out.println("Residents on the right: " + sider);
        System.out.println("Average per house on the left: " + sidel/sidelh);
        System.out.println("Average per house on the right: " + sider/siderh);
    }


}