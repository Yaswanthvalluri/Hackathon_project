package POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;


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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;
import Utilities.Excel;

public class TravelInsurance extends BasePage {
	
	//WebDriver driver;
//	Properties p;
	public TravelInsurance(WebDriver driver) {
		super(driver);
		
	}
	
	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/Book3.xlsx";

	
	@FindBy(xpath="//input[@id='country']")
	WebElement Countrypath;

	@FindBy (xpath="//li[contains(text(),'France')][1]")
	WebElement Franceop;

	@FindBy (xpath="(//button[@class='travel_main_cta'])[1]")
	WebElement Countryproced;
		
	@FindBy (xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement Datepath;
		
	@FindBy (xpath="//button[@class='travel_main_cta']")
	WebElement Dateproced;
	
	
	@FindBy (xpath="//label[@for='traveller_2']")
	WebElement twotravellers;

	@FindBy (xpath="(//div[@class='customDropdown__select  '])[1]")
	WebElement travelleronepath;
			
	@FindBy (xpath="//*[contains(text(),'22 years')]")
	WebElement travelleroneage;
		
	@FindBy (xpath="(//div[@class='customDropdown__select  '])[2]")
	WebElement travellertwopath;
	
	@FindBy (xpath="//*[contains(text(),'21 years')]")
	WebElement travellertwoage;
	
	@FindBy (xpath="//*[contains(@class,'travel')]")
	WebElement Agepathnext;
	
	@FindBy (xpath="//*[contains(@id,'ped_no')]")
	WebElement surveyno;
	
	@FindBy (xpath="//*[contains(@id,'mobileNumber')]")
	WebElement phonenumberinput;
	
	@FindBy (xpath="//*[contains(@class,'travel_main_cta')]")
	WebElement proced;
	
	@FindBy (xpath="//input[@id='studentTrip']")
	WebElement studenttripplan;
	
	@FindBy (xpath="//input[@id='Traveller_1']")
	WebElement passengeroneselect;
	
	@FindBy (xpath="//input[@id='Traveller_2']")
	WebElement passengertwoselect;
	
	@FindBy (xpath="//select[@id='feet']")
	WebElement durationpath;
	
	@FindBy (xpath="//option[contains(text(),'30 Days')]")
	WebElement durationop;
	
	@FindBy (xpath="//button[contains(text(),'Apply')]")
	WebElement durationproced;
	
	@FindBy (xpath="//p[@class='filter_name_heading']")
	WebElement sortby;
	
	@FindBy (xpath="//input[@id='17_sort']")
	WebElement lowtohigh;
	
	@FindBy (xpath="//span[@class='exitIntentPopup__box__closePop']")
	WebElement closepopup;
	
	@FindBy (xpath="//a[contains(text(),'Policybazaar')]")
	WebElement backone;
	
	@FindBy (xpath="//span[@class='exitIntentPopup__box__closePop']")
	WebElement exitpop;
	
	By travelins = By.xpath("//i[@class='icon-bg homeIconsBg icon-bg-new ti']");
	
	//By todaydate = By.xpath("//*[contains(@class,'MuiPickersDay-today')]");
	
	//By nextdate = By.xpath("(//button[@aria-label='Mar 19, 2024'])[1]");
	
	@FindBy (xpath="//div[@class='MuiPickersDateRangePickerInput-root']/div[1]")
	WebElement StartDate;
	
	@FindBy (xpath="//div[1]/div/h6[@class='MuiTypography-root MuiTypography-subtitle1 MuiTypography-displayInline']")
	WebElement MonthYear;
 
	@FindBy (xpath="//div[2]/div[1]/button[2][@data-mui-test='next-arrow-button']")
	WebElement Arrow;
 
	@FindBy (xpath="//span[@class='MuiPickersDay-dayLabel']")
	List<WebElement> SelectDate;
	
	@FindBy (xpath="//li[contains(@class,'current')]//span")
	WebElement traveltitles;
	
	@FindBy (xpath="//i[@class='icon-bg homeIconsBg icon-bg-new ti']")
	WebElement travelinss;
	
	@FindBy (xpath="//h2[contains(text(),'Student Travel Information')]")
	WebElement traveldetslider;
 
	public void titlevalidations() {
		String text=traveltitles.getText();
		System.out.println(text);
	}
	
	public String titlevalidations1() {
		String textt=traveltitles.getText();
		//System.out.println(textt);
		return textt;
	}
	
	public String travelslider() {
		String textt=traveldetslider.getText();
		//System.out.println(textt);
		return textt;
	}
	
	public String titlecheck() {
		String text = driver.getTitle();
		return text;
	}
	public void mainpage() {
		backone.click();
		
	}
	
	/*public void setUserEmail() throws IOException {
		p=BaseClass.getProperties();
		UserEmail.sendKeys(p.getProperty("email"));
	}*/
	public void choosetravelinsurance() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement acro=driver.findElement(travelins);
		js.executeScript("arguments[0].scrollIntoView();",acro);
		acro.click();
	}
	
