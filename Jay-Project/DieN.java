public class DieN
{
    int sides;
    private int value;
    public DieN(int sides) {
        this.sides = sides;
        this.roll();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int)(Math.random() * sides) + 1;
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }

}

