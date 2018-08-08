package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {

    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://ticketnew.com";

        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        
       WebElement select = driver.findElement(By.xpath("/html/body/div[9]/div[2]/form/div/div/span[2]"));
        List<WebElement> options = select.findElements(By.className("jspPane"));
        for (WebElement option : options) {
            if("Chennai".equals(option.getText()))
                option.click();
       
        }   //close Firefox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }

}