package POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;
import Utilities.Excel;

public class HealthInsurance extends BasePage {
	
	public HealthInsurance(WebDriver driver) {
		super(driver);	
	}
	
	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/Book3.xlsx";

	
	@FindBy (xpath="//a[contains(text(),'Insurance Products ')]")
	WebElement clickinsuranceproducts;
	
	@FindBy (xpath="(//a[@class='headlink'])[4]")
	WebElement clickhealthinsuranceproducts;
	
	@FindBy (xpath="//a[@class=\"logo\"]")
	WebElement backthree;
	
	By healthins = By.xpath("//li//div[3]/ul/li");
	
	public void returnback() {
		backthree.click();
	}
	
	public void clickheader() {
		WebElement button3 = clickinsuranceproducts;
        boolean valuees = button3.isDisplayed();
        System.out.println("is the Insurance products displayed ? " +valuees); 
        clickinsuranceproducts.click();
	}
	
	public void clickheadersub() {
		WebElement button3 = clickhealthinsuranceproducts;
        boolean valuees = button3.isDisplayed();
        System.out.println("is the Health Insurance products displayed ? " +valuees); 
	}
	
	public void clickproducts() {
		clickinsuranceproducts.click();
		
	}
	
	public void printhealthproducts() throws IOException {
		//driver.findElement(By.xpath("//a[contains(text(),'Insurance Products ')]")).click();//click insurance product header
		
		List <WebElement> no = driver.findElements(healthins);//list the products
		System.out.println("                    ");
        System.out.println("health insurance products");
        System.out.println("---------------------------------------");
		for(int i=1;i<=no.size();i++) {
		String h = driver.findElement(By.xpath("//li//div[3]/ul/li["+i+"]")).getText();//print health care products
		System.out.println(i+"."+h);
		Excel.setCellData(file, "Health_Insurance", i, 0, h);
		}

	}

}
