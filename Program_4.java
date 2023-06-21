package test;

import java.util.Arrays;
import java.util.List;

public class Program_4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> dictionary = Arrays.asList(10, 12, 15, 18, 20, 21, 24, 27, 30, 35);

        int totalCount = 0;
        for (int number : dictionary) {
            for (int multiple : numbers) {
                if (number % multiple == 0) {
                    totalCount++;
                    break;
                }
            }
        }

        System.out.println("Total count of numbers that are multiples: " + totalCount);
    }
}
