package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        SimpleInterest sum = new SimpleInterest();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        double roi = sc.nextDouble();
        int time = sc.nextInt();

        double si = (principal * roi * time) / 100;

        System.out.println(si);

    }


}
