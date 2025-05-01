package seleniuminstall;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetup {
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		}


}
