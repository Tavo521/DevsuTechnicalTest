package stepdefinitions;

import demoblaze.questions.OrderCompleted;
import demoblaze.tasks.AddProducts;
import demoblaze.tasks.FillOrder;
import demoblaze.tasks.ViewProducts;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class BuyProductsStepDefinitions {

    private String user = "user";

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("user login to the shopping page")
    public void userLoginToTheShoppingPage() {
        theActorCalled(user).attemptsTo(new OpenUrl("https://demoblaze.com/index.html"));
    }
    @When("Add products to the shopping cart")
    public void addProductsToTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddProducts.toShoppingCart());
    }
    @When("The shopping cart is displayed with the added products")
    public void theShoppingCartIsDisplayedWithTheAddedProducts() {
        theActorInTheSpotlight().attemptsTo(ViewProducts.inShoppingCart());
    }
    @When("The purchase is completed by filling out the purchase form")
    public void thePurchaseIsCompletedByFillingOutThePurchaseForm() {
        theActorInTheSpotlight().attemptsTo(FillOrder.withPersonalData());
    }
    @Then("The message that the purchase was successfully completed is displayed")
    public void theMessageThatThePurchaseWasSuccessfullyCompletedIsDisplayed() {
        System.out.println(OrderCompleted.text().answeredBy(theActorInTheSpotlight()));
    }
}
