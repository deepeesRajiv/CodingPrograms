package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class LastDigit {

    public static void main(String[] args) {
        LastDigit sum = new LastDigit();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int num = number%10;
        System.out.println(num);


        //to get the first digit in number
        int firstDigit = number;
        while (firstDigit >= 10) {  // keep dividing until 1 digit left
            firstDigit = firstDigit / 10;
        }
        System.out.println(firstDigit);
    }
}
