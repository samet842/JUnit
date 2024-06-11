package day05_JUnit;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAfterClass {
          /*
              @BeforeClass ve @AfterClass notasyonlari sadece static method'lar icin calisir.
              @BeforeClass ve @AfterClass kullanirsak olusturdugumuz @Test methodlarinin hepsini ayni anda calistirip
              en son @AfterClass'i calistiririz
              Ama sadece @Before ve @After kullanirsak her test icin @Before ve @After'i kullanir.
           */

    @BeforeClass
    public static void SetUp() {
        System.out.println("Butun Testlerden Once Calisti");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Butun Testlerden Sonra Calisti");
    }

    @Before
    public void setUp() {
        System.out.println("Her Testten once calisir");
    }

    @After
    public void tearDown01() {
        System.out.println("Her Testten sonra Calisir");
    }

    @Test
    public void test01() {
        System.out.println("Ilk Test");
    }

    @Test
    public void test02() {
        System.out.println("Ikinci Test");
    }
    @Test
    @Ignore
    public void test03(){
        System.out.println("Ucuncu Test");
    }
}
