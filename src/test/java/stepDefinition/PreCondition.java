package stepDefinition;

import io.cucumber.java.en.Given;

public class PreCondition {
	@Given ("check the network")
	public void checkTheNetwork()
	{
		System.out.println("net work is connected");
	}
	
	@Given ("verify the excel")
	public void verifyTheExcel()
	{
		System.out.println("excel is verified");
	}
	
}
