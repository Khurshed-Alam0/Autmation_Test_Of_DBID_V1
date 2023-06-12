import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {

    static WebDriver driver;

    public void launchBrowser()
    {
//        driver=new ChromeDriver();
        driver=new FirefoxDriver();

        WebDriverManager.firefoxdriver().setup();

        driver.manage().window().maximize();

    }

    @BeforeMethod
    public void initialize()
    {
        launchBrowser();
    }

    @AfterMethod
    public void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
      /*  WebElement clearForm=driver.findElement(By.xpath("//a[contains(text(),'ফর্মের তথ্য মুছুন')]"));
        clearForm.click();*/
      //  driver.quit();
    }


}
