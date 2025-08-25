//package org.example.TwoDimensionalArrayProblems;
//
//import java.sql.SQLOutput;
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//
//public class Reversed2dArray {
//
//    public static void main(String[] args) {
//        Reversed2dArray sum = new Reversed2dArray();
//        sum.returnum();
//
//    }
//
////    public void returnum() {
////        Scanner sc = new Scanner(System.in);
////
////        int rows = sc.nextInt();
////        int cols = sc.nextInt();
////
////        int[][] a2darr = new int[rows][cols];
////        for (int i = 0; i < rows; i++) {
////            for (int j = 0; j < cols; j++) {
////                a2darr[i][j] = sc.nextInt();
////            }
////        }
//
//       // System.out.println(Arrays.deepToString(a2darr));
////        int[][] a2darr = {
////                {1, 2, 3, 4},
////                {1, 23, 8, 1},
////                {6, 1, 156, 1},
////                {5, 1, 1, 56}
////        };
////        int N = a2darr.length*a2darr[0].length;
////        System.out.println(N);
////
////        System.out.println(a2darr[0][0]);
////    int[][] art2d = new int[4][4];
////        for(int i=0;i<a2darr.length;i++){
////            for(int j=0;j<a2darr[i].length;j++){
////                  art2d[N-1][N-2] = a2darr[i][j];
////            }
////        }
////
////        System.out.println(Arrays.deepToString(art2d));
//
////        int M = 3;
////        int N = 3;
////
////        for (int i = 0; i < M; i++) {
////
////            // Initialise start and end index
////            int start = 0;
////            int end = N - 1;
////
////            // Till start < end, swap the element
////            // at start and end index
////            while (start < end) {
////
////                // Swap the element
////                int temp = a2darr[i][start];
////                a2darr[i][start] = a2darr[i][end];
////                a2darr[i][end] = temp;
////
////                // Increment start and decrement
////                // end for next pair of swapping
////                start++;
////                end--;
////            }
////        }
//
//        // Print the arr[][] after
//        // reversing every row
////        for (int i = 0; i < M; i++) {
////            for (int j = 0; j < N; j++) {
////                System.out.print(a2darr[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//
//
//
//    }
//
