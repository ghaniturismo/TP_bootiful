package application;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AdderStory {
    @Steps
    AdderServiceSteps restSteps;

    @Given("a number")
    public void givenANumber() throws Exception {
        restSteps.givenNumber();
    }

    @When("I submit another number $num to adder")
    public void whenISubmitToAdderWithNumber(int num) {
        restSteps.whenAdd(num);
    }

    @Then("I get a sum of the numbers")
    public void thenIGetTheSum() {
        restSteps.thenSummedUp();
    }
}