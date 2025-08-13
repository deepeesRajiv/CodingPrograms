package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class AverageOfNums {

    public static void main(String[] args) {
        AverageOfNums sum = new AverageOfNums();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i<num; i++) {

            arr[i] = sc.nextInt();
        }
        int average=0;
        int avgn=0;

        for(int i=0;i<num;i++){
            average=arr[i]+arr[i+1];


        }
        avgn= avgn/num;
        System.out.println(avgn);
    }

}
