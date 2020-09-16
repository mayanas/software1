package acceptance_tests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main_p.Checkout;
import main_p.Products;


public class checkoutSteps {
	private int total=0,flag=0;
	private Checkout checkout;
	private ArrayList<Products> products=new ArrayList<Products>();
	private Products p;
        
		@Given("the price of a {string} is {int}")
		public void thePriceOfAIs(String string, Integer int1) {
			for(Products pr:products) {
				if(pr.getProd().equals(string)) {
					pr.setPrice(int1);
					flag=1;
					break;
				}
			}
			if(flag==0) {
			p=new Products();
			p.setProd(string);
			p.setPrice(int1);
			products.add(p);}
		}
		@When("I checkout {int} {string}")
		public void iCheckout(Integer int1, String string) {
		   checkout=new Checkout();
		   for(Products pr:products) {
						if(pr.getProd().equals(string)) {
							total+=checkout.total(int1, pr.getPrice());
						}
			}
		   
		}
		@Then("the total price should be {int}")
		public void theTotalPriceShouldBe(Integer int1) {
		    assertTrue(int1==total);
		}


	

}
