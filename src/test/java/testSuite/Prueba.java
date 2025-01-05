package testSuite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.CargaInformacion;
import testClass.BusquedaAnimalesGoogle;
import testClass.Logeo;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

import java.text.ParseException;

public class Prueba {

    ChromeDriver webDriver;

    String url = "https://www.qanovagroup.com/piloto";

    @BeforeTest
    //se sacan el metodo con las variables y se deja el DriverContext
    public void setUp() {
        DriverContext.setUp(Navegador.Chrome,url);
        PdfQaNovaReports.createPDF();

    }

    @AfterTest
    public void closeDriver() {
        DriverContext.closeDriver();
        PdfQaNovaReports.closePDF();
    }

    @Test
    public void pruebaLogin()throws ParseException {
        Logeo logeo = new Logeo();
        logeo.CasoLogin("nvivas","qanova");
        PdfQaNovaReports.closePDF();

    }

    /* se mueve el setup reemplazado arriba por el Drivercontext
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }
*/
}


