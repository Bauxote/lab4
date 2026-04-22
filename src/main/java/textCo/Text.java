package textCo;

/**
 * Represents a full text as an array of {@link Sentence} objects.
 */
public class Text {

    /** The sentences that make up this text. */
    public Sentence[] sentences;

    /**
     * Constructs a Text by normalizing whitespace and splitting into sentences.
     *
     * @param text the raw string to parse
     */
    public Text(String text) {
        text = text.replaceAll("[\\t ]+", " ");
        String[] rawSentences = text.split("(?<=[.!?])");
        sentences = new Sentence[rawSentences.length];
        for (int i = 0; i < rawSentences.length; i++)
            sentences[i] = new Sentence(rawSentences[i].strip());
    }

    /**
     * Returns the full text as a plain string with sentences separated by spaces.
     *
     * @return string representation of the entire text
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences)
            sb.append(s.toString()).append(" ");
        return sb.toString().strip();
    }
}