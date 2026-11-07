package lt.vcd;
import java.util.Scanner;

public class Task_4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] masyvas = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < n; p++) {
                masyvas[i][p] = scanner.nextInt();

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    masyvas[i][j] = 0;
                }
                System.out.println();
            }

            for (i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        System.out.print("0 ");
                    } else {
                        System.out.print(masyvas[i][j] + " ");
                    }
                }
                System.out.println();
            }

        }
    }
}