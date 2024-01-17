package demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductsPage {
    public static final Target FIRST_PRODUCT = Target.the("A product from search results")
            .locatedBy("(//img[@class='card-img-top img-fluid'])[1]");

    public static final Target SECOND_PRODUCT = Target.the("A product from search results")
            .locatedBy("(//img[@class='card-img-top img-fluid'])[2]");
    public static final Target HOME = Target.the("Option home in page")
            .locatedBy("//a[contains(text(),'Home')]");
    public static final Target CART = Target.the("Option cart in page")
            .locatedBy("//a[contains(text(),'Cart')]");
    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final Target PLACE_ORDER_BUTTON = Target.the("Place order button")
            .locatedBy("//button[contains(text(), 'Place Order')]");

}
