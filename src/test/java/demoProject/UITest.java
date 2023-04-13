package demoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {
	public static WebDriver driver;
	
	@Test
	public void checkProductName() throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		List<WebElement>items=driver.findElements(By.className("a-size-medium"));
		
		if(items.get(0).getText().contains("Apple iPhone"))
		{
			System.out.println("Item contains Apple Iphone");
		}
		
		driver.close();
		
	}

}
