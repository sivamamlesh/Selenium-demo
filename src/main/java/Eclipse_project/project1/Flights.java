package Eclipse_project.project1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flights {
    public static WebDriver driver;
    
    public static void Initiate() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        
        driver = new ChromeDriver();
    }
    
    public static void Initiateapp() throws InterruptedException {
        
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        
    	driver.get("https://www.makemytrip.com/");
        
    	driver.manage().window().maximize();
                
    	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
        
    	driver.findElement(By.id("fromCity")).sendKeys("Hyderabad");
        
    	driver.findElement(By.xpath("//div[text()='HYD']")).click();
        
    	driver.findElement(By.id("toCity")).sendKeys("Chennai");
        
    	driver.findElement(By.xpath("//div[text()='MAA']")).click();

        driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
        
        Boolean flag = false;
        
        while(!flag) {
        
        	if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 15 2022')]")).size()>0) {
            
        		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 15 2022')]")).click();
                   
        		flag = true;
                
                   Thread.sleep(3000);
               }
        	
            
        	else {
            
        		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
               }
        	
        }
        
        
        driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//ul/li[@data-cy='adults-2']")).click();
        
        Thread.sleep(3000);
                
        driver.findElement(By.xpath("//ul/li[starts-with(.,'Economy')]")).click();
        
        Thread.sleep(3000);
               
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")).click();
        
        Thread.sleep(3000);
               
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        
        Thread.sleep(3000);
                        
        driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
        
        Thread.sleep(3000);
            
        
        driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:6023e766-2569-47f2-a3cc-cab508922bea:21_0']")).click();
            
    
    }
    
    public static void main(String[] args) throws InterruptedException {
        Initiate();
    
        Initiateapp();
    }
}