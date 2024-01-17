package demoblaze.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AcceptAlert {

    private AcceptAlert(){

    }
    public static void handleAlert(Actor actor){
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
            String alertText = alert.getText();
            System.out.println("Alert data: " + alertText);
            alert.accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

}
