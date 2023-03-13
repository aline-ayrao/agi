package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {

    WebDriver driver;

    String PESQUISA = "//*[@id='masthead']/div[1]/div[2]/form/label/input";
    String CLICAR = "//*[@id='masthead']/div[1]/div[2]/form/input";
    String BUSCA = "//*[@id='search-open']";


    public BuscaPage(WebDriver driver){ //esse driver vem do teste
        this.driver = driver; //esse.drive recebe= drive que vem do teste
    }

    public void preencherPesquisa (String pesquisa){
        driver.findElement(By.xpath(PESQUISA)).sendKeys(pesquisa);
    }
    
    public void clicarBusca (){
        driver.findElement(By.xpath(BUSCA)).click();
    }

    public void clicarPesquisar (){
        driver.findElement(By.xpath(PESQUISA)).click();
    }
}