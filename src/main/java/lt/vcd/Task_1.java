package lt.vcd;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task_1 {
    static void main() throws FileNotFoundException {
        Scanner fIn = new Scanner(new File("radius.txt"));

        int n = fIn.nextInt();
        int[] masyvas = new int[n];

        for (int i = 0; i < n; i++) {
            masyvas[i] = fIn.nextInt();
        }
        int max = masyvas[0];
        for (int x : masyvas) {
            if (x > max) {
                max = x;
            }

        }
        int didesni = 0;
        for (int y : masyvas) {
            if (y >= max) {
                didesni++;

            }


        }
        System.out.println(max + " - " + didesni);
    }

}

