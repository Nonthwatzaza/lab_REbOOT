package rmuti;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int NIII=N/100,NII=N/10%10,NI=N%10;
        if (N>=100&&N<=999)
        {
            System.out.println(NIII+NII+NI);
        }

}
}
