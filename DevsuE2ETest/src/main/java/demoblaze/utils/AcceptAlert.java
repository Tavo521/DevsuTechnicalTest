package demoblaze.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.htmlunit.AlertHandler;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class AcceptAlert {

    private AcceptAlert(){

    }
    private static final Logger LOGGER = LoggerFactory.getLogger(AlertHandler.class);

    public static void handleAlert(Actor actor) {
        Duration timeout = Duration.ofSeconds(3);
        waitUntilAlertIsPresent(actor, timeout);

        try {
            Alert alert = switchToAlert(actor);
            String alertText = alert.getText();
            LOGGER.info("Alert data: {}", alertText);
            alert.accept();
        } catch (NoAlertPresentException e) {
            LOGGER.error("No alert present: {}", e.getMessage());
        }
    }

    private static Alert switchToAlert(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().switchTo().alert();
    }

    private static void waitUntilAlertIsPresent(Actor actor, Duration timeoutInSeconds) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);

        try {
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            LOGGER.error("Timed out waiting for alert to be present: {}", e.getMessage());
        }
    }

}
