package test;

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(i);
            if (i < a) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
