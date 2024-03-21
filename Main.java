package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Main {
    public static void main(String[] args) throws InterruptedException {
   /*     WebDriver driver1 = new InternetExplorerDriver();
        driver1.get("https://www.google.com/");
        driver1.manage().window().maximize(); */


/*        WebDriver driver2 = new FirefoxDriver();
       driver2.get("https://www.google.com/");
        driver2.manage().window().maximize();
        Thread.sleep(5000);*/
  /*   WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement r = driver.findElement(By.name("q"));
        r.sendKeys("To The New");
        r.sendKeys(Keys.RETURN);*/


       WebDriver driver = new ChromeDriver();
        driver.get(" http://www.tothenew.com/ ");
        driver.findElement(By.xpath("(//a[@id=\"h-contact-us\"])[2]")).click();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        System.out.println("URL of the Contact Us page: " + url);

/*
        WebDriver driver = new ChromeDriver();
        driver.get(" http://www.tothenew.com/ ");
        driver.findElement(By.id("h-contact-us")).click();
        Thread.sleep(1000);*/
    }
}