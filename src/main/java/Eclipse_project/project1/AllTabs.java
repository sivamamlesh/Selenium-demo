package Eclipse_project.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTabs {

	 public static WebDriver driver;
	 
	 public static void Initiate() {
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
	        driver = new ChromeDriver();
	    }
	 	 public static void OpenAllTabs() {
	
	driver.get("https://www.makemytrip.com");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Homestays']")).click();
    driver.findElement(By.xpath("//li[@data-cy='menu_Holidays']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Trains']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Buses']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Cabs']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Forex']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Charters']")).click();
    driver.findElement(By.xpath("//li[@class='menu_Activities']")).click();

	 }
	 
	 public static void main(String[] args) {
		 
	        Initiate();
	        OpenAllTabs();
	 }
	
}