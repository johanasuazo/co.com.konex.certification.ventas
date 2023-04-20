package co.com.konex.certification.ventas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetos {
    public static final Target USER = Target.the("Datos para campo de usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Datos para contrasenna del usuario").located(By.id("clave"));
    public static final Target BTN_SING_IN = Target.the("Boton iniciar sesion").located(By.xpath("//span[contains(text(),'INICIAR SESIÓN')]"));
    public static final Target BTN_ACEPTAR = Target.the("Boton aceptar").located(By.xpath("//button[@class='w-120-px btn-aceptar2']"));
    public static final Target HOME_VALIDACION = Target.the("Validar ingreso a la pltaforma").located(By.xpath("//span[@class='title2']"));
    public static final Target MENSAJE_ERROR = Target.the("Mensaje de error de credenciales").located(By.xpath("/html[1]/body[1]/app-root[1]/ng-component[1]/div[1]/div[1]/form[1]/div[1]/p[1]"));
}
