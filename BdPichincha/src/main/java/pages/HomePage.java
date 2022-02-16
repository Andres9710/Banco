package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By menuHome = By.id("nava");


    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public SamsungS6Page clickSamsungS6(){
        clickLink("Samsung galaxy s6");
        return new SamsungS6Page(driver);
    }

    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}