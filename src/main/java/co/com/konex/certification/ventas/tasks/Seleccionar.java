package co.com.konex.certification.ventas.tasks;

import co.com.konex.certification.ventas.model.TablaUsuarios;
import co.com.konex.certification.ventas.userinterfaces.ContenedorDeObjetos;
import co.com.konex.certification.ventas.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Seleccionar implements Task {

    private MetodosFuncionales metodosFuncionales;

    private TablaUsuarios tablaUsuarios;

    public Seleccionar(TablaUsuarios tablaUsuarios){
        this.tablaUsuarios = tablaUsuarios;
    }

    public static Seleccionar papeleria(TablaUsuarios tablaUsuarios) {
        return Tasks.instrumented(Seleccionar.class, tablaUsuarios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(metodosFuncionales.OPCION(tablaUsuarios.getPapeleria())),
                Click.on(ContenedorDeObjetos.BTN_ACEPTAR));
    }
}
