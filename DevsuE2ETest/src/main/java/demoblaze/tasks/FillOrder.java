package demoblaze.tasks;

import demoblaze.userinterface.FormPlaceOrder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Andres").into(FormPlaceOrder.NAME),
                (Enter.theValue("Colombia").into(FormPlaceOrder.COUNTRY)),
                (Enter.theValue("Medellín").into(FormPlaceOrder.CITY)),
                (Enter.theValue("1111222233334444").into(FormPlaceOrder.CREDIT_CARD)),
                (Enter.theValue("12").into(FormPlaceOrder.MONTH)),
                (Enter.theValue("27").into(FormPlaceOrder.YEAR)),
                Click.on(FormPlaceOrder.PURCHASE));
    }

    public static Performable withPersonalData(){
        return instrumented(FillOrder.class);
    }
}
