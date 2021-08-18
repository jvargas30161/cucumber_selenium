package seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {
    
    private WebDriver driver = Hooks.getDriver();


    @Given("^El usuario se encuentra en la pagina home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Throwable {
        String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(titleHomePage,driver.getTitle());


    }

    @When("^Hace clic sobre el boton The litlle tester comics$")
    public void hace_clic_sobre_el_boton_The_litlle_tester_comics() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();




    }

    @Then("^Se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
        WebElement pageTileLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics",pageTileLocator.isDisplayed());
        Assert.assertEquals("Category: comics", pageTileLocator.getText());
        //driver.quit();

    }
}
