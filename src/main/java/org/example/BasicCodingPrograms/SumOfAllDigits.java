package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class SumOfAllDigits {

    public static void main(String[] args) {
        SumOfAllDigits sum = new SumOfAllDigits();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();

        int sum =0;
        int temp=number;

        while(temp!=0){
            int digit = temp%10;
            sum = sum+digit;
            temp= temp/10;

        }
        System.out.println("sum of all the digti is : "+ sum);

    }
}
