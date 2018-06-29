package com.ebay.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface ElementEbay {
	
	public static final By register=By.xpath("//android.widget.Button[contains(@text, 'Register')]");
	public static final By firstname= By.xpath("//android.widget.EditText[contains(@resource-id, 'firstname')]");
	public static final By lastname= By.xpath("//android.widget.EditText[contains(@resource-id, 'lastname')]");
	public static final By email= By.xpath("//android.widget.EditText[contains(@resource-id, 'email')]");
	public static final By passowrd= By.xpath("//android.widget.EditText[contains(@resource-id, 'PASSWORD')]");
	public static final By returnHome=By.id("com.ebay.mobile:id/home");
	public static final By suggestionList= By.id("com.ebay.mobile:id/suggestionList");
	public static final By itemList=By.id("com.ebay.mobile:id/cell_collection_item");
	public static final By registerToSign=By.xpath("//android.widget.Button[contains(@text, 'Register') and @index='0']");
			//By.xpath("//android.widget.Button[contains(@resource-id, 'ppaFormSbtBtn')]");
			//By.id("android.widget.Button:id/ppaFormSbtBtn");
	public static final By address1= By.xpath("//android.widget.EditText[contains(@resource-id, 'address1')]");
	public static final By address2= By.xpath("//android.widget.EditText[contains(@resource-id, 'address2')]");
	public static final By city= By.xpath("//android.widget.EditText[contains(@resource-id, 'city')]");
	public static final By zip= By.xpath("//android.widget.EditText[contains(@resource-id, 'zip')]");
	public static final By state= By.xpath("//android.widget.Spinner[contains(@resource-id, 'state')]");
	public static final By phone= By.xpath("//android.widget.EditText[contains(@resource-id, 'phoneFlagComp1')]");
	public static final By checkbox= By.xpath("//android.widget.CheckBox[contains(@text, 'I have read and agree to the eBay.in User Agreement, User Privacy Notice, Rules and Policies and the PaisaPay User Agreement. I have also read and agree to the eBay.com User Agreement and acknowledge reading the eBay.com User Privacy Notice.')]");
   public static final By itemName=By.id("com.ebay.mobile:id/textview_item_name");
   public static final By itemprice=By.id("com.ebay.mobile:id/textview_item_price");
   public static final By continueBtn=By.xpath("//android.widget.Button[contains(@resource-id,'sbtBtn')]");
   public static final By selectStatelist=By.id("android:id/text1");
   public static final By getNameAfterRegister=By.xpath("//android.widget.Button[contains(@resource-id,'gh-ug')]");



	
	
	
	
	
	//android.widget.CheckBox
	//I have read and agree to the eBay.in User Agreement, User Privacy Notice, Rules and Policies and the PaisaPay User Agreement. I have also read and agree to the eBay.com User Agreement and acknowledge reading the eBay.com User Privacy Notice.

	
}