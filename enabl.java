package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addworklog {
	@Test
	public void loginTest() {
		System.out.println("Start test");

		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open test page
		String url = "https://mycc-staging.n13.ro/profile";
		driver.get(url);
		System.out.println("Page is opened. ");
		
		// maximize browser window
		driver.manage().window().maximize();

		//login
		//click on email bar
		//xpath //*[@id="example-input-group-1"]/input
		WebElement clicka = driver.findElement(By.xpath("//*[@id=\"example-input-group-1\"]/input"));
		clicka.click();
		
		//enter email cctestuser3@yopmail.com
		WebElement write2 = driver.findElement(By.id("comments-minutes-input"));
		write2.sendKeys("cctestuser3@yopmail.com");
		
		//click on password bar
		//xpath //*[@id="example-input-group-2"]/input
		WebElement clickb = driver.findElement(By.xpath("//*[@id=\"example-input-group-2\"]/input"));
		clickb.click();
		
		//enter password CCTest@2021
		//enter email cctestuser3@yopmail.com
		WebElement write3 = driver.findElement(By.id("comments-minutes-input"));
		write3.sendKeys("cctestuser3@yopmail.com");
		
		//click sign in
		WebElement clickc = driver.findElement(By.xpath("//*[@id=\"kt_login_signin_form\"]/div[4]/div/div/button"));
		clickc.click();

		// click the options in the upper left corner
		WebElement click1 = driver.findElement(By.id("kt_aside_mobile_toggle"));
		click1.click();
		
	
		// click my timesheet
		WebElement click2 = driver.findElement(By.id(""));// can't find the id here
		click2.click();

		// click my calendar
		WebElement click3 = driver.findElement(By.name(""));// can't find id
		click3.click();

		// click on a date
		WebElement click4 = driver.findElement(By.id(""));// no id
		click4.click();

		// click on project
		WebElement click5 = driver.findElement(By.id("project-input"));// no id
		click5.click();

		// choose my cc test project
		// cannot hover over the options, my choice is set automatically since I first
		// chose an option

		// click on task
		WebElement click6 = driver.findElement(By.id("task-input"));
		click6.click();

		// choose development back test
		// cannot hover over the options, my choice is set automatically since I first
		// chose an option

		// click on hours
		WebElement clicke = driver.findElement(By.xpath("//*[@id=\"__BVID__908\"]/div/span/input"));
		clicke.click();

		// choose hours
		// cannot hover over options

		// choose minutes
		// cannot hover over options

		// click on comments
		WebElement click7 = driver.findElement(By.id("comments-minutes-input"));
		click7.click();

		// write "I need twenty characters. At least!"
		WebElement write1 = driver.findElement(By.id("comments-minutes-input"));
		write1.sendKeys("I need twenty characters. At least!");

		// click save log
		// cannot find id   //*[@id="logWorkModal___BV_modal_footer_"]/div/div/button
		WebElement click7 = driver.findElement(By.xpath("//*[@id=\"logWorkModal___BV_modal_footer_\"]/div/div/button"));
		click7.click();
		
		// verification:
		
		  //new url 
		  String expectedUrl = "https://mycc-staging.n13.ro/timesheet/calendar?calendarView=month";
		  String actualUrl = driver.getCurrentUrl(); Assert.assertEquals(actualUrl,
		  expectedUrl, "Actual page is not the same as expected");

		  //the day is not empty in calendar
		  //don't know how to check
		  
		// close browser
		driver.quit();
	}
}
