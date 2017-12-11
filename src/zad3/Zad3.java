package zad3;

import java.util.Arrays;
import java.util.Scanner;

// to check

public class Zad3 {

    static int [] readArrayFromUserInput() {
        System.out.println("Give here how many numbers to put:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Give " + (i + 1) + " number");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void main(String[] args) {

        int[] array =readArrayFromUserInput();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        int maxNumber = array[0];
        int maxQuantity = 1;
        int currentQuantity = 1;

        for (int i=0; i <array.length; i++) {
            if (currentQuantity > maxQuantity) {
                maxQuantity = currentQuantity;
                maxNumber = array[i - 1];
            }

            if (array[i] == array[i - 1]) {
                currentQuantity++;
            } else {
                currentQuantity = 1;
            }

            System.out.println(array[1] + " appears " + currentQuantity);
        }
        System.out.println("Number " +maxNumber+ " appears " +maxQuantity+ " times");
    }
}

