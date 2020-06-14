package rmuti;

import java.util.Scanner;

public class JBAD_TEST2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple"
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"

        System.out.println(word1);
        System.out.println(line1);
        System.out.println(word2);
        System.out.println(word3);
    }
}