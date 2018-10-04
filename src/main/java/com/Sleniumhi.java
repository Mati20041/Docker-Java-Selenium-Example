package com;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Sleniumhi {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver(new ChromeOptions().addArguments("no-sandbox").setHeadless(true));

        driver.get("https://www.google.com/");

        WebElement searchElement = driver.findElement(By.id("lst-ib"));

        searchElement.sendKeys("Hi from docker!");

        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        Files.copy(screenshotAs.toPath(), Paths.get("screen.png"), StandardCopyOption.REPLACE_EXISTING);
    }
}
