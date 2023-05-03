package com.cc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ques1 {
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        if (cartCount.equals("1")) {
        	System.out.println("Added to the cart successfully");
        	
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String product = "Sauce Labs Backpack";
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText().equals(product));
        {
        	System.out.println("User can view the cart");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Your Information")) {
        	System.out.println("Form displayed");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("DEEPIKA");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("T");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("641664");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        if(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText().equals("Checkout: Overview")) {
        	System.out.println("Overview page is displayed");
        }
        Thread.sleep(2000);
        System.out.println("Name of the product : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price of the product : " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        Thread.sleep(2000);
        if(driver.getTitle().equals("Swag Labs")) {
        	System.out.println("Title of the page is verified");
        }
        Thread.sleep(2000);
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
        	System.out.println("Url of the page is verified");
        }
        Thread.sleep(2000);
    } 
}