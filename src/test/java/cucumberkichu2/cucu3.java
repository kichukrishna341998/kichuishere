package cucumberkichu2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucu3 {



	 @Given("I enter {int} in the calculator")
	   public void first_value1(int num)
	   {
		   System.out.println("First value: "+num);
	   }  
		@And("I press {word}")
		public void addition1(String key) 
		{
			System.out.println("I press "+key);
		}
		
		@And("I have entered {int} in the calculator")
		public void second_value1(int num)
		{
			System.out.println("Second value "+num);
		}
	    
		@When("I press {word} symbol")
		public void equals1(String key)
		{
			System.out.println("I press symbol "+key);
		}
		@Then("The result should be {int} on the screen")
				public void result1(int num)
				{
					System.out.println("The result should be "+num+"on the screen");
				}

		}
