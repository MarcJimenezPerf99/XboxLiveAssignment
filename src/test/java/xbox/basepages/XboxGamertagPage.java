package xbox.basepages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import util.Page;
import util.TestCaseBase;
import util.Waiting;

public class XboxGamertagPage extends Page {
	
	public static String TITLE = "Duskamo - Xbox Gamertag";
	
	@FindBy(xpath = "//div[@class='row']//div//a")
	public WebElement currentGamer;
	
	@FindBy(xpath = "//div[@class='recent-games']//div/div[1]/div/div/div/h3/a")
	public WebElement firstGame;
	
	@FindBy(xpath = "//div[@class='recent-games']//div/div[2]/div/div/div/h3/a")
	public WebElement secondGame;
	
	@FindBy(xpath = "//div[@class='recent-games']//div/div[3]/div/div/div/h3/a")
	public WebElement thirdGame;

	@FindBy(xpath = "//div[@class='recent-games']//div/div[4]/div/div/div/h3/a")
	public WebElement fourthGame;
	
	@FindBy(xpath = "//div[@class='recent-games']//div/div[5]/div/div/div/h3/a")
	public WebElement fifthGame;
	
	public XboxGamertagPage open() {
		String URL = "https://www.xboxgamertag.com/leaderboards";
		TestCaseBase.threadDriver.get().navigate().to(URL);	
		return this;
	}
	
	public XboxGamertagPage waitPage() throws InterruptedException {
		Thread.sleep(2000);
		Waiting.implicitly(2);
		return this;
	}
	
	public String getFirstGame() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(firstGame.getText());
		return firstGame.getText();
			
	}
	
	public String getSecondGame() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(secondGame.getText());
		return secondGame.getText();
			
	}
	
	public String getThirdGame() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(thirdGame.getText());
		return thirdGame.getText();
			
	}
	
	public String getFourthGame() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(fourthGame.getText());
		return fourthGame.getText();
			
	}
	
	public String getFifthGame() throws InterruptedException {

		Waiting.implicitly(2);
		System.out.println(fifthGame.getText());
		return fifthGame.getText();
			
	}
	
	
}
