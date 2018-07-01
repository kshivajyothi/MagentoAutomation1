

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest 
{
	
    @Test
	public void testrun()
	{
		WebDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "https://www.magento.com";
		driver.get(url);
		Home h = new Home(driver);
		h.clickOnMyacct();
		Login l = new Login(driver);
		l.sendEmail("subramanyaraj87@gmail.com");
		l.sendPasword("Welcome123");
		l.clickOnLogin();
		Main m = new Main(driver);
		m.clickOnLogout();	
	}

}
