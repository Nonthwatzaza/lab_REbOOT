package rmuti;

import java.util.Scanner;

public class Lab3_2 { // Betweenvalue
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        if (Value >=10 && Value<=100)
        {
            System.out.println("incase");
        }
        else{
            System.out.println("out case");
        }
    }
}
