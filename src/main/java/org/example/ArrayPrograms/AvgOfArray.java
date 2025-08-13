package org.example.ArrayPrograms;

import java.util.Scanner;

public class AvgOfArray {

    public static void main(String[] args) {
        AvgOfArray sum = new AvgOfArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int elements = arr.length;
        int sum =0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
         int avg = sum/elements;

        System.out.println(avg);

    }
}
