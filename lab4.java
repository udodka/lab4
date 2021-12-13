package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class lab4 {

    public static void main(String[] args) {
        int count = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("input elements:");
        String numbers = in.nextLine();

        while (in.hasNextLine()) {
            if (in.hasNextInt()) {
                count++;
                numbers = numbers + in.nextLine() + " ";
            } else {
                if (in.nextLine().equals("quit")) {
                    break;
                } else {
                    System.out.println("input integer numbers");
                }
            }
        }
        System.out.print("input X:");
        int X = in.nextInt();

        in.close();

        String strArray[] = numbers.split(" ");
        int numArray[] = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numArray[i] = Integer.parseInt(strArray[i]);
        }
        System.out.println("original array:" + Arrays.toString(numArray));

        int n = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == X) {
                n++;
            }
        }

        int copyArray[] = new int[numArray.length - n];
        int copyArrayIndex = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != X) {
                copyArray[copyArrayIndex++] = numArray[i];
            }
        }
        System.out.println("modified array:" + Arrays.toString(copyArray));
    }
}



