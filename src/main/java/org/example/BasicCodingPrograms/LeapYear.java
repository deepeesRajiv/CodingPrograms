package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear sum = new LeapYear();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num%4==0||num%100==0||num%400==0){
                    System.out.println("This is leap year");
                }
        else{
            System.out.println("This is not a leap year");
        }



    }
}
