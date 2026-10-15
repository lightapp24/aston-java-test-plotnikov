package com.plotnikov.aston.task2_1;

public class App 
{
    public static void main( String[] args )
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println( "Введите число A:" );
        int a = scanner.nextInt();
        System.out.println( "Введите число B:" );
        int b = scanner.nextInt();

        System.out.println(a == b ? "a = b" : (a > b ? "a > b" : "a < b"));

        System.out.println("Сумма чисел: " + (a + b));
        System.out.println("Разность чисел: " + (a - b));
        System.out.println("Произведение чисел: " + (a * b));
        System.out.println("Частное чисел: " + (a / b));

        scanner.close();
    }
}
