package day05_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeAfter {
    WebDriver driver;

    @Before
    public void setUp() {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws InterruptedException {
        driver.close();
        Thread.sleep(3000);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://amazon.com");
        Thread.sleep(3000);

    }


    }

