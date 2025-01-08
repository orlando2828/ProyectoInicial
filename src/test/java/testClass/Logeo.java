package testClass;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import page.CargaInformacion;
import page.Login;

import java.text.ParseException;


public class Logeo {

    private CargaInformacion cargaInformacion;
    private Login login;
    public Logeo(){
    }

    public void CasoLogin(String usuario, String clave)throws ParseException {
        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.validarTextoUsuario("Nombri del usuario:");
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testeo");
        cargaInformacion.rellenarCampoMail("prueba@gmail.com");
        cargaInformacion.rellenarCampoAreaTexto("AAAAAA");
        cargaInformacion.seleccionarFechaCalendario("2023-12-24");
        cargaInformacion.rellenarCampoLista("valor 2");
       // cargaInformacion.seleccionMultiple(3);  //se comenta ya que el valor inicial se comento para reemplazo
        cargaInformacion.seleccionMultiple2("1,2,3");
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();


    }

}
