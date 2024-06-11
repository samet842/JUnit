package day04_Maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MavenClassWork {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(2000);
        //Signin butonuna tiklayin
        WebElement signinBUtton = driver.findElement(By.xpath("//*[@id='signin_button']"));
        signinBUtton.click();
        Thread.sleep(2000);
        //Login alanina "username" yazdirin
        WebElement login = driver.findElement(By.xpath("//*[@id='user_login']"));
        login.sendKeys("username");
        Thread.sleep(2000);
        //Password alanina "password" yazdirin
        WebElement password = driver.findElement(By.xpath("//*[@id='user_password']"));
        password.sendKeys("password");
        Thread.sleep(2000);
        //Sign-in butonuna tiklayin
        driver.findElement(By.xpath("//*[@value='Sign in']")).click();
        driver.navigate().back();

        //Pay Bills sayfasina gidin.
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        Thread.sleep(2000);
        //Amount kismina yatirmak istediginiz herhangi bir miktari yaziniz
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("124");
        Thread.sleep(2000);
        //Tarih kismina "2020-09-10" yazdirin.
        driver.findElement(By.xpath("//*[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(2000);
        //Pay butonuna tiklayin.
        driver.findElement(By.id("pay_saved_payees")).click();
        Thread.sleep(2000);
        //"The payment was succesfully submitted." mesajinin gorunur oldugunu kontrol edin.
        WebElement mesaj = driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        if (mesaj.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        //Sayfayi kapatin.
        driver.close();
    }
}
