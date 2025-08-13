package org.example.ArrayPrograms;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        SearchElementInArray sum = new SearchElementInArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int element = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<N;i++){
            if(element==arr[i]){
                System.out.println("The element exists in the array : "+ arr[i]);
                break;
            }
        }
        //System.out.println("The element  does not exists in the array");




    }



}
