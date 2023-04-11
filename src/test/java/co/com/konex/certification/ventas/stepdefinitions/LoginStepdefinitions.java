package co.com.konex.certification.ventas.stepdefinitions;

import co.com.konex.certification.ventas.model.TablaUsuarios;
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
}
