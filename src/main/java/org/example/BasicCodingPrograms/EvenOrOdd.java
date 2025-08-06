package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        EvenOrOdd sum = new EvenOrOdd();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("the given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }

    }
}
