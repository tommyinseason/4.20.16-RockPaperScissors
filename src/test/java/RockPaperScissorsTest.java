import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner1_rockBeatsScissors_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("rock", "scissors"));
  }
  @Test
  public void checkWinner_scissorsBeatsPaper_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("scissors", "paper"));
  }
  @Test
  public void checkWinner_paperBeatsRock_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("paper", "rock"));
  }
  @Test
  public void checkWinner_tie_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("paper", "paper"));
    assertEquals(true, testGame.checkWinner("rock", "rock"));
    assertEquals(true, testGame.checkWinner("scissors", "scissors"));
  }

}
