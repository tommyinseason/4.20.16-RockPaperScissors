public class RockPaperScissors {
  public static void main(String[] args) {

  }

  public Integer checkWinner (String player1Play, String player2Play) {
      Integer result = 0;
      Integer oneWins = 1;
      Integer twoWins = 2;
      Integer draw = 3;
    if (player1Play.equals(player2Play)) {
      result = draw;
    } else if (player1Play.equals("paper") && player2Play.equals("rock")) {
      result = oneWins;
    } else if (player1Play.equals("scissors") && player2Play.equals("paper")) {
      result = oneWins;
    } else if (player1Play.equals("rock") && player2Play.equals("scissors")) {
      result = oneWins;
    } else if (player2Play.equals("paper") && player1Play.equals("rock")) {
      result = twoWins;
    } else if (player2Play.equals("scissors") && player1Play.equals("paper")) {
      result = twoWins;
    } else if (player2Play.equals("rock") && player1Play.equals("scissors")) {
      result = twoWins;
  }
  return result;
 }
}
