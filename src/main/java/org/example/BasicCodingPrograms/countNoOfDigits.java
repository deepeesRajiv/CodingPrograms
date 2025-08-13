package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class countNoOfDigits {

    public static void main(String[] args) {
        countNoOfDigits sum = new countNoOfDigits();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int count =0;

        while(number>=1){
            number = number/10;
            System.out.println(number);
            count++;

        }
        System.out.println(count);

    }
}
