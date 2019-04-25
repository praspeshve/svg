package svg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SVG_Handling {
@Test
	public void test1() throws InterruptedException
	{		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.highcharts.com/demo/pie-basic");
		Actions act = new Actions(driver);
		//JavascriptExecutor js =(JavascriptExecutor) driver;
		driver.get("https://www.highcharts.com/demo/pie-basic");
		WebElement svg = driver.findElement(By.cssSelector("svg"));
		List<WebElement> txt = svg.findElements(By.cssSelector("text"));
		
		for(WebElement texts:txt) {
			act.moveToElement(texts).build().perform();
			Thread.sleep(3000);
			String txtcollection = texts.getText();
			System.out.println(txtcollection);
			System.out.println();
		}
		
		
		driver.close();
		
		//WebElement ele = driver.findElement(By.xpath("(//*[name()='svg']/*[name()='g']/*[name()='path'])[5]"));
		//List<WebElement> ele = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g']/*[name()='text']/*[name()='tspan']"));
		
	}

}
