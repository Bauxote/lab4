package textCo;

/**
 * Represents a word as an array of {@link Letter} objects.
 */
public class Word {

    /** The letters that make up this word. */
    public Letter[] letters;

    /**
     * Constructs a Word by splitting a string into individual letters.
     *
     * @param word the string to convert into a Word
     */
    public Word(String word) {
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }

    /**
     * Returns the word as a plain string.
     *
     * @return concatenated string of all letters
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) sb.append(l);
        return sb.toString();
    }

    /**
     * Checks equality based on string content.
     *
     * @param obj the object to compare with
     * @return {@code true} if both words have the same string value
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word other = (Word) obj;
        return this.toString().equals(other.toString());
    }

    /**
     * Returns a hash code based on the string value of the word.
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}