package com.myntra.Myntra;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.pom.Sdp;

public class Myntra extends Baseclass {
	public static WebDriver driver;
	public static Sdp sdp;
	public static String minimumprice = "";

	public static void browser() {
		driver = browserLaunch();
		sdp = new Sdp(driver);
		launchUrl("https://www.myntra.com/");
	}

	public static void menAndTshirt() throws InterruptedException, AWTException {

		movetoElement(sdp.getMenPage().getMen());
		Thread.sleep(3000);

		clickOnElement(sdp.getMenPage().getMenTshirt());

		String pricevalue = getTextOnElement(sdp.getMenPage().getPrice());

		System.out.println(pricevalue);

		List<WebElement> noOfProduct = sdp.getMenPage().getNoOfProduct();

		int totalProducts = noOfProduct.size();

		System.out.println("Total Products: " + totalProducts);

	}

	public static void lowestPriceOfProducts() throws InterruptedException {

		Thread.sleep(1000);
		movetoElement(sdp.getKidsPage().getKid());

		Thread.sleep(3000);
		clickOnElement(sdp.getKidsPage().getKidTshirt());

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

		WebElement minPriceProduct = webElement("//span[@class='product-discountedPrice'][text()=" + minimumprice
				+ "]//ancestor::div[@class=\"product-productMetaInfo\"]/h3");
		String minPriceProductName = getTextOnElement(minPriceProduct);
		System.out.println("MinimumPriceProduct " + minPriceProductName);
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		browser();
		menAndTshirt();
		lowestPriceOfProducts();

	}
}
