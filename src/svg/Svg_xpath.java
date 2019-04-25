package svg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Svg_xpath {
	@Test
public void test2() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "E:\\webdriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.highcharts.com/demo/pie-basic");
	WebElement banner = driver.findElement(By.xpath("//div[@id='CybotCookiebotDialog' and @aria-describedby='CybotCookiebotDialogBodyContentTitle']"));
	Actions act = new Actions(driver);
	act.moveToElement(banner).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonAccept']")).click();
	WebElement svg = driver.findElement(By.cssSelector("svg"));
	List<WebElement> outerTxt = svg.findElements(By.cssSelector("text"));
	for(WebElement el:outerTxt ) {
		String acttext = el.getText();
		System.out.println(acttext);
	}
driver.quit();
}
}
