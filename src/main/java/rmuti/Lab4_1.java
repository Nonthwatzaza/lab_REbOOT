package rmuti;

import java.util.Scanner;

public class Lab4_1 { //ProductSum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Total = 0;
        int in=0;
        while ( in != -1)
        {
            Total+=in;
            in =sc.nextInt();
        }
        System.out.println(Total);
    }
}
