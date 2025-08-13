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
     int last = arr.length;
        System.out.println(last);
        int[] art = new int[N];
        for(int i=last;i>0;i--){
            //art= arr[i];
        }

    }



}
