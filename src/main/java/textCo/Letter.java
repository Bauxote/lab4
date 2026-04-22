package textCo;

/**
 * Represents a single character (letter).
 */

public class Letter{

    /** The character value of this letter. */
    public char letter;

    /**
     * Constructs a Letter from a character.
     *
     * @param letter the character to store
     */
    public Letter(char letter){
        this.letter = letter;
    }


    /**
     * Returns the character as a string.
     *
     * @return single-character string
     */
    @Override
    public String toString() {
        return String.valueOf(letter);
    }
}