package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class selenium1 {
    public boolean testgender() {
        WebDriver d = new ChromeDriver();
        d.get("https://demo.automationtesting.in/Register.html");
        WebElement gender = d.findElement(By.xpath("//input[@value=\"FeMale\"]"));
        gender.click();

        return gender.isEnabled();
    }
    public String headerCheck(){
        WebDriver d = new ChromeDriver();
      d.get("https://demo.automationtesting.in/Register.html");
      WebElement header = d.findElement(By.xpath("//div[@class=\"col-sm-8 col-xs-8 col-md-8\"]//child::h1"));
      String str = header.getText();
     System.out.print(str);
     return header.getText();
    }
    public String titleCheck(){
        WebDriver d = new ChromeDriver();
        System.out.print(d);
        d.get("https://demo.automationtesting.in/Register.html");
        WebElement title = d.findElement(By.xpath("//div[@class=\"container center\"]//child::h2"));
         String str = title.getText();
        System.out.print(str);
        return title.getText();
    }

}

//div[@class="col-sm-8 col-xs-8 col-md-8"]//child::h1