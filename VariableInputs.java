import java.util.Scanner;

public class VariableInputs {
    private String text;
    private int integer;
    private double dbl;
    private boolean bool;

    public void getInputs(Scanner scanner) {
        System.out.println("Enter a string of text: ");
        this.text = scanner.nextLine();

        System.out.println("Enter an integer: ");
        this.integer = scanner.nextInt();

        System.out.println("Enter a double: ");
        this.dbl = scanner.nextDouble();

        System.out.println("Enter a boolean value: ");
        this.bool = scanner.nextBoolean();
    }

    public void printStory() {
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + dbl);
        System.out.println("Your boolean is " + bool);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VariableInputs variableInputs = new VariableInputs();

        variableInputs.getInputs(scanner);
        variableInputs.printStory();
    }
}

