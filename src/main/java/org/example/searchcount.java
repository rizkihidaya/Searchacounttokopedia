package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class searchcount {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\bootcamp juara koding\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tokopedia.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Techdoo Sepatu Formal Pria Sepatu Casual Import PU Leather MC415");
        delay(2);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();

        delay(2);
        //String result = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[2]")).getText().split("Techdoo Sepatu Formal Pria Sepatu Casual Import PU Leather MC415 ")[2];
        //System.out.println(result);

        List<WebElement> allMenuElements = driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[2]"));
        for (WebElement menuElements : allMenuElements) {
            System.out.println(menuElements.getText());
        }

        System.out.println(allMenuElements.size());


        //body[1]/div[1]/div[1]/div[2]/div[1]/div[2]

        //driver.close();

        //driver.quit();



    }

    static void delay(int detik){
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
