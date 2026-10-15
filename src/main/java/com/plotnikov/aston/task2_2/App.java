package com.plotnikov.aston.task2_2;

public class App 
{
    public static void main( String[] args )
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println( "Введите строку 1:" );
        String str1 = scanner.nextLine();
        System.out.println( "Введите строку 2:" );
        String str2 = scanner.nextLine();

        System.out.println( str1.equals(str2) ? "Строки идентичны" : "Строки неидентичны" );

        scanner.close();
    }
}
