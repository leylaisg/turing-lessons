package az.edu.turing.module01.lesson05.tasks;

import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        short a = scn.nextShort();
        short b = scn.nextShort();
        System.out.println(2 * (a + b));
    }
}
