package com.stepdefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pom.Sdp;
import com.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	public static WebDriver driver = Runner.driver;
	public  Sdp sdp = new Sdp(driver);
	public static String minimumprice = "";

	@Given("^launch The Url$")
	public void launch_The_Url() throws Throwable {
		launchUrl("https://www.myntra.com/");

	}

	@When("^move To Men And Tshirt Tab$")
	public void move_To_Men_And_Tshirt_Tab() throws Throwable {
		movetoElement(sdp.getMenPage().getMen());
		Thread.sleep(3000);

		clickOnElement(sdp.getMenPage().getMenTshirt());
	}

	@When("^get No Of Products$")
	public void get_No_Of_Products() throws Throwable {
		String pricevalue = getTextOnElement(sdp.getMenPage().getPrice());

		System.out.println(pricevalue);

		List<WebElement> noOfProduct = sdp.getMenPage().getNoOfProduct();

		int totalProducts = noOfProduct.size();

		System.out.println("Total Products: " + totalProducts);
	}

	@When("^move To Kids And Tshirt Tab$")
	public void move_To_Kids_And_Tshirt_Tab() throws Throwable {
		Thread.sleep(1000);
		movetoElement(sdp.getKidsPage().getKid());

		Thread.sleep(3000);
		clickOnElement(sdp.getKidsPage().getKidTshirt());

	}

	@When("^get The Minimum Price Of The Products$")
	public void get_The_Minimum_Price_Of_The_Products() throws Throwable {
		Thread.sleep(1000);
		List<WebElement> allPrices = sdp.getKidsPage().getAllPrices();

		ArrayList<Integer> priceList = new ArrayList<>();

		int noOfProducts = allPrices.size();
		System.out.println(noOfProducts);

		for (WebElement price : allPrices) {
			String priceText = getTextOnElement(price);
			String priceValue = priceText.replace("Rs. ", "");
			int priceNo = Integer.parseInt(priceValue);
			System.out.println(priceNo);
			priceList.add(priceNo);
		}
		int minPrice = Collections.min(priceList);
		System.out.println("MinimumPrice: " + minPrice);
		minimumprice = Integer.toString(minPrice);
		System.out.println(minimumprice);

	}

	@Then("^Print the Brand Of Minimum Product Price$")
	public void print_the_Brand_Of_Minimum_Product_Price() throws Throwable {
		WebElement minPriceProduct = webElement("//span[@class='product-discountedPrice'][text()="
				+ minimumprice + "]//ancestor::div[@class=\"product-productMetaInfo\"]/h3");
		String minPriceProductName = getTextOnElement(minPriceProduct);
		System.out.println("MinimumPriceProduct " + minPriceProductName);

	}

}
