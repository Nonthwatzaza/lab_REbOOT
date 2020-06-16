package rmuti;

import java.util.Scanner;

//Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
//
//The program should print out the resulting string.
public class awithb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int i=0;
            String B = A.replace('a', 'b');
        System.out.print(B);
    }
}
