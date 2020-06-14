package rmuti;

import java.util.Scanner;

public class AEIOU {

        public static void main(String[] args) {
            String word; // เก็บข้อความที่จะนำมานับสระ
            Scanner scan = new Scanner(System.in);
            System.out.println("Please insert your word.");
            word = scan.nextLine(); // รอรับข้อความ
            System.out.println("Your word is " + word); // แสดงผลข้อความที่รับเข้ามา

            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == 'A' || word.charAt(i) == 'a' || // เช็คว่าตัวอักษรเป็น A หรือ a
                        word.charAt(i) == 'E' || word.charAt(i) == 'e' || // เช็คว่าตัวอักษรเป็น E หรือ e
                        word.charAt(i) == 'I' || word.charAt(i) == 'i' || // เช็คว่าตัวอักษรเป็น I หรือ i
                        word.charAt(i) == 'O' || word.charAt(i) == 'o' || // เช็คว่าตัวอักษรเป็น O หรือ o
                        word.charAt(i) == 'U' || word.charAt(i) == 'u'    // เช็คว่าตัวอักษรเป็น U หรือ u
                ) {
                    count++; // ทำการนับเมื่อเป็น A E I O U
                }
            }
            System.out.println("Number of AEIOU = " + count); // แสดงจำนวนสระที่นับและเก็บไว้ในตัวแปร count
        }
    }
