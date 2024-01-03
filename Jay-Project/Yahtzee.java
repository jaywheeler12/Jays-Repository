public class Yahtzee {

    public Die6 die1, die2, die3, die4, die5;

    public Yahtzee() {
        die1 = new Die6();
        die2 = new Die6();
        die3 = new Die6();
        die4 = new Die6();
        die5 = new Die6();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public String summarize() {
        return die1.getValue() + "- 1";
        return die2.getValue() + "- 2";
        return die3.getValue() + "- 3";
        return die4.getValue() + "- 4";
        return die5.getValue() + "- 5";
    }

    public String toString() {
        return die1.getValue() + " " + die2.getValue() + " " +
        die3.getValue() + " " + die4.getValue() + " " + die5.getValue();
    }
}