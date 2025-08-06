package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class PrintTheSum {

    public static void main(String[] args) {
        PrintTheSum sum=new PrintTheSum();
        sum.returnsum();

    }

    public int returnsum(){
        Scanner sc = new Scanner(System.in);
        int firstnumber=sc.nextInt();
        int secondnumber=sc.nextInt();

        int sumNumber=firstnumber+secondnumber;
        System.out.println("the sum of two number is :"+sumNumber);
        return sumNumber;
    }
}
