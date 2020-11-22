package LPL;

/*
 * This class has stored details of LPL club including the performance measures
 * and determine their position in the league.
 * This has Comparable interfaces which determines how clubs will be stored
 */



public class lplclub implements Comparable<lplclub> {
  private int position;
  private String lplclub;
  private int played;
  private int won;
  private int drawn;
  private int lost;
  private int pointsFor;
  private int pointsAgainst;
  private int pointsDifference;
  private int triesFor;
  private int triesAgainst;
  private int tryBonus;
  private int losingBonus;
  private int points;

  public lplclub(int position, String lplclub, int played, int won, int drawn,
      int lost, int pointsFor, int pointsAgainst, int pointsDifference,
      int triesFor, int triesAgainst, int tryBonus, int losingBonus,
      int points) {
    this.position = position;
    this.lplclub = lplclub;
    this.played = played;
    this.won = won;
    this.drawn = drawn;
    this.lost = lost;
    this.pointsFor = pointsFor;
    this.pointsAgainst = pointsAgainst;
    this.pointsDifference = pointsDifference;
    this.triesFor = triesFor;
    this.triesAgainst = triesAgainst;
    this.tryBonus = tryBonus;
    this.losingBonus = losingBonus;
    this.points = points;
  }

  public String toString() {
    return String.format("%-3d%-20s%10d%10d%10d", position, lplclub, pointsFor,
        pointsAgainst, points);
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public String getClub() {
    return lplclub;
  }

  public void setClub(String club) {
    this.lplclub = club;
  }

  public int getPlayed() {
    return played;
  }

  public void setPlayed(int played) {
    this.played = played;
  }

  public int getWon() {
    return won;
  }

  public void setWon(int won) {
    this.won = won;
  }

  public int getDrawn() {
    return drawn;
  }

  public void setDrawn(int drawn) {
    this.drawn = drawn;
  }

  public int getLost() {
    return lost;
  }

  public void setLost(int lost) {
    this.lost = lost;
  }

  public int getPointsFor() {
    return pointsFor;
  }

  public void setPointsFor(int pointsFor) {
    this.pointsFor = pointsFor;
  }

  public int getPointsAgainst() {
    return pointsAgainst;
  }

  public void setPointsAgainst(int pointsAgainst) {
    this.pointsAgainst = pointsAgainst;
  }

  public int getPointsDifference() {
    return pointsDifference;
  }

  public void setPointsDifference(int pointsDifference) {
    this.pointsDifference = pointsDifference;
  }

  public int getTriesFor() {
    return triesFor;
  }

  public void setTriesFor(int triesFor) {
    this.triesFor = triesFor;
  }

  public int getTriesAgainst() {
    return triesAgainst;
  }

  public void setTriesAgainst(int triesAgainst) {
    this.triesAgainst = triesAgainst;
  }

  public int getTryBonus() {
    return tryBonus;
  }

  public void setTryBonus(int tryBonus) {
    this.tryBonus = tryBonus;
  }

  public int getLosingBonus() {
    return losingBonus;
  }

  public void setLosingBonus(int losingBonus) {
    this.losingBonus = losingBonus;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
  
  public int compareTo(lplclub c) {
    return ((Integer) pointsFor).compareTo(c.pointsFor);
  }


}
