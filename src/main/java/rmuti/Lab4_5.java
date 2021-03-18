package rmuti;

import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aws=1;
        if (a<b) {
            while (a <= b) {
                aws *= a;
                a++;
            }
        }
        System.out.println(aws);
    }
}
