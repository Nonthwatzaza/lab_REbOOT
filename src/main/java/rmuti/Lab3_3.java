package rmuti;

import java.util.Scanner;

public class Lab3_3 { // ModNumber
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 5 == 0 && n>1000)
        {System.out.println("corrent case");}
    else {System.out.println("uncorrent case");}
    }
}
