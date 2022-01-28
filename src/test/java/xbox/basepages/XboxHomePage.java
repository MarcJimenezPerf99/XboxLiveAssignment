package xbox.basepages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import util.Page;
import util.TestCaseBase;
import util.Waiting;
import xbox.basepages.XboxGamertagPage;

public class XboxHomePage extends Page {
	
	public static String TITLE = "Xbox Leaderboards - Xbox Gamertag";
	
	@FindBy(xpath = "//div[@class='row']//div[1]/div/div[3]/a")
	public WebElement firstPlace;
	
	@FindBy(xpath = "//div[@class='row']//div[2]/div/div[3]/a")
	public WebElement secondPlace;
	
	@FindBy(xpath = "//div[@class='row']//div[3]/div/div[3]/a")
	public WebElement thirdPlace;

	@FindBy(xpath = "//div[@class='row']//div[4]/div/div[3]/a")
	public WebElement fourthPlace;
	
	@FindBy(xpath = "//div[@class='row']//div[5]/div/div[3]/a")
	public WebElement fifthPlace;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/form/input")
	public WebElement searchBar;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/form/button")
	public WebElement searchSubmit;
	
	public XboxHomePage open() {
		String URL = "https://www.xboxgamertag.com/leaderboards";
		TestCaseBase.threadDriver.get().navigate().to(URL);
		return this;
	}
	
	public XboxHomePage waitPage() throws InterruptedException {
		Thread.sleep(2000);
		Waiting.implicitly(2);
		return this;
	}
	
	public XboxHomePage search(String searchInput) throws InterruptedException {
		Waiting.implicitly(2);
		searchBar.clear();
		searchBar.sendKeys(searchInput);
		return this;
	}
	
	public XboxGamertagPage goToGamertagPage() {
		Waiting.implicitly(2);
		searchSubmit.click();
		return new XboxGamertagPage();
	}
	
	public String getFirstPlace() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(firstPlace.getText());
		return firstPlace.getText();
			
	}
	
	public String getSecondPlace() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(secondPlace.getText());
		return secondPlace.getText();
			
	}
	
	public String getThirdPlace() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(thirdPlace.getText());
		return thirdPlace.getText();
			
	}
	
	public String getFourthPlace() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(fourthPlace.getText());
		return fourthPlace.getText();
			
	}
	
	public String getFifthPlace() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(fifthPlace.getText());
		return fifthPlace.getText();
			
	}
	
	
}
