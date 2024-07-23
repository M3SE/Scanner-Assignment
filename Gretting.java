import java.util.Scanner;

public class Gretting {

    public static void main(String[] args) {
        // Creates scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");

        String name = scanner.nextLine();

        System.out.println("Hi " + name);
    }
}