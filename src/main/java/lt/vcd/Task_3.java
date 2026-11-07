package lt.vcd;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_3 {
    static void main() throws FileNotFoundException {
        Scanner fIn = new Scanner(new File("students.txt"));

        int y = fIn.nextInt();
        int x = fIn.nextInt();
        int lowgrade = 0;
        int[] sumos = new int[x];
        int[][] masyvas = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int p = 0; p < y; p++) {
                masyvas[i][p] = fIn.nextInt();
                sumos[i] += masyvas[i][p];

            }
            for (int p = 0; p < y; p++) {
                if (masyvas[i][p] < 5) {
                    lowgrade++;
                    break;
                }
            }

        }


        double sumuSuma = 0.0;
        int max = sumos[0];

        System.out.println("Student averages: ");
        for (int g = 0; g < x; g++) {
            System.out.println(sumos[g] / y);
            sumuSuma += (double) sumos[g] / y;
            if (max < sumos[g]) {
                max = sumos[g];
            }

        }

        System.out.println("Group average: ");
        System.out.println((double) sumuSuma / (x));
        System.out.println("Students with at least one grade below 5: ");
        if (lowgrade == 0) {
            System.out.println("none");
        } else {
            System.out.println(lowgrade);
        }

    }
}
