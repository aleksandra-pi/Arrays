package zad5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {

        System.out.println("Give a length of an array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        Random random = new Random();
        System.out.println("Array : ");


        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(20) + 1;
            sum += array[i];

            System.out.print(array[i] + ", ");
        }

        Arrays.sort(array);
        System.out.println("\nSorted array: " + Arrays.toString(array));

        System.out.println("Min: " + array[0] + "\nMax: " + array[n - 1]);
    }
}
