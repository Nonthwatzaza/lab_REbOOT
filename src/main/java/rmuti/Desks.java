package rmuti;

import java.util.Scanner;

public class Desks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();

        if (R1<1000&&R2<1000&&R3<1000)
        {
            int R1S = R1 % 2, R2S = R2 % 2, R3S = R3 % 2;
            int R1D = R1 / 2, R2D = R2 / 2, R3D = R3 / 2;
            System.out.println(R1D + R1S + R2D + R2S + R3D + R3S);
        }
    }
}
