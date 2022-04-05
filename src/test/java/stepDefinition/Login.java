package stepDefinition;

import static org.junit.Assert.assertArrayEquals;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Login {
	public WebDriver wd;



@After
public void TearDown(Scenario s) throws IOException
{
	if(s.isFailed())
	{
	File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Users\\SELVAAMOJO\\eclipse-workspace\\G1_ScreenShot\\screenshot\\failed.png"));
	}
}



	@Given ("open the browser {string}")
	
	public void openTheBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{	
		WebDriverManager.chromedriver().setup();
	    wd=new ChromeDriver();
	    wd.manage().window().maximize();
	  	}
	     else if(browser.equals("firefox"))
	    {
	     WebDriverManager.firefoxdriver().setup();
	     wd=new FirefoxDriver();
	     wd.manage().window().maximize();
	     
	     }
		
	}
	
	
	@When ("enter the url {string}")
	public void enterTheUrl(String url)
    {
		wd.get(url);
	}
	
	@And ("click the login link")
	public void clickTheLoginLink()
	{
		wd.findElement(By.linkText("Login")).click();
	}
	
	@When ("enter the username {string}")
	public void enterTheUserName(String username)
	{
		
		wd.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
	}
	@And ("enter the password {string}") 
	
	public void enterThePassword(String password)
	
	{
		int i=1/0;
		wd.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		
	}
	
	
	@And ("click the login button")
	public void clickTheLoginButton()
	{
		wd.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then ("verify login success or not")
	public void verifyLoginSuccessOrNot()
	{
	   String expected= "Technologies";
	 WebElement data=  wd.findElement(By.xpath("//em[text()='Technologies']"));
	 String text=  data.getText();
	 Assert.assertEquals(expected, text);
	 
    }
	
}
