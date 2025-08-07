package org.example.BasicCodingPrograms;

import java.util.Objects;
import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        VowelOrConsonent sum = new VowelOrConsonent();
        sum.returnum();

    }

    public void returnum() {
        Scanner sc = new Scanner(System.in);

        char data = sc.next().toUpperCase().charAt(0);


        if(data=='A'||data=='E'||data=='I'||data=='O'||data=='U'){
            System.out.println("This is a vowel");
        }
        else{
            System.out.println("This is not a vowel");
        }

        }




}
