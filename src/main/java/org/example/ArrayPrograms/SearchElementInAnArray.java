package org.example.ArrayPrograms;

import java.util.Scanner;

public class SearchElementInAnArray {

    public static void main(String[] args) {
        SearchElementInAnArray sum = new SearchElementInAnArray();
       int retunedvalue =sum.returnum();
        if(retunedvalue==1){
            System.out.println("The element exists");
        } else if (retunedvalue==-1) {
            System.out.println("The element does not exists");

        }

    }

    public int returnum() {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        int neededelement = sc.nextInt();

        for(int i=0;i<N;i++){
            if(arr[i]==neededelement){
           return 1;
            }
        }
        return -1;

        }



        }



