package rmuti;

import java.util.Scanner;

//Write a program that checks if a given string starts with the prefix "J" ignoring the case.
//
//The program should output true or false.
//
//Sample Input 1:
//
//Java
//Sample Output 1:
//
//true
//Sample Input 2:
//
//Kotlin
//Sample Output 2:
//
//false
public class ignoringcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine().toUpperCase();
        String R = A.replace(" ","");
        boolean RB = R.startsWith("J");
        //System.out.print(R);
        //boolean RB = R.contains(BurgsST);
        System.out.print(RB);
    }
}
