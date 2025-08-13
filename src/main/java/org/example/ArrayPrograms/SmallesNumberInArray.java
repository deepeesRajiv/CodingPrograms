package org.example.ArrayPrograms;

import org.example.BasicCodingPrograms.StringTONumber;

import java.util.Scanner;

public class SmallesNumberInArray {

    public static void main(String[] args) {
        SmallesNumberInArray sum = new SmallesNumberInArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        int min = arr[0];
        for(int i=0;i<N;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(min);




    }
}
