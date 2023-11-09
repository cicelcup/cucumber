package com.cicelcup;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppTest 
{
    public Calculator calculator;
    public int result;

    @Given("I have a calculator")
    public void with_two_numbers() {
        calculator = new Calculator();
    }
    @When("I add <number1> and <number2>")
    public void add_the_numbers(int number1, int number2) {
        result = calculator.add(number1, number2);
    }

    @Then("the result should be <sum>")
    public void the_result_should_be(int sum) {
        Assert.assertEquals(result, sum);
    }
}
