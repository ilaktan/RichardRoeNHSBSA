package NhsBsa.pages;

import NhsBsa.utilities.GenericFunctions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheckCostsNHS extends GenericFunctions {

    public void userClickTheIAmOKWithCookies() {
        JClick("//*[@id='nhsuk-cookie-banner__link_accept_analytics']");
    }

    public void userSelectThe(String arg0) {

        WebElement btn = driver.findElement(By.xpath("//*[@id='radio-wales']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", btn);


    }

    public void userClickThe(String arg0) {
        js_executeScript("//*[@id='next-button']");
        //driver.findElement(By.id("#next-button"));
        JClick("//*[@id='next-button']");
    }

    public void userEnterDateOfBirth(String arg0, String arg1, String arg2) {
        setValue("//*[@id='dob-day']", arg0);
        setValue("//*[@id='dob-month']", arg1);
        setValue("//*[@id='dob-year']", arg2);

    }

    public void userOrPartnerGetPaidUniversalCredit(String arg0) {
        js_executeScript("//*[@id='yes-universal']");

        WebElement btn = driver.findElement(By.xpath("//*[@id='yes-universal']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", btn);
    }



    public void userShouldSee(String expectedMessage) {
        String actualMessage = driver.findElement(By.xpath("//*[text()='" + expectedMessage + "']")).getText();
        System.out.println("actualMessage = " + actualMessage);
        waitFor(2);
        Assert.assertEquals(expectedMessage, actualMessage);


    }



    public void yesNoQuestion(String yesNo) {
        waitFor(1);
        js_executeScript("//*[@id='radio-" + yesNo + "']");
        WebElement btn = driver.findElement(By.xpath("//*[@id='radio-" + yesNo + "']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", btn);
    }
}
