package day05_JUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ClassWork {
    WebDriver driver;

    @Before
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void test01(){
        //https://www.amazon.com adresine gidin
        driver.get("https://www.facebook.com");
        //Cookies'i kabul edin.
        //"Create an Account" button'una basin
        //"radio buttons" elementlerini locate edin.
        //Secili degilse cinsiyet butonundan size uygun olani secin
    }
}
