package co.com.choucair.retotecnico.tasks;

import co.com.choucair.retotecnico.userinterface.ChoucairAdressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Adress implements Task {
    public static Adress onOtherPage() {
        return Tasks.instrumented(Adress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("08007").into(ChoucairAdressPage.ZIP_INPUT),
                Click.on(ChoucairAdressPage.THREE_BUTTON)

        );
    }
}