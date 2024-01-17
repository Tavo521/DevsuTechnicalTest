package demoblaze.questions;

import demoblaze.userinterface.OrderSuccess;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class OrderCompleted implements Question<String> {

    public static Question<String> text() {
        return new OrderCompleted();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(OrderSuccess.THANKS_TEXT).getText();
    }
}
