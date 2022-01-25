

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumprogram {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opsintuat-org-uat-mta-cf-cockpit-approuter.internal.cfapps.sap.hana.ondemand.com/sapcpidevopscfcockpit/index.html");
		driver.manage().window().maximize();
		driver.findElementByClassName("saml-login-link").click();
		driver.findElementById("j_otpcode");
		Thread.sleep(6000);
	//	driver.findElementByClassName("ids-button ids-button--primary").click();
		 driver.findElementById("logon_continue").click();
		 driver.close();
		

	}

}
