package bikes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Bikes_001_Test {
    @Parameters("browsername")
	@Test(groups = "smoke")
	public void openingBikes(@Optional("chrome")String bs) {
    	System.out.println(bs);
    	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kawasaki-india.com/");
		driver.quit();
	}
}
