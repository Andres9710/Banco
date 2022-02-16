package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SamsungS6Page {
    private WebDriver driver;
    private By boughtButton = By.xpath("//a[contains(text(),'Add to cart')]");

    private By goToCart = By.id("cartur");


    public SamsungS6Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickToCart(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(boughtButton).click();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }




}
