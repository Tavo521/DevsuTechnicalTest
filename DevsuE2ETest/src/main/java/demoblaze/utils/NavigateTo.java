package demoblaze.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theDemoblazeHomePage() {
        return Task.where("{0} opens the Demoblaze home page",
                Open.browserOn().the(DemoblazeGoHomePage.class)
        );
    }
}
