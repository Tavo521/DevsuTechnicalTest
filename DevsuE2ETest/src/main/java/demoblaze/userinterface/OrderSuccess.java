package demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class OrderSuccess {
    public static final Target THANKS_TEXT = Target.the("")
            .locatedBy("//div[@class='sweet-alert  showSweetAlert visible']//h2");

}
