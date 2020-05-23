package rmuti;

import java.util.Scanner;

public class Lab3_1 { // computeABS
    public static void main(String[] args) {
        int A, B, S;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        S = A - B;
        if (S < 0)
        {
            System.out.println(B - A);
        }

        else {
            System.out.println(A - B);
        }
    }
}

