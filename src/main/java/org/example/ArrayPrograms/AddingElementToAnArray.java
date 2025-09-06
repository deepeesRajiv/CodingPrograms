package org.example.ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementToAnArray {

    public static void main(String[] args) {
        AddingElementToAnArray sum = new AddingElementToAnArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arrlength = new int[N];

        for(int i=0;i<N;i++){
            arrlength[i]=sc.nextInt();
        }

        System.out.print("The exising array is:"+ Arrays.toString(arrlength));

        int[] arr2 = new int[M];

        for(int i=0;i<M;i++){
            arr2[i]=sc.nextInt();
        }
        for(int newarr:arr2){
            System.out.print(newarr+" ");
        }


    }
}
