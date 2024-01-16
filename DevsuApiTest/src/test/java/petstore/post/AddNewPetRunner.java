package petstore.post;

import com.intuit.karate.junit5.Karate;

public class AddNewPetRunner {
    @Karate.Test
    Karate addNewPet(){
        return Karate.run().relativeTo(getClass());
    }
}
