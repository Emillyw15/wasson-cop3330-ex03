/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.print("Who said it? ");
        String answer = b.nextLine();
        System.out.println(answer + " says," + " \"" + quote + "\".");
    }
}
