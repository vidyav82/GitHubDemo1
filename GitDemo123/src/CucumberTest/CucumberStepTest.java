package CucumberTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStepTest {
	
	@Given("^Use for Loop$")
	public void use_for_Loop() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("The Line Use for Loop executed"); 
	}

	@When("^To print all numbers$")
	public void to_print_all_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("To print all numbers executed.");
	}

	@Then("^From (\\d+) to (\\d+)$")
	public void from_to(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Printing numbers.");
	  for(arg1 = 0;arg1<=arg2;arg1++)
	  {
		  System.out.println(arg1);
	  }
	}

}
