import java.util.HashMap;

public class Scrabble {

    // The score map for every letter
    private static final HashMap<Character, Integer> SCORE = new HashMap<>();

    // Setting the letters equal to values
    static {
        addGroup("aeilnorstu", 1);
        addGroup("dg", 2);
        addGroup("bcmp", 3);
        addGroup("fhvwy", 4);
        addGroup("k", 5);
        addGroup("jx", 8);
        addGroup("qz", 10);
    }

    // Add a group of letters that share the same score value
    private static void addGroup(String letters, int value) {
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            SCORE.put(c, value);
        }
    }

    // Determines if the given word can be spelled by the given tiles
    public static boolean canSpell(String tiles, String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = tiles.indexOf(letter);

            // When letter is not found
            if (index == -1) {
                return false;
            }

            // Remove the used tile by remaking the tileset without the found letter
            tiles = tiles.substring(0, index) + tiles.substring(index + 1);
        }
        return true;
    }

    // Calculating the total score
    public static int score(String word) {
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            total += SCORE.get(word.charAt(i));
        }
        return total;
    }
}