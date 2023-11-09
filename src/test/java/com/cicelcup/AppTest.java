package com.cicelcup;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTest 
{
    public int result = 0;
    public int a = 0;
    public int b = 0;
    @Test(priority = 0)
    @Given("With two numbers 2,3")
    public void with_two_numbers() {
        a = 2;
        b = 3;
    }
    @Test(priority = 1)
    @When("add the numbers")
    public void add_the_numbers() {
        Calculator calculator = new Calculator();
        result = calculator.add(a, b);
    }

    @Test(priority = 2)
    @Then("the result should be 5")
    public void the_result_should_be() {
        Assert.assertEquals(result, 5);
    }
}
