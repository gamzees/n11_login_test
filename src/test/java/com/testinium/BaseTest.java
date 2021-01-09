package com.testinium;


import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest   {

public WebDriver driver;

 @Before
    public void setUp(){
      System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
      driver=new ChromeDriver();

      driver.get("https://www.n11.com/");
 }

 @Test
 public void login(){


 }
    public void setElementById(String username, String parola){
        WebElement girisElemani= driver.findElement(By.id(username));

    }
     public void clickElementById(String Id){
        driver.findElement(By.id(Id)).click(); ;
 }



 @After

    public void finish() throws InterruptedException {

     Thread.sleep(2000);
     driver.quit();
 }



}
