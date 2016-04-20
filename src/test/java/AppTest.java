import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567");
    assertThat(pageSource()).contains("Rock Paper Scissors");
  }
  @Test
  public void player2Wins() {
    goTo("http://localhost:4567");
    fill("#player1Select").with("rock");
    fill("#player2Select").with("paper");
    submit(".btn");
    assertThat(pageSource()).contains("2");
}
}
