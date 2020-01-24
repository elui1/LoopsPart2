import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();

    }
    public static void exercise6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void exercise7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void exercise8() {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                sum += 1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void exercise9() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0) && (j % 2 != 0) || (i % 2 == 0) && (j % 2 == 0)) {
                    System.out.print(1);
                }
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void exercise10() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String number = input.next();
        String reverse = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }

        if (number.equals(reverse)) {
            System.out.println(number + " is a palindrome.");
        }
        else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static void exercise11() {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
