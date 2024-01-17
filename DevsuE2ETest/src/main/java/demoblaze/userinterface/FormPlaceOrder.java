package demoblaze.userinterface;

import org.openqa.selenium.By;

public class FormPlaceOrder {

    public static By NAME = By.id("name");
    public static By COUNTRY = By.id("country");
    public static By CITY = By.id("city");
    public static By CREDIT_CARD = By.id("card");
    public static By MONTH = By.id("month");
    public static By YEAR = By.id("year");
    public static By PURCHASE = By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]");

}
