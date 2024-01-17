package demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FormPlaceOrder {

    public static final Target NAME = Target.the("Text box name")
            .locatedBy("//input[@id='name']");
    public static final Target COUNTRY = Target.the("Text box contry")
            .locatedBy("//input[@id='country']");
    public static final Target CITY = Target.the("Text box city")
            .locatedBy("//input[@id='city']");
    public static final Target CREDIT_CARD = Target.the("Text box credit card")
            .locatedBy("//input[@id='card']");
    public static final Target MONTH = Target.the("Text box month")
            .locatedBy("//input[@id='month']");
    public static final Target YEAR = Target.the("Text box year")
            .locatedBy("//input[@id='year']");
    public static final Target PURCHASE = Target.the("Purchase button")
            .locatedBy("//button[contains(text(), 'Purchase')]");

}
