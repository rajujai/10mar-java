package com.raju.q2;

import java.util.Scanner;
public class Main{
    public static String reversString(String input){
        StringBuilder str = new StringBuilder();
        for(int x=input.length()-1;x>=0;x--)
            str.append(input.charAt(x));
        return str.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+ orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}