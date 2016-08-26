package com.codurance.systemtests;

import com.codurance.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppStepDefinitions {

    private App app;
    private String result;

    @Given("^I have a hello app$")
    public void i_have_a_hello_app() throws Throwable {
        app = new App();
    }

    @When("^I ask it to say hello$")
    public void i_ask_it_to_say_hello() throws Throwable {
        result = app.sayHello();
    }

    @Then("^it should answer with \"([^\"]*)\"$")
    public void it_should_answer_with(String arg1) throws Throwable {
        assertThat(result, is("hello!"));
    }
}
