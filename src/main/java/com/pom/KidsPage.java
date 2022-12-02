package com.pom;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='/shop/kids']")
	private WebElement kid ;
	
	@FindBy(xpath = "(//a[text()='T-Shirts'])[2]")
	private WebElement kidTshirt ;

	@FindBy(xpath = "//li[@class='product-base']//descendant::div[@class='product-price']/span/span[@class='product-discountedPrice']")
	private List<WebElement> allPrices;
	
	public KidsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getKid() {
		return kid;
	}

	public WebElement getKidTshirt() {
		return kidTshirt;
	}

	public List<WebElement> getAllPrices() {
		return allPrices;
	}

	

	


}
