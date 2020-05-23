package rmuti;

import java.util.Scanner;

public class Lab2_5 { //kilometersTomiles
    public static void main(String[] args) {
        float mi;
        Scanner sc = new Scanner(System.in);
        mi = sc.nextInt();
        System.out.print(mi);
        System.out.println("km");
        System.out.print(mi*0.62137);
        System.out.print(" ไมล์");
    }
}
