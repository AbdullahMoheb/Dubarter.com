package PageObjects;

import org.openqa.selenium.By;

public class SearchFunctionalit{
	
	By Search = By.xpath("//div[@class='t4s-site-nav__icon t4s-site-nav__search']//a[@class='t4s-pr']//*[name()='svg']");
	
	By InputField = By.xpath("//input[@placeholder='Search']");
	
}