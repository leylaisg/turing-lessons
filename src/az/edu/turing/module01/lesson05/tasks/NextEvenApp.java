package az.edu.turing.module01.lesson05.tasks;

import java.util.Scanner;

public class NextEvenApp {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n % 2 == 0){
            System.out.println(n + 2);
        } else {
            System.out.println(n + 1);
        }
    }
}