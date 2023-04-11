package co.com.konex.certification.ventas.tasks;

import co.com.konex.certification.ventas.userinterfaces.ContenedorDeObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {

    public static Seleccionar papeleria() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContenedorDeObjetos.PAPELERIA),
                Click.on(ContenedorDeObjetos.BTN_ACEPTAR));
    }
}
