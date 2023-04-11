package co.com.konex.certification.ventas.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContenedorDeObjetos {
    public static final Target USER = Target.the("Datos para campo de usuario").located(By.id("username"));
    public static final Target PASSWORD = Target.the("Datos para contrasenna del usuario").located(By.id("clave"));
    public static final Target BTN_SING_IN = Target.the("Boton iniciar sesion").located(By.xpath("//span[contains(text(),'INICIAR SESIÓN')]"));
    public static final Target PAPELERIA = Target.the("seleccionar papeleria").located(By.xpath("/html/body/app-root/ng-component/p-dialog/div/div/div[2]/div/div[4]/div/table/tr[1]/td"));
    public static final Target BTN_ACEPTAR = Target.the("Boton aceptar").located(By.xpath("//button[@class='w-120-px btn-aceptar2']"));
    public static final Target HOME_VALIDACION = Target.the("Validar ingreso a la pltaforma").located(By.xpath("//span[@class='title2']"));
}
