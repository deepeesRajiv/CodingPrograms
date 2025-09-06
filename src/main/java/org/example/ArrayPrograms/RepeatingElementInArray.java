package org.example.ArrayPrograms;

import java.util.Scanner;

public class RepeatingElementInArray {

    public static void main(String[] args) {
        RepeatingElementInArray sum = new RepeatingElementInArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

       // int[] art = new int[10];
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]==arr[j]) {
                    System.out.print("The repeating elements are: "+arr[j]);

                }
            }

        }

    }



    }
