package org.example.BasicCodingPrograms;

import java.util.Scanner;

public class StringTONumber {

    public static void main(String[] args) {
        StringTONumber sum = new StringTONumber();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int num = Integer.parseInt(number);
        System.out.println(num);

    }
}
