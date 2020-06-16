package rmuti;

import java.util.Scanner;
//Write a program that reads four numbers and decrements each of them.
//The program must output the results in the same order separated by spaces.
//Sample Input 1:
//
//10 11 -2 -3
//Sample Output 1:
//
//9 10 -3 -4
public class Decrementall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int I = scanner.nextInt();
        int II = scanner.nextInt();
        int III = scanner.nextInt();
        int IV = scanner.nextInt();
        I--;
        II--;
        III--;
        IV--;
        System.out.print(I);
        System.out.print(" ");
        System.out.print(II);
        System.out.print(" ");
        System.out.print(III);
        System.out.print(" ");
        System.out.print(IV);


    }
}
