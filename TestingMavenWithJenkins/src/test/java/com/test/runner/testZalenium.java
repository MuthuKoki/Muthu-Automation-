package com.test.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class testZalenium {
@Test
public void trail1() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName(BrowserType.FIREFOX);
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	driver.get("https://mail.yahoo.com");
	System.out.println(driver.getTitle());
	Thread.sleep(10000);
	driver.quit();
	
}
	
}
