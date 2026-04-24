package javastart;

import java.util.Scanner;

public class ConvertType2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자(실수)를 문자로 입력해주세요.");
        String input = scanner.nextLine();

        double d = Double.parseDouble(input);

        String str1 = Double.toString(d);
        String str2 = String.valueOf(d);

        System.out.println("input 값: " + input);
        System.out.println("d 값: " + d);
        System.out.println("str1 값: " + str1);
        System.out.println("str2 값: " + str2);

        scanner.close();
    }
}