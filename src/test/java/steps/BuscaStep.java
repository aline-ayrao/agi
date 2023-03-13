package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BuscaPage;

import java.util.concurrent.TimeUnit;

public class BuscaStep {
    WebDriver driver;
    BuscaPage buscaPage;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        buscaPage = new BuscaPage(driver);
    }

    @After
    public void after(){
        driver.quit();
    }
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String url) {
        driver.get(url);
    }

    @Quando("clicar na busca")
    public void clicarBusca() {
        buscaPage.clicarBusca();
    }

    @Entao("validar que foi exibido o campo da pesquisa com sucesso")
    public void validoQueFoiExibidoCampoPesquisa() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/pesquisa"));
    }

}