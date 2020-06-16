package rmuti;

import java.util.Scanner;

//Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself and good luck! Otherwise, you can skip it by now and return any time later
//Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?
//
//Input data format
//
//On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.
//
//Sample Input 1:
//
//10
//3
//2
//Sample Output 1:
//
//8
//Sample Input 2:
//
//20
//7
//3
//Sample Output 2:
//
//5
public class snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H=0,A=0,B=0,Snail=0,CN=0;

        H = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        if (H > B && A > B && H <= 100 && A <= 100 && B<=100)
        {
            while (Snail<=H)
            {
                Snail += A;
                //System.out.print(Snail);
                //System.out.println("++++");
                CN++;
                if (Snail>=H)
                {
                    break;
                }
                else
                {
                    Snail -= B;
                    //System.out.print(Snail);
                    //System.out.println("----");
                }
            }
            System.out.print(CN);
        }



    }
}
