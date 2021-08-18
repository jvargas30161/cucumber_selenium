package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberofCase = 0;
    private DriverManager driverManager;

    @Before

    //Vamos a crear métodos 1 que se ejecute antes de cada esceario y uno segundo se ejecutara despues.

    public void setUp(){
        numberofCase ++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberofCase);
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();


    }

    @After
    public void tearDown(){
        System.out.println("El escenario nro: " + numberofCase + " se ejecuto correctamente. ");
        driverManager.quitDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }


}
