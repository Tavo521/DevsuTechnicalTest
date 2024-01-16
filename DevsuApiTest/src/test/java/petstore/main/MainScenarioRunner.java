package petstore.main;

import com.intuit.karate.junit5.Karate;

public class MainScenarioRunner {

    @Karate.Test
    Karate mainScenario(){
        return Karate.run().relativeTo(getClass());
    }
}
