package com.techproed;


import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {
        //Java projemizi,chormedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

// selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi oluşturarak, chrome driverı kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();
        // driver'ımıza google.com'a gitmesini söyledik.
        webDriver.get("https://google.com");
        //driverımızda açık olan pencereyi kapatır.
        //webDriver.close();
        //driverımı komple kapatıyor
       // webDriver.quit();


    }}