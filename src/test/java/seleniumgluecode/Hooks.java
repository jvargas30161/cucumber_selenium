package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;

    @Before

    //Vamos a crear métodos 1 que se ejecute antes de cada esceario y uno segundo se ejecutara despues.

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        driver.quit();

    }

    public static ChromeDriver getDriver(){
        return driver;
    }


}
