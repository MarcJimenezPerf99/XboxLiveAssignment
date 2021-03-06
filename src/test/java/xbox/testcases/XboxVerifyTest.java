package xbox.testcases;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import util.CustomAssertion;
import util.SystemUtil;
import util.TestCaseBase;
import java.util.HashMap;

import xbox.basepages.XboxGamertagPage;
import xbox.basepages.XboxHomePage;

public class XboxVerifyTest extends TestCaseBase {

	@Test(groups = {"ChromeWin32", "IEWin32"})
	public void open() throws InterruptedException {
		
		Properties PROPERTIES_RESOURCES = SystemUtil.loadPropertiesResources("/testdata_xbox.properties");
		String firstPlaceGT = PROPERTIES_RESOURCES.getProperty("firstPlaceGT");
		String secondPlaceGT = PROPERTIES_RESOURCES.getProperty("secondPlaceGT");
		String thirdPlaceGT = PROPERTIES_RESOURCES.getProperty("thirdPlaceGT");
		String fourthPlaceGT = PROPERTIES_RESOURCES.getProperty("fourthPlaceGT");
		String fifthPlaceGT = PROPERTIES_RESOURCES.getProperty("fifthPlaceGT");
		
		HashMap<String, String> Gamertags = new HashMap<String, String>();
		Gamertags.put("firstPlaceGT", firstPlaceGT);
		Gamertags.put("secondPlaceGT", secondPlaceGT);
		Gamertags.put("thirdPlaceGT", thirdPlaceGT);
		Gamertags.put("fourthPlaceGT", fourthPlaceGT);
		Gamertags.put("fifthPlaceGT", fifthPlaceGT);
		
		XboxHomePage home = new XboxHomePage();
		CustomAssertion assertion = new CustomAssertion();
		home.open();
		home.waitPage();
		Assert.assertTrue(home.titleIs(home.TITLE));
		
		String firstPlaceTag = home.getFirstPlace();
		String secondPlaceTag = home.getSecondPlace();
		String thirdPlaceTag = home.getThirdPlace();
		String fourthPlaceTag = home.getFourthPlace();
		String fifthPlaceTag = home.getFifthPlace();
		
		assertion.equals(firstPlaceTag, Gamertags, "firstPlaceGT");
		assertion.equals(secondPlaceTag, Gamertags, "secondPlaceGT");		
		assertion.equals(thirdPlaceTag, Gamertags, "thirdPlaceGT");		
		assertion.equals(fourthPlaceTag, Gamertags, "fourthPlaceGT");		
		assertion.equals(fifthPlaceTag, Gamertags, "fifthPlaceGT");		
		
	}
}

