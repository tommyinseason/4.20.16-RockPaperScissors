public class RockPaperScissors {
  public static void main(String[] args) {

  }

  public Boolean checkWinner (String player1Play, String player2Play) {
    if (player1Play.equals(player2Play)) {
      return true;
    } else if (player1Play.equals("paper") && player2Play.equals("rock")) {
      return true;
    } else if (player1Play.equals("scissors") && player2Play.equals("paper")) {
      return true;
    } else if (player1Play.equals("rock") && player2Play.equals("scissors")) {
      return true;
    }
    return false;
  }
}
