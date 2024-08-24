package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Provide a non numeric strings");

        if(isNumeric(scanner.nextLine())){
            System.out.println("The provided string is numeric!");
        }else{
            System.out.println("The provided string is valid.");
        }
        scanner.close();
    }

    private static boolean isNumeric(String nextLine) {
        return  StringUtils.isNumeric(nextLine);
    }
}