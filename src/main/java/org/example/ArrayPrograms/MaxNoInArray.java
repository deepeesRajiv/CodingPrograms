package org.example.ArrayPrograms;

import org.example.BasicCodingPrograms.StringTONumber;

import java.util.Scanner;

public class MaxNoInArray {

    public static void main(String[] args) {
        MaxNoInArray sum = new MaxNoInArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] arr= new int[number];

        for(int i=0;i<number;i++){
            arr[i]=sc.nextInt();
        }

        int max= arr[0];
        for(int i=0;i<number;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);




    }
}
