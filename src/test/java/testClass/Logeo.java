package testClass;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import page.CargaInformacion;
import page.Login;

public class Logeo {




    public void CasoLogin(String usuario, String clave){
        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Testeo");
        cargaInformacion.rellenarCampoMail("prueba@gmail.com");
        cargaInformacion.rellenarCampoAreaTexto("AAAAAA");
        cargaInformacion.rellenarCampoFecha("02/02/2025");
        cargaInformacion.rellenarCampoLista("valor 2");
       // cargaInformacion.seleccionMultiple(3);  //se comenta ya que el valor inicial se comento para reemplazo
        cargaInformacion.seleccionMultiple2("1,2,3");
        cargaInformacion.comboRadio(1);
        cargaInformacion.clickBtnEnviar();


    }

}
