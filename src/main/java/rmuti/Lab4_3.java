package rmuti;

import java.util.Scanner;

public class Lab4_3 {// CountDivideBy3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0,i=1;
        while (i<=n)
        {
            if (i%3==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
