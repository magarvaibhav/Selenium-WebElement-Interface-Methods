package steps;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.WebElementPages;

public class WebElementSteps {

	public WebDriver driver=null;
	public String URL="https://blog.testproject.io/";
	public WebDriverWait wait=null;
	public WebElementPages objWebElementPages=new WebElementPages();
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A714978\\githubnew_workspace\\WebElement\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,60);
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	public void openApplication()
	{
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
			/*
		clear
		click
		findElement
		findElements
		getAttribute
		getCssValue
		getLocation
		getRect
		getSize
		getTagName
		getText
		isDisplayed
		isEnabled
		isSelected
		sendKeys
		submit
		
		*/
	
	public void allMethodsOfWebElement() throws Exception
	{
		
		//getTagName
		WebElement blog=driver.findElement(objWebElementPages.blog);
		
		String name=blog.getTagName();
		System.out.println("Tag Name "+name);
		
		//getText
		String str=driver.findElement(objWebElementPages.subHeading).getText();
		System.out.println("Text Message "+str);

		//isDisplayed
		boolean ret=driver.findElement(objWebElementPages.subHeading).isDisplayed();
		System.out.println("Id Displayed "+ret);

		//isEnabled
		System.out.println("Id Enabled "+driver.findElement(objWebElementPages.subHeading).isEnabled());

		//isSelected
		System.out.println("Id Selected "+driver.findElement(objWebElementPages.subHeading).isSelected());

		//getAttribute
		WebElement footer=driver.findElement(objWebElementPages.blogPost);
		String aValue=footer.getAttribute("style");
		System.out.println("Attribute Value "+aValue);
		
		//getCssValue
		String cssValue=footer.getCssValue("background-image");
		System.out.println("CSS Value 1 "+cssValue);
		
		cssValue=footer.getCssValue("background-size");
		System.out.println("CSS Value 2"+cssValue);
		//getSize
		
		
		Dimension dim=footer.getSize();
		System.out.println("Dimension Height "+dim.height);
		System.out.println("Dimension Width "+dim.width);
		
		System.out.println("Dimension Height "+dim.getHeight());
		System.out.println("Dimension Width "+dim.getWidth());

		//getLocation
		Point pObj=footer.getLocation();
		int x=pObj.getX();
		int y=pObj.getY();
		System.out.println("Location X coordinate "+x+" Location Y coordinate "+y);
		

		//getRect
//		Rectangle rObj=footer.getRect();
//		System.out.println("Reactangle Height "+rObj.getHeight());
//		System.out.println("Reactangle Width "+rObj.getWidth());
//		System.out.println("Reactangle X coordinate "+rObj.getX());
//		System.out.println("Reactangle Y coordinate"+rObj.getY());

//		
	
		
		//findElement
		WebElement content=driver.findElement(objWebElementPages.content);
		
		System.out.println(content.findElement(objWebElementPages.primary).isDisplayed());
		
		//findElements
		List<WebElement> list=content.findElements(objWebElementPages.primary);
		System.out.println(list.size());
		for(WebElement ele:list)
		{
			String value=ele.getAttribute("id");
			System.out.println("Attribute Value :"+value);
		}
		
		
		//click
		driver.findElement(objWebElementPages.login).click();
		wait.until(ExpectedConditions.elementToBeClickable(objWebElementPages.user));
		
		//sendKeys
		driver.findElement(objWebElementPages.user).click();
		driver.findElement(objWebElementPages.user).sendKeys("User");
		System.out.println("textBox filled");
		//clear
		driver.findElement(objWebElementPages.user).click();
		driver.findElement(objWebElementPages.user).clear();
		System.out.println("Clear textBox");
		//submit
		driver.findElement(objWebElementPages.signIn).submit();
		System.out.println("click on submit");
	}
}
