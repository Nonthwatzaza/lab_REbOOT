package rmuti;

import java.util.Scanner;

public class Lab2_4 { // CircleComputer
    public static void main(String[] args) {
        double pi=3.14 ,r=0;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("เส้นรอบวง = ");
        System.out.println((2*pi)*r);
        System.out.println("พื้นที่ = ");
        System.out.println(pi*(r*r));
    }
}
