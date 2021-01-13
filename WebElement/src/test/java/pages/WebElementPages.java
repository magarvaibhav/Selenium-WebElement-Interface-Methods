package pages;

import org.openqa.selenium.By;

public class WebElementPages{

	
	public By blogPost=By.xpath("//h4[text()='Other Blog Posts']");
	public By content=By.id("content");
	public By primary=By.id("primary");
	public By blog=By.xpath("//ul[@id='menu-top-menu']//a[@title='Blog']");
	public By login=By.xpath("//ul[@id='menu-login-signup-menu-1']//a[text()='Login']");
	public By subHeading=By.xpath("//h1[@class='main-heading with-subheading']");

	
	public By signIn=By.id("tp-sign-in");
	public By user=By.id("username");
}
