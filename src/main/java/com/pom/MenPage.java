package com.pom;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
	
	public WebDriver driver;
	
	@FindBy (xpath = "//a[@data-group='men']")
	private WebElement men ;
		
	@FindBy (xpath = "//a[@href='/men-tshirts']")
	private WebElement menTshirt;
	
	@FindBy (xpath = "//span[@class='product-discountedPrice']")
	private WebElement price ;
	
	@FindBy (xpath = "//li[@class='product-base']")
	private List<WebElement> noOfProduct ;
    

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMen() {
		return men;
	}


	public WebElement getMenTshirt() {
		return menTshirt;
	}


	public WebElement getPrice() {
		return price;
	}


	public List<WebElement> getNoOfProduct() {
		return noOfProduct;
	}


	public MenPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	


	}