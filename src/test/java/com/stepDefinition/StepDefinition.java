package com.stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	WebDriver driver;
	
	@Given("Enter into Amazon Website")
	public void enter_into_Amazon_Website() 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Prakash\\SurenCucumber\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("Search in Amazon search")
	public void search_in_Amazon_search() 
	{
	    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    search.sendKeys("mobiles");
	    search.sendKeys(Keys.ENTER);
		
		
	}

	@Then("Print all the result and quit")
	public void print_all_the_result_and_quit() 
	{
		List<WebElement> allmoboptions = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement webElement : allmoboptions) 
		{
			System.out.println(webElement.getText());
		}
	}



}
