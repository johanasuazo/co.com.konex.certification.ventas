package co.com.konex.certification.ventas.util;

import co.com.konex.certification.ventas.model.TablaUsuarios;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class MetodosFuncionales extends PageObject {

    private TablaUsuarios tablaUsuarios;

    public void ClickJs(String jsPath){
       JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(jsPath+".click()");
    }

    public static Target OPCION(String valor){
        String dato = "//span[contains(text(),'";
        String dato2 = "')]";
        String datoFinal = dato + valor + dato2;
        return Target.the("papeleria").located(By.xpath(datoFinal));
    }
}
