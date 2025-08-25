package org.example.ArrayPrograms;

import org.example.BasicCodingPrograms.StringTONumber;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        ReverseAnArray sum = new ReverseAnArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int gss:arr){
            System.out.print(gss+" "  );
        }


        int[] reversedarray = new int[N];
        for(int i=0;i<arr.length;i++){
        reversedarray[N-1] =arr[i];
        N=N-1;
        }

        System.out.println("The reverse array is : ");
        for(int rev:reversedarray){
            System.out.print(rev + " ");
        }



    }



}
