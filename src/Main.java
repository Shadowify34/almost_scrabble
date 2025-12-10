//Eren Kaya, Scrabble, 10/07/2025
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner to handle input
        Scanner scanner = new Scanner(System.in);

        // Getting the tileset from user
        System.out.println("Enter the set of tiles");
        String tileSet = scanner.nextLine().toLowerCase();

        // Getting the word to be made from the user
        System.out.println("Enter the word to be made");
        String word = scanner.nextLine().toLowerCase();

        // Checking if th give tiles can make the given word
        if (Scrabble.canSpell(tileSet, word)) {
            System.out.println("Scrabble pieces do contain the word " + word + ".");
            // Calculating the score
            int score = Scrabble.score(word);
            System.out.println("The Scrabble score for the word \"" + word + "\" is " + score + " points.");
        } else {
            System.out.println("Scrabble pieces do not contain the word " + word + ".");
        }

        scanner.close();
    }
}




// hi :)