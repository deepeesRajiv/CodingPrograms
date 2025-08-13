package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class PracticeLoops {
    public static void main(String[] args) {
        PracticeLoops sum = new PracticeLoops();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>0){
            System.out.println("The given number is positive : "+"1");
        } else if (number<0) {
            System.out.println("The given number is negative : "+"-1");
        }else {
            System.out.println("The given number is neither negative nor postive : "+"0");
        }
    }
}
