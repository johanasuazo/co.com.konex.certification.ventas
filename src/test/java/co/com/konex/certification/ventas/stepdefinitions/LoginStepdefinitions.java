package co.com.konex.certification.ventas.stepdefinitions;

import co.com.konex.certification.ventas.model.TablaUsuarios;
import co.com.konex.certification.ventas.questions.Validar;
import co.com.konex.certification.ventas.questions.Verificar;
import co.com.konex.certification.ventas.tasks.Abrir;
import co.com.konex.certification.ventas.tasks.Ingresar;
import co.com.konex.certification.ventas.tasks.Seleccionar;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class LoginStepdefinitions {

    @DataTableType
    public TablaUsuarios tablaUsuariosEntry(Map<String, String> entry) {
        return new TablaUsuarios(entry.get("usuario"), entry.get("contrasenna"));
    }

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que el usuario ingrese a web ventas")
    public void queElUsuarioIngreseAWebVentas() {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.laPagina());
    }

    @When("digita su usuario y contrasenna")
    public void digitaSuUsuarioYContrasenna(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @And("selecciona una papeleria")
    public void seleccionaUnaPapeleria() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.papeleria());
    }

    @Then("verifica el ingreso correcto")
    public void verificaElIngresoCorrecto() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.home(), Matchers.equalTo("Dashboard")));
    }


    //Caso2
    @Given("^que el usuario ingresa a webventas$")
    public void queElUsuarioIngresaAWebventas() {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.laPagina());
    }

    @When("^digita usuario y contrasenna$")
    public void digitaUsuarioYContrasenna(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @And("^selecciona papeleria")
    public void seleccionaPapeleria() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.papeleria());
    }

    @Then("^verifica que ingreso correctamente$")
    public void verificaQueIngresoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.home(), Matchers.equalTo("Dashboard")));
    }

    //Caso3
    @Given("que el usuario ungresa a webventas")
    public void queElUsuarioUngresaAWebventas() {
        OnStage.theActorCalled("usuario").wasAbleTo(Abrir.laPagina());
    }

    @When("digita usuario o contrasenna incorrectos")
    public void digitaUsuarioOContrasennaIncorrectos(List<TablaUsuarios> tablaUsuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales(tablaUsuarios.get(0)));
    }

    @Then("verifica el mensaje de error")
    public void verificaElMensajeDeError() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensajeError(),Matchers.equalTo("El Usuario y la Contraseña que ingresó no ha sido reconocido")));
    }
}
