package rmuti;

import java.util.Scanner;

//Write a program that reads the name of a city and checks if the name ends with "burg".
//
//Keep in mind, a city can have a short name.
//
//The program should output true or false.
//Sample Input 1:
//
//Augsburg
//Sample Output 1:
//
//true
//Sample Input 2:
//
//Saint Petersburg
//Sample Output 2:
//
//true
//Sample Input 3:
//
//Tu
//Sample Output 3:
//
//false
public class Checkburgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String BurgsST= "burg";

        String A = scanner.nextLine().toLowerCase();
        String R = A.replace(" ","");
        boolean RB = R.endsWith(BurgsST);
        //System.out.print(R);
        //boolean RB = R.contains(BurgsST);
        System.out.print(RB);
    }
}
