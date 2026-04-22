package textCo;

/**
 * Represents a sentence as an array of {@link Word} objects.
 */
public class Sentence {

    /** The words that make up this sentence. */
    public Word[] words;

    /**
     * Constructs a Sentence by splitting a string on whitespace and punctuation.
     *
     * @param sentence the string to parse into words
     */
    public Sentence(String sentence) {
        String[] splitWords = sentence.split("[\\s,.!?]+");
        words = new Word[splitWords.length];
        for (int i = 0; i < splitWords.length; i++)
            words[i] = new Word(splitWords[i]);
    }

    /**
     * Returns the sentence as a plain string with words separated by spaces.
     *
     * @return space-separated string of all words
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}