package com.ww;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by wjlin on 11/9/16.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.close();
    }
}
