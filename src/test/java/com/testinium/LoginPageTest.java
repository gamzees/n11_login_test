package com.testinium;

import org.junit.Assert;
import org.junit.Test;
import org.n11.LoginPage;
import org.openqa.selenium.By;

public class LoginPageTest extends BaseTest{

    @Test

    public void login(){
        //new LoginPage(driver).login("gamzeetskn@gmail.com","12345");

          Assert.assertEquals("n11.com - Hayat Sana Gelir",driver.getTitle());
            driver.findElement(By.id("kullaniciAdi")).sendKeys("admin");
            driver.findElement(By.id("parola")).sendKeys("123456");

        }

    }

