package org.example.batailleDeCartes;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
  private List<Carte> hand;
  
  public int getScore() {
    return score;
  }
  
  private int score;
  
  public Joueur() {
    this.hand = new ArrayList<>();
    this.score = 0;
  }
  
  public void addCard(Carte carte) {
    hand.add(carte);
  }
  
  public Carte drawCard(List<Carte> deck) {
    int i = (int) (Math.random() * deck.size());
    Carte carte = deck.get(i);
    addCard(carte);
    deck.remove(carte);
    return carte;
  }
  
  public void addScore() {
    this.score += 1;
  }
}
