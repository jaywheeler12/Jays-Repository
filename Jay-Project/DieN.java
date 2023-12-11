public class DieN
{
  private int value;
  public DieN() {
    this.roll();
  }
  public int getValue() {
    return value;
  }
  public void roll() {
    this.value = (int)(Math.random() * 20) + 1;
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

