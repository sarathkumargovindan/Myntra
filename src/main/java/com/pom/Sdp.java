package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {

	public WebDriver driver;
	public MenPage mp;
	public KidsPage kp;

	public Sdp(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public MenPage getMenPage() {
		if (mp == null) {
			mp = new MenPage(driver);

		}
		return mp;
	}

	public KidsPage getKidsPage() {
		if (kp == null) {
			kp = new KidsPage(driver);
		}
		return kp;
	}

}
