package rmuti;

import java.util.Scanner;

public class nutseachsquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (N<=10000 && K<=10000)
        {
            System.out.println(K/N);
        }
    }
}
