import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissorsPlayer1_1() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)1, testGame.checkWinner("rock", "scissors"));
  }
  @Test
  public void checkWinner_scissorsBeatsPaperPlayer1_1() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)1, testGame.checkWinner("scissors", "paper"));
  }
  @Test
  public void checkWinner_paperBeatsRockPlayer1_1() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)1, testGame.checkWinner("paper", "rock"));
  }
  @Test
  public void checkWinner_rockBeatsScissorsPlayer2_2() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)2, testGame.checkWinner("scissors", "rock"));
  }
  @Test
  public void checkWinner_scissorsBeatsPaperPlayer2_2() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)2, testGame.checkWinner("paper", "scissors"));
  }
  @Test
  public void checkWinner_paperBeatsRockPlayer2_2() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)2, testGame.checkWinner("rock", "paper"));
  }
  @Test
  public void checkWinner_tie_3() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals((Integer)3, testGame.checkWinner("paper", "paper"));
    assertEquals((Integer)3, testGame.checkWinner("rock", "rock"));
    assertEquals((Integer)3, testGame.checkWinner("scissors", "scissors"));
  }

}
