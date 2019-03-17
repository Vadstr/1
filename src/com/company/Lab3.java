package com.company;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] arg) {
        System.out.println("Введите текст на редактирование");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("[\\s]+");
        for (String word : words) {
            int l = word.length();
            char d = word.charAt(0);
            System.out.print(d);
            if (Character.isUpperCase(d))
                d = Character.toLowerCase(d);
            for (int i = 1; i < l; i++) {
                char c = word.charAt(i);
                char c1 = Character.toLowerCase(c);
                if (c1 != d) {
                    System.out.print(c);
                }else{System.out.print("");}
            }
            System.out.print(" ");
        }
    }
}

