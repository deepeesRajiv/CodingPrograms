package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {
        ReverseANumber sum = new ReverseANumber();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            System.out.print(digit);
            temp=temp/10;
        }
    }
}
