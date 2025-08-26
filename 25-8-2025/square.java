package application;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("It is a Square.");
        } else {
            System.out.println("It is a Rectangle (not a Square).");
        }

        sc.close();
    }
}
