package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class PrintALlTheDigts {
    public static void main(String[] args) {
        PrintALlTheDigts sum = new PrintALlTheDigts();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//        int sum = 0;
//        int temp = number;
//
//        while (temp != 0) {
//            int digit = temp % 10;
//            System.out.println(digit);
//            temp=temp/10;
//        }

//        // Reverse the number
//        while (temp > 0) {
//            int digit = temp % 10;
//            reversed = reversed * 10 + digit;
//            temp /= 10;
//        }
//
//        // Print each digit in correct order
//        while (reversed > 0) {
//            int digit = reversed % 10;
//            System.out.println(digit);
//            reversed /= 10;
//        }

        String numberstr = Integer.toString(number);

        for(int i=0;i<numberstr.length();i++)
        {
            System.out.println(numberstr.charAt(i));
        }
    }
}
