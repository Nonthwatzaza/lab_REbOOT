package rmuti;

import java.util.Scanner;

public class Lab3_4 { //TailEven
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if (n%2==0)
        {
            System.out.println(n%10);
            System.out.println("เลขคู่");
        }
        else
        {
            System.out.println(n%10);
            System.out.println("เลขคี่");
        }
    }
}
