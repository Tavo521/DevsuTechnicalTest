package demoblaze.tasks;

import demoblaze.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductsPage.CART),
                Click.on(ProductsPage.PLACE_ORDER_BUTTON));
    }

    public static Performable inShoppingCart() {
        return instrumented(ViewProducts.class);
    }
}
