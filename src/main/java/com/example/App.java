package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            // Open website
            driver.get("https://www.saucedemo.com/");

            // Login
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            Thread.sleep(3000);

            System.out.println("Login Successful");

            // Add product to cart
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

            System.out.println("Product Added to Cart");

            Thread.sleep(2000);

            // Open cart
            driver.findElement(By.className("shopping_cart_link")).click();

            Thread.sleep(2000);

            System.out.println("Cart Opened Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();

        System.out.println("Browser Closed");
    }
}
