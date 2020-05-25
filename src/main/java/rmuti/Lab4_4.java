package rmuti;

import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) { // PowerCompute
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(PWU(5, a) + PWU(3, b));
    }
        private static int PWU (int y, int x) {
            int sum = 1;
            for (int i = 1; i <= x; i++) {
                sum = sum * y;
            }
            return sum;
        }
    }
