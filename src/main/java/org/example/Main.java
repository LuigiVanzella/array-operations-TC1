package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayInitial = new int[5];
        for(int i = 0; i<5; i ++){
            arrayInitial[i] = scanner.nextInt();
        }
        Ex03 ex03 = new Ex03(arrayInitial);

        while(ex03.getArrayLength()> 0 && ex03.getArrayLength() < 10){
            System.out.println(ex03.compareNumber(scanner.nextInt()));
        }



    }
}