package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Известны стороны прямоугольника a и b найти его площадь S и периметр P
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        int a = scanner.nextInt();
        System.out.print("Введите сторону b: ");
        int b = scanner.nextInt();

        int s = a * b;
        int p = 2 * (a + b);

        System.out.println("Площадь S = " + s);
        System.out.println("Периметр P = " + p );
    }
}
