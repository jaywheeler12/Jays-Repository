public class Die6x
{
  private int value;
  public Die6x() {
    this.roll();
  }
  public int getValue() {
    return value;
  }

  public void roll() {
    this.value = (int)(Math.random() * 6) + 1;
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

