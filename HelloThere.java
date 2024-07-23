import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
            // Creates scanner for reading user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello there! How are you doing today?");

            String mood = scanner.nextLine();

            System.out.println("Interesting that you're feeling " + mood + "...Tell me more about yourself!");

            String yourself = scanner.nextLine();

            System.out.println("Nice chatting with you! Goodbye!");
    }
}
