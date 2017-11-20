package CucumberStepDefenitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefs {
    @Given("Print test annotation (.*)")
    public void print_test_annotation (String annotation) {
        System.out.println(annotation);
    }

    @When("we are sending data to server ")
    public void sending_data_to_server() {
    }
}
