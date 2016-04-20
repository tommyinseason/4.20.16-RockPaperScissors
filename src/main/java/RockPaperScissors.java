import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
    HashMap model = new HashMap();
    model.put("template", "templates/home.vtl" );
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  get("/results", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/results.vtl");

    String player1Play = request.queryParams("player1Select");
    String player2Play = request.queryParams("player2Select");
    Integer checkWinner = checkWinner(player1Play, player2Play);

    model.put("result", checkWinner);
    model.put("player1Input", request.queryParams("player1Select"));
    model.put("player2Input", request.queryParams("player2Select"));
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

}

  public static Integer checkWinner (String player1Play, String player2Play) {
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
