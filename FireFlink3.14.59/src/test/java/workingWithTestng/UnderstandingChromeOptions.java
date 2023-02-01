package workingWithTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UnderstandingChromeOptions {
		public static void main(String[] args) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			//options.addArguments("start-maximized");
			options.addArguments("--headless");
			WebDriver driver=new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.get("https://in.via.com/");
			System.out.println("browser is opened");
			driver.quit();
		}

}
