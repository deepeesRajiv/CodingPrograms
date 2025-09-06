package org.example.ArrayPrograms;

import java.util.Scanner;

public class CountElementInArray {

    public static void main(String[] args) {
        CountElementInArray sum = new CountElementInArray();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        boolean[] visited = new boolean[arr.length];
//        int count=1;
//        for(int i=0;i<N;i++){
//            if(visited[i]){
//                continue;
//            }
//            for(int j=i+1;j<N;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     visited[j]=true;
//                 }
//            }
//
//            System.out.println(arr[i]+"-----"+count);
//        }
//
//        int[] arr = {1, 2, 3, 2, 1, 4, 2, 3, 3};

        boolean[] visited = new boolean[arr.length]; // To mark counted elements

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue; // Skip already counted elements
            }

            int count = 1; // Count current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }

            System.out.println("Element: " + arr[i] + ", Frequency: " + count);
        }

    }
}
