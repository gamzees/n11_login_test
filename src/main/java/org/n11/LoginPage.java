package org.n11;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginPage {
   WebDriver driver;

   public LoginPage(WebDriver driver) {
   }

   public void login(String email, String password) {
      driver.get("https://www.n11.com/");
      Assert.assertEquals("n11.com - Hayat Sana Gelir",driver.getTitle());



   }
}
