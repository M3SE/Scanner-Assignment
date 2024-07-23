import java.util.Scanner;

public class Superhero {
    private String heroName;
    private String superpower;

    public void getHeroName(Scanner scanner) {
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        this.heroName = scanner.nextLine();
    }

    public void getSuperpower(Scanner scanner) {
        System.out.println("What is their superpower?");
        this.superpower = scanner.nextLine();
    }

    public void printStory() {
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superpower + " to save the world.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Superhero superhero = new Superhero();

        superhero.getHeroName(scanner);
        superhero.getSuperpower(scanner);
        superhero.printStory();
    }
}
