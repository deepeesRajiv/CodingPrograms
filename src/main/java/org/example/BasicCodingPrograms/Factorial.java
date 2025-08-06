package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Factorial sum = new Factorial();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 1;

        for(int i=1;i<num;i++){
          sum=sum*i;
        }
        System.out.println(sum);
    }
}
