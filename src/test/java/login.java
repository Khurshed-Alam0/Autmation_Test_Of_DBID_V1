import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class login extends baseClass{

    /*public static WebElement explicitWaitForElement(WebDriver driver, By locator, int timeout)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }*/

@Test
    public void login2() throws InterruptedException {
        driver.get("https://dev.dbid.gov.bd/clogin");
        Thread.sleep(1000);

       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    WebElement emailField=driver.findElement(By.id("mobile"));
    emailField.sendKeys("01862458249");

    WebElement passwordField=driver.findElement(By.name("password"));
    passwordField.sendKeys("123456789");
    Thread.sleep(2000);

    WebElement btnLogin = driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div/div/form/button\n"));

    btnLogin.click();
    Thread.sleep(1000);

  /*  WebElement btnApproved = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div/div[2]/div/form[1]/button\n"));
    btnApproved.click();*/
    Thread.sleep(2000);
    WebElement applyBtn=driver.findElement(By.xpath("//body/section[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
    applyBtn.click();

    WebElement applyBtn2=driver.findElement(By.xpath("//a[contains(text(),'আবেদন করুন')]"));
    applyBtn2.click();

    WebElement radioBtn=driver.findElement(By.id("radio2"));
    radioBtn.click();

    WebElement nextBtn= driver.findElement(By.id("nextBtn"));
    nextBtn.click();
    Thread.sleep(1000);

    WebElement orgNameBengali= driver.findElement(By.id("company_name"));
    orgNameBengali.sendKeys("আমার ব্যাবসা২");

    WebElement orgNameEng= driver.findElement(By.id("company_name_en"));
    orgNameEng.sendKeys("amar bebsa2");
    Thread.sleep(2000);

    WebElement website= driver.findElement(By.name("business-web-url"));
    website.click();
    website.sendKeys("test.com");
    Thread.sleep(1000);

    /*WebElement officeAddressBn= driver.findElement(By.name("company_address_bangla_division"));
   // officeAddressBn.click();
    Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",officeAddressBn);
    Thread.sleep(5000);
    officeAddressBn.sendKeys("ঢাকা");
    officeAddressBn.sendKeys("ঢাকা");
    officeAddressBn.sendKeys("ঢাকা");
    Thread.sleep(1000);*/

    WebElement officeAddressBn = driver.findElement(By.name("company_address_bangla_division"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].value = 'ঢাকা';", officeAddressBn);


    /*WebElement inputField = driver.findElement(By.name("company_address_bangla_division"));
    inputField.sendKeys("ঢাকা");*/


   /* WebElement officeAddressBn= driver.findElement(By.xpath("//body/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[4]/input[1]"));
    Thread.sleep(1000);
    //officeAddressBn.click();
    officeAddressBn.sendKeys("ঢাকা");
    officeAddressBn.sendKeys("ঢাকা");*/

  /*  WebElement officeAddressBn = driver.findElement(By.xpath("//body/section[3]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[5]/div[4]/input[1]"));
    if(officeAddressBn.isDisplayed() && officeAddressBn.isEnabled()) {
       // officeAddressBn.click(); // Bring element in focus
        officeAddressBn.sendKeys("ঢাকা");
        officeAddressBn.sendKeys("ঢাকা"); // Try sending input twice
    }*/

    WebElement officeAddressEn = driver.findElement(By.name("company_address_division"));
    JavascriptExecutor executor2 = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].value = 'dhaka';", officeAddressEn);

    /*
    WebElement officeAddressEn= driver.findElement(By.name("company_address_division"));
    officeAddressEn.sendKeys("dhaka");*/


    WebElement comMobile = driver.findElement(By.name("company_mobile_no"));
    JavascriptExecutor executor3 = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].value = '01662458249';", comMobile);

   /* WebElement comMobile= driver.findElement(By.name("company_mobile_no"));
    comMobile.sendKeys("01862458249");*/

    WebElement companyEmail = driver.findElement(By.name("company_email"));
    JavascriptExecutor executor4 = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].value = 'test1101@gmail.com';", companyEmail);

   /* WebElement companyEmail= driver.findElement(By.name("company_email"));
    companyEmail.sendKeys("test@gmail.com");*/

   // element=WebDriverWait(driver,30).until(EC.element_to_be_clickable((By

    WebElement dropDown = driver.findElement(By.id("company_start_year"));
    Select drpCompanyStartingYear = new Select(dropDown);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",drpCompanyStartingYear);
    Thread.sleep(500);
    drpCompanyStartingYear.selectByValue("2023");

  /*  WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
    WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("company_start_year")) );
    //driver.manage().window().setSize(new Dimension(1366, 768));
//    By eleLocator=By.id("company_start_year");
//    element.click();
    Select drpCompanyStartingYear = new Select(element);
//    explicitWaitForElement(driver,eleLocator,20);
    //drpCompanyStartingYear.location_once_scrolled_into_view;
    drpCompanyStartingYear.selectByIndex(2);

   */


    WebElement dropDown2 = driver.findElement(By.name("ubid_business_category"));
    Select ubidBusinessType = new Select(dropDown2);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ubidBusinessType);
    Thread.sleep(500);
    ubidBusinessType.selectByIndex(2);


    WebElement nextBtn2= driver.findElement(By.xpath("//button[@id='nextBtn']"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn2);
    Thread.sleep(500);
    nextBtn2.click();

    /*WebElement websiteName= driver.findElement(By.name("company_name_en"));
    orgNameBengali.sendKeys("test.com");

    WebElement websiteName= driver.findElement(By.name("company_name_en"));
    orgNameBengali.sendKeys("test.com");*/

 /*   WebElement dropDown3 = driver.findElement(By.id("owner_type"));
   // dropDown3.sendKeys(Keys.UP);
    Select ubidBusinessOwnerType = new Select(dropDown3);
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ubidBusinessOwnerType);
    Thread.sleep(1000);
    ubidBusinessType.selectByIndex(1);*/

    WebElement ubidBusinessOwnerType = driver.findElement(By.id("owner_type"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    String script = "arguments[0].selectedIndex = 1;";
    js.executeScript(script, ubidBusinessOwnerType);

    WebElement designation1 = driver.findElement(By.id("designation-1"));
    js = (JavascriptExecutor) driver;
    script = "arguments[0].selectedIndex = 1;";
    js.executeScript(script, designation1);

  /*  WebElement nid1= driver.findElement(By.id("nid-1"));
    nid1.click();
*/
    WebElement nid1= driver.findElement(By.id("nid-1"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nid1);
    Thread.sleep(500);
    if(nid1.isDisplayed() && nid1.isEnabled()) {

        nid1.click();
    }

   /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myModal2")));

    WebElement elementToClick = driver.findElement(By.id("nidInput"));
    elementToClick.click();
    elementToClick.sendKeys("1947848402");*/


    WebElement nidInput= driver.findElement(By.id("nidInput"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nidInput);
    Thread.sleep(500);
    nidInput.click();
    nidInput.sendKeys("1947848402");

  /*  Thread.sleep(10000);
    WebElement nidInput= driver.findElement(By.id("nidInput"));
    nid1.sendKeys("1947848402");*/

    WebElement nidInputDob= driver.findElement(By.id("nidDob"));
    nidInputDob.click();
    nidInputDob.sendKeys("30/06/1991");

   /* WebElement verfyNidBtn= driver.findElement(By.id("verify-nid-for-ubid"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", verfyNidBtn);
    Thread.sleep(5000);
    verfyNidBtn.click();
    */
/*
    WebElement verfyNidBtn = driver.findElement(By.id("verify-nid-for-ubid"));
    js = (JavascriptExecutor) driver;
    script = "arguments[0].click();";
    js.executeScript(script, verfyNidBtn);*/

  /*  WebElement verfyNidBtn = driver.findElement(By.xpath("//body/div[@id='myModal2']/div[1]/div[1]/div[3]/button[2]"));
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    Thread.sleep(2000);
    String script1 = "arguments[0].click();";
    String script2 = "arguments[1].click();";
    String script3 = "arguments[0].click();";
    js.executeScript(script, verfyNidBtn);*/


      /*  WebElement calendarDate=driver.findElement(By.xpath("//body[1]/div[18]/div[1]/table[1]/tbody[1]/tr[6]/td[1]"));
        calendarDate.click();*/
   /* WebElement calendarDate= driver.findElement(new By.ByCssSelector("body.fontSize100.clickup-chrome-ext_installed.modal-open:nth-child(2) div.datepicker.datepicker-dropdown.dropdown-menu.datepicker-orient-left.datepicker-orient-bottom:nth-child(49) div.datepicker-days table.table-condensed tbody:nth-child(2) tr:nth-child(6) > td.active.day:nth-child(1)"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", calendarDate);
    Thread.sleep(5000);
    if(officeAddressBn.isDisplayed() && officeAddressBn.isEnabled()) {

        calendarDate.click();}*/

    /*Actions actions = new Actions(driver);
    WebElement elementToClick = driver.findElement(By.xpath("//body/div[@id='myModal2']/div[1]/div[1]/div[3]/button[2]"));
    Thread.sleep(5000);
    actions.moveToElement(elementToClick).click();
*/

  /*  WebElement button = driver.findElement(By.id("verify-nid-for-ubid"));

    // Use JavaScriptExecutor to click the button
    JavascriptExecutor executor5 = (JavascriptExecutor) driver;
    Thread.sleep(2000);
    executor.executeScript("arguments[0].click();", button);*/

   /* WebElement verfyNidBtn= driver.findElement(By.cssSelector("#verify-nid-for-ubid"));
    Thread.sleep(2000);
    verfyNidBtn.click();*/

    WebElement verfyNidBtn= driver.findElement(By.xpath("//body/div[@id='myModal2']/div[1]/div[1]/div[3]/button[2]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", verfyNidBtn);
    Thread.sleep(1000);
    if(verfyNidBtn.isDisplayed() && verfyNidBtn.isEnabled()) {

        verfyNidBtn.click();
    }

    WebElement ownerMobileNo= driver.findElement(By.id("phone-1"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ownerMobileNo);
    Thread.sleep(3000);
    if(ownerMobileNo.isDisplayed() && ownerMobileNo.isEnabled()) {

        //ownerMobileNo.click();
        ownerMobileNo.sendKeys("01914824548");
    }
    /*WebElement ownerMobileNo=driver.findElement(By.id("phone-1"));
    ownerMobileNo.sendKeys("01914824548");*/

    WebElement ownerEmailNo= driver.findElement(By.id("email-1"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ownerEmailNo);
    Thread.sleep(1000);
    if(ownerEmailNo.isDisplayed() && ownerEmailNo.isEnabled()) {

        ownerEmailNo.sendKeys("test@gmail.com");
    }

    WebElement NextBtn2=driver.findElement(By.id("nextBtn"));
    NextBtn2.click();

    WebElement applicantDesignation=driver.findElement(By.name("applicant_designation"));
    applicantDesignation.sendKeys("TEST");


   // WebElement choseFileSignature=driver.findElement(By.id("signature"));
    //choseFileSignature.sendKeys("C:\\Users\\Khorshed\\Downloads\\1.png");


   /* WebElement choseFileSignature= driver.findElement(By.id("signature"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choseFileSignature);
    Thread.sleep(5000);
    if(choseFileSignature.isDisplayed() && choseFileSignature.isEnabled()) {

        choseFileSignature.sendKeys("C:/Users/Khorshed/Downloads/1.png");
    }
*/

    // Wait for the element to be visible and enabled
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
    WebElement choseFileSignature = wait.until(ExpectedConditions.elementToBeClickable(By.id("signature")));

// Scroll to the element
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choseFileSignature);

// Wait for a specific duration (optional)
    Thread.sleep(500); // Adjust the duration as needed

// Check if the element is displayed and enabled
    if (choseFileSignature.isDisplayed() && choseFileSignature.isEnabled()) {
        // Enter the file path and submit the form
        choseFileSignature.sendKeys("G:\\JAVA\\DBID_V1\\src\\test\\java\\1.png");
    }

    // Wait for the element to be visible and enabled
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
    WebElement choseFilePowerOfAttorny = wait.until(ExpectedConditions.elementToBeClickable(By.id("auth_input")));

// Scroll to the element
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", choseFilePowerOfAttorny);

// Wait for a specific duration (optional)
    Thread.sleep(500); // Adjust the duration as needed

// Check if the element is displayed and enabled
    if (choseFilePowerOfAttorny.isDisplayed() && choseFilePowerOfAttorny.isEnabled()) {
        choseFilePowerOfAttorny.sendKeys("G:\\JAVA\\DBID_V1\\src\\test\\java\\1.png");
    }

    WebElement NextBtn3=driver.findElement(By.id("nextBtn"));
    NextBtn3.click();


    WebElement NextBtn4=driver.findElement(By.id("nextBtn"));
    NextBtn4.click();

    Thread.sleep(2000);
    WebElement NextBtn5=driver.findElement(By.id("nextBtn"));
    NextBtn5.click();

  /*  WebElement agreementCheckBox=driver.findElement(By.name("agreement_checkbox"));
    agreementCheckBox.click();
*/

    WebElement agreementCheckBox= driver.findElement(By.name("agreement_checkbox"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agreementCheckBox);
    Thread.sleep(500);
    if(agreementCheckBox.isDisplayed() && agreementCheckBox.isEnabled()) {

        agreementCheckBox.click();
    }


   /* WebElement finalSubmitBtn=driver.findElement(By.id("nextBtn"));
    finalSubmitBtn.click();*/


}
}
