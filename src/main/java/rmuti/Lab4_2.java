package rmuti;

import java.util.Scanner;

public class Lab4_2 { // PrimNumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int n=sc.nextInt();
        int prim=0,count=1;
        while (count<n)
        {
            if (n%count == 0)
            {
                prim++;
            }
            count++;
        }
        if (prim==2)
        System.out.println("not Pri");
        else
            System.out.println("is Pri");

        }
    }
