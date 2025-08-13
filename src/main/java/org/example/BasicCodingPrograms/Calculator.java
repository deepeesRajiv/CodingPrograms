package org.example.BasicCodingPrograms;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Calculator {
   static double arr[];


    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.returnum();
    }

    public  void returnum() {
        Scanner sc = new Scanner(System.in);
        int N = 2;

         arr = new double[N];

        for(int i=0;i<N;i++) {
            arr[i] = sc.nextDouble();
        }

        String operation = sc.next();

        switch(operation){
            case "+":
                returnaddition();
                break;
            case "-":
                returnsubtraction();
                break;
            case "*":
                returnmultiply();
                break;
            case "/":
                returndivide();
                break;
        }
    }

    public  static void returnaddition() {
        double N = arr.length;
        double totalsum=0;
        for(int i=0;i<N;i++){
             totalsum =arr[i]+totalsum;

        }
        System.out.println(totalsum);

    }
    public static void returnsubtraction() {
        double N = arr.length;
        double totalsub=0;
        for(int i=0;i<N-1;i++){
            totalsub =arr[i]-arr[i+1];

        }
        System.out.println(totalsub);

    }

    public static double returnmultiply() {
        double N = arr.length;
        double totalmul=0;
        for(int i=0;i<N-1;i++){
            totalmul =arr[i]*arr[i+1];

        }
        System.out.println(totalmul);
        return totalmul;
    }
    public static double returndivide() {
        double N = arr.length;
        double totaldiv=0;
       if(arr[0]>0) {
            for (int i = 0; i < N - 1; i++) {
                totaldiv = arr[i]/arr[i + 1];

            }
        }
        System.out.println(totaldiv);
        return totaldiv;
    }



}
