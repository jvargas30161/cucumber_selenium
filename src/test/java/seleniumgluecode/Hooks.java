package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberofCase = 0;


    @Before

    //Vamos a crear métodos 1 que se ejecute antes de cada esceario y uno segundo se ejecutara despues.

    public void setUp(){
        numberofCase ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberofCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: " + numberofCase + " se ejecuto correctamente. ");
        driver.quit();

    }

    public static ChromeDriver getDriver(){
        return driver;
    }


}
