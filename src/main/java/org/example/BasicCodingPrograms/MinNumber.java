package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        MinNumber sum = new MinNumber();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2 = sc.nextInt();

        if(number2<number1){
            System.out.println("the min number among two number is :"+ number2);
        }else {
            System.out.println("the min number among two number is :"+ number1);
        }

    };

}
