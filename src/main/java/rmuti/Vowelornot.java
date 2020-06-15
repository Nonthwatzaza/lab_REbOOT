package rmuti;

import java.util.Scanner;

public class Vowelornot {
    public static boolean isVowel(char word) {
        {
            if
            (
                    word == 'A' || word == 'a' || // เช็คว่าตัวอักษรเป็น A หรือ a
                    word == 'E' || word == 'e' || // เช็คว่าตัวอักษรเป็น E หรือ e
                    word == 'I' || word == 'i' || // เช็คว่าตัวอักษรเป็น I หรือ i
                    word == 'O' || word == 'o' || // เช็คว่าตัวอักษรเป็น O หรือ o
                    word == 'U' || word == 'u'    // เช็คว่าตัวอักษรเป็น U หรือ u
            )
            {
                return true;
            }
            else{
                return false;
            }
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
