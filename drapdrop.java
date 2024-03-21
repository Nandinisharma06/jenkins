package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class drapdrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");

        Actions builder = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable")   );
        builder.dragAndDrop(from, to).perform();
//verify text changed in to 'Drop here' box
        String textTo = to.getText();
        if(textTo.equals("Dropped!")) {
            System.out.println("PASS: File is dropped to target as expected");
        }else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }
        driver.close();
    }
}

