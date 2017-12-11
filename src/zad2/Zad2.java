package zad2;

import java.util.Random;
import java.util.Scanner;

// to check

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Give a length of an array : ");
        int n = scanner.nextInt();

        int[] originalTab = new int[n];
        int[] newTab = new int[n*2];
        int i;

        System.out.print("First array: [ ");

        for(i = 0; i< n ; i++){

            originalTab[i] = random.nextInt(10)+1;
            System.out.print(originalTab[i]+" ");
        }

        System.out.print(" ] ");
        System.out.print("New array: [ ");
        for (int j = 0; j < newTab.length-1; j++)
        {
            newTab[j] = 0;
            System.out.print(newTab[j]+ " " );
        }
        newTab[newTab.length-1] = i;
        System.out.print(newTab[newTab.length-1]+" ] " );

    }
}