import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        cubes(number);
        multiTable(number);
        odds(number);
        evens(number);
    }

    public static void cubes(int number) {
        for (int i = 1; i < number; i++) {
            System.out.println(i * i * i);
        }
    }

    public static void multiTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }

    public static void odds(int number) {
        int sum = 0;
        for (int i = 1; i < number; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }

    public static void evens(int number) {
        int sum = 0;
        for (int i = 0; i < number; i += 2) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }
}
