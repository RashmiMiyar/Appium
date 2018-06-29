package com.ebay.Testcase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebay.base.Base;
import com.ebay.pom.ElementEbay;
import com.ebay.utilities.Utilities;

public class EbayRegister extends Base{
	
	WebDriver driver;
	Utilities uti;
	String firstName;
	String lastName;
	String email;
	String password;
	
	@BeforeTest
	public void setUpdriver() throws MalformedURLException {
		driver=appiumRemoteWebDriver();
		uti=new Utilities(driver);
		
	}
	@Test(priority=0)
	public void getdata() throws IOException {
		List<String>list=uti.POI();
       /* for(int i=0;i<arr[0].length;i++) {
        	firstName=arr[i][1];
        	lastName=arr[i][1];
        	email=arr[i][1];
        }*/
		firstName=list.get(0);
		lastName=list.get(1);
		email="hgf078l@jgj.com";//list.get(2);
    	password=uti.Propertyfile();

	}
	@Test(priority=1)
	public void register() throws Exception {
		timeToWait(driver,80);

		click(driver, ElementEbay.register);		
		timeToWait(driver,80);
			sendKeys(driver, ElementEbay.firstname, firstName);
			sendKeys(driver, ElementEbay.lastname, lastName);			
			sendKeys(driver, ElementEbay.email, email);			
   			sendKeys(driver, ElementEbay.passowrd, password);			
        timeToWait(driver,80);
        click(driver,ElementEbay.registerToSign);
        timeToWait(driver,80);
			sendKeys(driver, ElementEbay.address1, "banglore");
			sendKeys(driver, ElementEbay.address2, "banglore");			

			sendKeys(driver, ElementEbay.city, "banglore");			
			sendKeys(driver, ElementEbay.zip, "123456");
            sendKeys(driver,ElementEbay.phone,"9650011731");
         String mailid= driver.findElement(ElementEbay.email).getText();
         
         System.out.println(mailid);
         Assert.assertEquals(email, mailid);

         click(driver,ElementEbay.state); 
       List<WebElement> stateList=  driver.findElements(ElementEbay.selectStatelist);
       stateList.get(2).click();
         click(driver,ElementEbay.checkbox);
         click(driver,ElementEbay.continueBtn);
         timeToWait(driver,80);
         String getName=driver.findElement(ElementEbay.getNameAfterRegister).getText();//Hi Rashmi! 
         String expectName="Hi "+firstName+"!";
         Assert.assertEquals(getName, expectName);
		//click(driver,ElementEbay.returnHome);		

	}
	
	@AfterTest
    public void terminatedriver() throws MalformedURLException {
		//terminate(driver);
	}
}
