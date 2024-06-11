package day05_JUnit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ClassWork {

    WebDriver driver;

    @Before
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        //Verilen web sayfasina gidin.
        //https://the-internet.herokuap.com/checkboxes
        driver.get("https://the-internet.herokuap.com/checkboxes");
        //Checkbox1 ve Checkbox2 elemnetlerini locate edin.
        //Choeckbox1 secili degilse onay kutusuna tiklayin.
        //Choeckbox2 secili degilse onay kutusuna tiklayin.
    }
}
