package POM;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.ImageIO;

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

public class CarInsurance extends BasePage{
	
	public CarInsurance(WebDriver driver) {
		super(driver);
		
	}
	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/Book3.xlsx";
	
	@FindBy(xpath="//a[@class='btn-proceed']")
	WebElement newcar;

	@FindBy (xpath="//span[@id='spn1']")
	WebElement city;

	@FindBy (xpath="//span[contains(text(),'KA01')]")
	WebElement area;
		
	@FindBy (xpath="//span[contains(@class,'tata')]")
	WebElement brand;
		
	@FindBy (xpath="//b[contains(text(),'ALTROZ')]")
	WebElement model;
	
	
	@FindBy (xpath="//b[contains(text(),'CNG')]")
	WebElement variant;

	@FindBy (xpath="//b[contains(text(),'XE CNG (1199 cc)')]")
	WebElement variantversion;
			
	@FindBy (xpath="//label[contains(text(),'Full Name')]")
	WebElement name;
		
	@FindBy (xpath="//input[@id='name']")
	WebElement nameenter;
	
	@FindBy (xpath="//label[contains(text(),'Email')]")
	WebElement email;
	
	@FindBy (xpath="//input[@id='email']")
	WebElement emailenter;
	
	@FindBy (xpath="//label[contains(text(),'Mobile No.')]")
	WebElement mobilenumber;
	
	@FindBy (xpath="//input[@id='mobileNo']")
	WebElement mobilenumberenter;
	
	@FindBy (xpath="//a[@class='pb-logo']")
	WebElement backtwo;
	
	@FindBy (xpath="(//i[@class='icon-bg homeIconsBg car-insurance'])[2]")
	WebElement carinss;
	
	By carins = By.xpath("(//i[@class='icon-bg homeIconsBg car-insurance'])[2]");
	
	@FindBy (xpath="//h3/span[2]")
	WebElement cartitles;
	
	public String titlevalidations1() {
		String textt=cartitles.getText();
		//System.out.println(textt);
		return textt;
	}
	
	public String titlechecks() {
		String text = driver.getTitle();
		return text;
	}
	
	public void choosecarinsurance() {
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		WebElement acros=driver.findElement(carins);
		jss.executeScript("arguments[0].scrollIntoView();",acros);
		acros.click();
	}
	
	public void buynewcar() {
		newcar.click();
	}
	
	public void selectcity() {
		city.click();
	}
	
	public void selectarea() {
		area.click();
	}
	
	public void selectbrand() {
		brand.click();
	}
	
	public void selectmodel() {
		model.click();
	}
	
	public void selectvariant() {
		variant.click();
	}
	
	public void selectvariantversion() {
		variantversion.click();
	}
	
	public void carbuttoncheck() {
		WebElement button3 = carinss;
        boolean valuees = button3.isEnabled();
        System.out.println("is the Car Insurance button Enabled ? " +valuees); 
	}
	
	public void captureinvalid() throws InterruptedException, IOException {
		String Test = Excel.getCellData(file, "Input_data", 1, 0);
		String Test1 = Excel.getCellData(file, "Input_data", 1, 1);
		String Test2 = Excel.getCellData(file, "Input_data", 1, 2);
		name.click();
		//nameenter.sendKeys("Pavan kumar");
		nameenter.sendKeys(Test);
		email.click();
		//emailenter.sendKeys("pav@cmail.chnkjjg");
		emailenter.sendKeys(Test1);
		mobilenumber.click();
		//mobilenumberenter.sendKeys("1111111135");
		mobilenumberenter.sendKeys(Test2);
		Thread.sleep(5000);
//		TakesScreenshot ts=(TakesScreenshot)driver;
//        File src=ts.getScreenshotAs(OutputType.FILE);
//        File trg=new File("C:\\Users\\2304127\\eclipse-workspace\\hackathonp\\screenshot");
//        
//        FileUtils.copyFile(src,trg);
//        System.out.println("screenshot captured");
		
		
		
	}
	public void car_homepage() {
		backtwo.click();
	}
	
//	String file=(System.getProperty("user.dir")+"/src/test/resources/AcronymsExcel.xlsx");
//	
//	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/data.xlsx";


	
	public void screenshot() throws IOException, HeadlessException, AWTException {
		BufferedImage img1=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img1, "png", new File("C:\\Users\\2303832\\Downloads\\hackathonp 7\\hackathonp\\src\\test\\java\\Screenshottts\\errormsg.png"));
//		TakesScreenshot ts=(TakesScreenshot)driver;
//        File src=ts.getScreenshotAs(OutputType.FILE);
//        File trg=new File("C:\\Users\\2304127\\eclipse-workspace\\hackathonp\\screenshot");
//        
//        FileUtils.copyFile(src,trg);
//        System.out.println("screenshot captured");
	}
	
	

}
