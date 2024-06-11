package day04_Maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://amazon.com sayfasina gidin.
        driver.get("https://amazon.com");

        //Arama kutusunu locate edin.
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));

        //"Samsung headphones" aratin
        searchBox.sendKeys("Samsung headphones");
        searchBox.submit();

        //Bulunan sonuc sayisini yazdirin
        WebElement aramaSonucu = driver.findElement(By.xpath(" (//*[@class='sg-col-inner'])[1]"));
        System.out.println("Arama Sonucu :" + aramaSonucu.getText());

        //Ilk urune tiklayin
        driver.findElement(By.xpath("(//*[@class='s-image s-image-optimized-rendering'])[1]")).click();
        //Sayfadaki tum basliklari yazdirin

        List<WebElement> sayfaBasliklari = driver.findElements(By.xpath("//h1"));
        for (WebElement w:sayfaBasliklari){
            System.out.println(w.getText());
        }
        sayfaBasliklari.forEach(t-> System.out.println(t.getText()));
        //Sayfayi kapatin

        driver.close();
    }
}
