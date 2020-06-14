package rmuti;

import java.lang.Math;
import java.util.Scanner;
public class countmaxofthree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int x = Integer.parseInt(keyboard.nextLine());
        int y = Integer.parseInt(keyboard.nextLine());
        int z = Integer.parseInt(keyboard.nextLine());
        int max = Math.max(x,y);
        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);
        }
        System.out.println("The max of three is: " + max);
    }
}
