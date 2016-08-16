package provas.s20152.p220152.q1;

public class WordSense {

    /**
     * @associates <{provas.s20152.p220152.Word}>
     */
    public Word word;
    public Synset synset = null;

    public WordSense(Word word) {
        this.word = word;
        word.addWordSense(this);
    }
}
