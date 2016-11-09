package com.ww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com");
        driver.close();
    }
}
