package demoblaze.tasks;

import demoblaze.userinterface.ProductsPage;
import demoblaze.utils.AcceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {

    AcceptAlert acceptAlert = new AcceptAlert();

    public static Performable toShoppingCart() {
        return instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ProductsPage.FIRST_PRODUCT),
                Click.on(ProductsPage.ADD_TO_CART_BUTTON));
        AcceptAlert.handleAlert(actor);
        actor.attemptsTo(Click.on(ProductsPage.HOME),
                Click.on(ProductsPage.SECOND_PRODUCT),
                (Click.on(ProductsPage.ADD_TO_CART_BUTTON)));
        AcceptAlert.handleAlert(actor);
        actor.attemptsTo(Click.on(ProductsPage.HOME));
    }
}
