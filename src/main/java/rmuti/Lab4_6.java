package rmuti;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<Integer>();
        int n =0;
        while (n!=-1)
        {
            n = sc.nextInt();
            if (n>=10)
            stack.add(n,n);
            else{}
        }
        System.out.println(stack);

    }
}
