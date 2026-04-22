package textCo;

import org.junit.Assert;
import org.junit.Test;

public class ClassesTest {

    // Letter

    @Test
    public void testLetterToString() {
        Letter l = new Letter('a');
        Assert.assertEquals("a", l.toString());
    }

    @Test
    public void testLetterStoresChar() {
        Letter l = new Letter('z');
        Assert.assertEquals('z', l.letter);
    }

    // Word

    @Test
    public void testWordToString() {
        Word w = new Word("hello");
        Assert.assertEquals("hello", w.toString());
    }

    @Test
    public void testWordLetterCount() {
        Word w = new Word("hello");
        Assert.assertEquals(5, w.letters.length);
    }

    @Test
    public void testWordLetterValues() {
        Word w = new Word("cat");
        Assert.assertEquals('c', w.letters[0].letter);
        Assert.assertEquals('a', w.letters[1].letter);
        Assert.assertEquals('t', w.letters[2].letter);
    }

    @Test
    public void testWordEqualsIdentical() {
        Word w1 = new Word("hello");
        Word w2 = new Word("hello");
        Assert.assertTrue(w1.equals(w2));
    }

    @Test
    public void testWordEqualsDifferent() {
        Word w1 = new Word("hello");
        Word w2 = new Word("world");
        Assert.assertFalse(w1.equals(w2));
    }

    @Test
    public void testWordEqualsSameReference() {
        Word w1 = new Word("hello");
        Assert.assertTrue(w1.equals(w1));
    }

    @Test
    public void testWordEqualsNull() {
        Word w1 = new Word("hello");
        Assert.assertFalse(w1.equals(null));
    }

    @Test
    public void testWordHashCodeSameForEqualWords() {
        Word w1 = new Word("hello");
        Word w2 = new Word("hello");
        Assert.assertEquals(w1.hashCode(), w2.hashCode());
    }

    // Sentence

    @Test
    public void testSentenceToStringSimple() {
        Sentence s = new Sentence("Hello world");
        Assert.assertEquals("Hello world", s.toString());
    }

}
