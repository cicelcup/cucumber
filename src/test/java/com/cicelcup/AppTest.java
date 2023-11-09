package com.cicelcup;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTest 
{
    public int result = 0;
    public int a = 0;
    public int b = 0;

    @Given("With two numbers 2,3")
    public void with_two_numbers() {
        a = 2;
        b = 3;
    }

    @When("add the numbers")
    public void add_the_numbers() {
        Calculator calculator = new Calculator();
        result = calculator.add(a, b);
    }

    @Then("the result should be 5")
    public void the_result_should_be() {
        Assert.assertEquals(result, 5);
    }
}
