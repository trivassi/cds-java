
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

  get("/", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  post("/", (request, response) -> {
    Map<String, Object> model = new HashMap<String, Object>();

    ArrayList<CD> cds = request.session().attribute("cds");
    if (cds == null) {
      cds = new ArrayList<CD>();
      request.session().attribute("cds", cds);
    }

    String genre = request.queryParams("genre");
    String artist = request.queryParams("artist");
    String album = request.queryParams("album");
    CD newCD = new CD(genre, artist, album);
    cds.add(newCD);

    model.put("cds", cds);
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

}
