package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    
    private ChromeDriver driver;


    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();

    }

    @When("^Haces clic sobre el boton The litlle tester comics$")
    public void hace_clic_sobre_el_boton_The_litlle_tester_comics() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();




    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
