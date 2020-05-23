package rmuti;

import java.util.Scanner;

public class Lab3_5 { // MostNumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int Q1 =sc.nextInt();
        int Q2 =sc.nextInt();
        int Q3 =sc.nextInt();
    if (Q1>Q2&&Q1>Q3)
    {System.out.println(Q1);}
        if (Q2>Q1&&Q2>Q3)
        {System.out.println(Q2);}
        if (Q3>Q1&&Q3>Q2)
        {System.out.println(Q3);}
         else
        {
            System.out.println("all Equal");
        }


    }
}
