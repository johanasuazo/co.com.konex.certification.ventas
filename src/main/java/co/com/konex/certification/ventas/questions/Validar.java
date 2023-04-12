package co.com.konex.certification.ventas.questions;

import co.com.konex.certification.ventas.userinterfaces.ContenedorDeObjetos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question {

    public static Validar mensajeError() {
        return new Validar();
        }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ContenedorDeObjetos.MENSAJE_ERROR).answeredBy(actor);
    }
}

