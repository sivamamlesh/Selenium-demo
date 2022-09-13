package Eclipse_project.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    
    public static WebDriver driver;
    
    public static void Initiate() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
        
        driver = new ChromeDriver();
    }
    
    public static void Initiateapp() throws InterruptedException {
        driver.get("https://www.makemytrip.com");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
      
        driver.findElement(By.xpath("//li[@class='menu_Hotels']")).click();
        
        Thread.sleep(3000);
   
        driver.findElement(By.xpath("//input[@class='hsw_inputField lineHeight36 latoBlack font30']")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Chennai");

     
        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).isSelected(); 
        
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();    
        
        driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();        
        
        driver.findElement(By.xpath("//div[@aria-label='Fri Oct 14 2022']")).click();
        
        driver.findElement(By.xpath("//div[@aria-label='Sun Oct 16 2022']")).click();
        
        driver.findElement(By.xpath("//ul/li[@data-cy='adults-3']")).click();
        
        driver.findElement(By.xpath("//button[@class='primaryBtn btnApply']")).click();
        
        driver.findElement(By.xpath("//button[text()='Search']")).click();
        
        driver.findElement(By.xpath("//span[@id='htl_id_seo_201707131836443674']")).click();
        
        driver.findElement(By.xpath("//button[@id='detpg_headerright_book_now']")).click();
        
        
    }



    
    public static void main(String[] args) throws InterruptedException {
        
        Initiate();
        
        Initiateapp();
    }

}