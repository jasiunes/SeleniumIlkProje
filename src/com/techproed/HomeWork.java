package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
  /*  1. Yeni bir class oluşturun :Homework
2. ChromeDriver’ı kullanarak facebook’a gidin ve sayfa başlığının(Page Title) “facebook” olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
3. Sayfa URL’sinin facebook içerip içermediğini(contains), Değilse doğru URL’yi(Actual url) yazdırın.
4. Ardından Navigate to https://www.walmart.com/
 5. Walmart sayfa başlığının “Walmart.com” içerip içermediğini(contains) doğrulayın
6. Navigate back to facebook
7. Sayfayı yenileyin(refresh)
8. Maximize the window
9. Close the browser (edited)*/
  public static void main(String[] args) { System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
  WebDriver webDriver = new ChromeDriver();
      webDriver.get("http://facebook.com");
      String pageTitle= webDriver.getTitle();
      String pageUrl = webDriver.getCurrentUrl();
      if (pageTitle.contains("facebook")){
          System.out.println("U are on facebook");
      }
      else {
          System.out.println(pageUrl); }
      webDriver.navigate().to("https://www.walmart.com");
      String pageTitle2 = webDriver.getTitle();
      if (pageTitle2.contains("Walmart.com")){
          System.out.println("Welcome to Walmart");
      }
      else {
          System.out.println("u are on a wrong page");
      }
      webDriver.navigate().back();
      webDriver.navigate().refresh();
      webDriver.manage().window().maximize();
      webDriver.quit();




  }

}
