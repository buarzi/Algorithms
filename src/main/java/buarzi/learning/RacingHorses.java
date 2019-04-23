package buarzi.learning;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;

/*
Racing Horses
https://www.codechef.com/problems/HORSES
 */

public class RacingHorses {

    static int findMinimum(int[] array) {
        int output = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int candidate = Math.abs(array[i] - array[j]);
                if (candidate < output) {
                    output = candidate;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int numberOfTestCases;
        int numberOfHorses;
        int[] skillsArray;
        Scanner input = new Scanner(System.in);

        try (input) {
            System.out.print("Enter number of test cases: ");
            if (input.hasNextInt()) {
                numberOfTestCases = input.nextInt();
            } else {
                throw new InputMismatchException("Not an Integer");
            }

            System.out.print("Enter number of horses: ");
            if (input.hasNextInt()) {
                numberOfHorses = input.nextInt();
                skillsArray = new int[numberOfHorses];
            } else {
                throw new InputMismatchException("Not an Integer");
            }

            System.out.println("Enter skills for your horses\n-------------------------------");
            for (int i = 0; i < skillsArray.length; i++) {
                System.out.print("Enter skill for " + (i + 1) + "-th horse: ");
                if (input.hasNextInt()) {
                    skillsArray[i] = input.nextInt();
                } else {
                    throw new InputMismatchException("Not an Integer");
                }
            }
        }

        int answer = findMinimum(skillsArray);
        System.out.println("Minimum: " + answer);

    }
}
