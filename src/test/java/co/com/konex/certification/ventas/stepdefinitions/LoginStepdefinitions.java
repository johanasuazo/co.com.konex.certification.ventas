package co.com.konex.certification.ventas.stepdefinitions;

import co.com.konex.certification.ventas.model.TablaUsuarios;
import co.com.konex.certification.ventas.questions.Validar;
import co.com.konex.certification.ventas.questions.Verificar;
import co.com.konex.certification.ventas.tasks.Abrir;
import co.com.konex.certification.ventas.tasks.Ingresar;
import co.com.konex.certification.ventas.tasks.Seleccionar;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.an.Y;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class LoginStepdefinitions {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("usuario"), entry.get("contrasenna"), entry.get("papeleria"));
    }

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    //Caso1
    @Dado("^que el usuario ingresa a webventas$")
    public void queElUsuarioIngresaAWebventas() {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.laPagina());
    }

    @Cuando("^digita usuario y contrasenna$")
    public void digitaUsuarioYContrasenna(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @Y("^selecciona papeleria$")
    public void seleccionaPapeleria(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.papeleria(tablaUsuarios.get(0)));
    }

    @Entonces("^verifica que ingreso correctamente$")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.home(), Matchers.equalTo("Dashboard")));
    }

    //Caso2

    @Entonces("verifica el mensaje de error")
    public void verificaElMensajeDeError(List<String> msjError) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensajeError(),Matchers.equalTo(msjError.get(1))));
    }
}
