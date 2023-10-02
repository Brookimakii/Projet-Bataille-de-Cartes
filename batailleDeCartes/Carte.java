package org.example.batailleDeCartes;

import java.util.List;

public class Carte {
  static final List<Character> colorlist = List.of('♥', '♦', '♣', '♠');
  static final List<String> valuelist =
      List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
  private char color;
  private String value;
  
  public Carte(int color, int value) {
    this.color = colorlist.get(color);
    this.value = valuelist.get(value);
  }
  
  public char getColor() {
    return color;
  }
  
  public void setColor(int color) {
    this.color = colorlist.get(color);
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(int value) {
    this.value = valuelist.get(value);
  }
  
  /**
   * Compare the value of two cards.
   * Return different value depending on the case. If the value is:
   * <ul><li>positive the card is indeed stronger.</li>
   * <li>0 the card is the same strength.</li>
   * <li>negative the card is weaker.</li></ul>
   *
   * @param carte the carte to compare to.
   * @return the différence in the cards value.
   */
  public int isStrongerThan(Carte carte) {
    return valuelist.indexOf(this.value) - valuelist.indexOf(carte.value);
  }
  
  @Override
  public String toString() {
    return value + color;
  }
}
