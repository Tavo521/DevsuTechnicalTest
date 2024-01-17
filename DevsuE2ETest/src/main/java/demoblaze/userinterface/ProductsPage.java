package demoblaze.userinterface;

import org.openqa.selenium.By;

public class ProductsPage {
    public static By FIRST_PRODUCT = By.xpath("//*[@id='tbodyid']/div[1]/div/a");
    public static By SECOND_PRODUCT = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    public static By HOME = By.xpath("//*[@id='navbarExample']/ul/li[1]/a");
    public static By CART = By.xpath("//*[@id='navbarExample']/ul/li[4]/a");
    public static By ADD_TO_CART_BUTTON = By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    public static By PLACE_ORDER = By.xpath("//*[@id='page-wrapper']/div/div[2]/button");

}