	/*public void destination() {
		Countrypath.click();
		Countrypath.sendKeys("France");
		Franceop.click();
		Countryproced.click();	
		

	}*/
	
	public void destination(String string1) {
		Countrypath.click();
		Countrypath.sendKeys(string1);
		Franceop.click();
		Countryproced.click();	
		

	}
	
	public void datepathclick() {
		Datepath.click();	
	}
	
	public void tripduration(String mn,String dat) throws InterruptedException {
		//Datepath.click();
		//Thread.sleep(1000);
		while(true)
		{
			String mon=MonthYear.getText();
			if(mn.equals(mon)) {
				break;
			}
			
			Arrow.click();
			
		}
		for(WebElement dt:SelectDate)
		{
			//Thread.sleep(3000);
			if(dt.getText().equals(dat)) {
				dt.click();
				//Thread.sleep(2000);
				break;
			}	
		}
//		Datepath.click();
//		WebElement key= driver.findElement(todaydate);
//        key.click();
//        WebElement button=driver.findElement(nextdate);
//        button.click();
//
//		//Thread.sleep(10000);
//		Dateproced.click();
		
	}
	
	public void dateproceedclick() {
		Dateproced.click();	
	}
	
	public void travellersage() {
		
		twotravellers.click();
		travelleronepath.click();
		travelleroneage.click();
		travellertwopath.click();
		travellertwoage.click();
		Agepathnext.click();
	}
	
	public void medicalsurvey() {
		surveyno.click();
		proced.click();
	}
	
	public void travelbuttoncheck() {
		WebElement button3 = travelinss;
        boolean valuees = button3.isEnabled();
        System.out.println("is the Travel Insurance button Enabled ? " +valuees); 
	}
	
	/*public void phonenumberenter() {
		phonenumberinput.sendKeys("6387642192");
		proced.click();
	}*/
	public void phonenumberenter(String string2) throws InterruptedException {
		phonenumberinput.sendKeys(string2);
		Thread.sleep(3000);
		proced.click();
	}
	
	public void studentplan() {
		closepop();
		studenttripplan.click();
		closepop();
	}
	
	public void tinsduration() throws InterruptedException {
		passengeroneselect.click();
		Thread.sleep(3000);
		closepop();
		passengertwoselect.click();
		closepop();
		durationpath.click();
		closepop();
		//durationop.click();
		Select sc=new Select(driver.findElement(By.id("feet")));
     	sc.selectByVisibleText("30 Days");
		closepop();
		durationproced.click();	
	}
	
	public void sort() {
		closepop();
		sortby.click();
		closepop();
		lowtohigh.click();
		closepop();
	}
	
	public void printtravelplans() throws IOException {
		System.out.println("student insurance plans");
		System.out.println("---------------------------");
		for(int i=1;i<=3;i++) {//print lowest 3 packages
			String text = driver.findElement(By.xpath("(//p[@class='quotesCard--insurerName'])["+i+"]")).getText();
		String text2 = driver.findElement(By.xpath("(//span[@class='premiumPlanPrice'])["+i+"]")).getText();
		try {
			exitpop.click();
							}
			catch (Exception e) {}
		System.out.println(i+"."+text+" -  "+text2);
		Excel.setCellData(file, "Travel_Insurance", i, 0, text);
		Excel.setCellData(file, "Travel_Insurance", i, 1, text2);
		}
        backone.click();
	}
	
	public void closepop() {
		try {
			exitpop.click();
			}
		catch (Exception e) {}
		
	}
	
	

}
