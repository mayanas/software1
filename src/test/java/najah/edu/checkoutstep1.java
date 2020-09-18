package najah.edu;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class checkoutstep1 {
	private chekout c=new chekout (); ;
	ArrayList <Integer> price=new ArrayList <Integer>();
	ArrayList <String> name=new ArrayList <String>();
	@Given("the price of a {string} is {int}")
		public void thePriceOfAIs(String itemname, Integer pr) {
		    // Write code here that turns the phrase above into concrete actions
		 price .add(pr);
		 name.add(itemname);
		}
 

		@When("I checkout {int} {string}")
		public void iCheckout(Integer itemcount, String string) {
		    // Write code here that turns the phrase above into concrete actions
			 
			for (int i=0;i<name.size();i++) { 
				if (string.compareToIgnoreCase(name.get(i))==0) {c.add(itemcount,price.get(i));}}
				
		        
		   }
		
		
		@Then("the total price should be {int}")
		public void theTotalPriceShouldBe(Integer pr) {
		    // Write code here that turns the phrase above into concrete actions
		    assertEquals(pr.intValue(), c.total());
		}
}