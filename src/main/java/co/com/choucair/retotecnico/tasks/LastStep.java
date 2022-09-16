package co.com.choucair.retotecnico.tasks;


import co.com.choucair.retotecnico.userinterface.ChoucairDevicePage;
import co.com.choucair.retotecnico.userinterface.ChoucairEnterDatePage;
import co.com.choucair.retotecnico.userinterface.ChourcairDatosPage;
import co.com.choucair.retotecnico.userinterface.ChourcairLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LastStep implements Task {
    public static LastStep LastStepOnPage() {
        return Tasks.instrumented(LastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Choucair2022*").into(ChourcairLastStepPage.INPUT_PASSWORD),
                Enter.theValue("Choucair2022*").into(ChourcairLastStepPage.INPUT_CONFIRMPASS),
                Click.on(ChourcairLastStepPage.CONFIRM_INFORMED),
                Click.on(ChourcairLastStepPage.CONFIRM_TERMOFUSE),
                Click.on(ChourcairLastStepPage.CONFIRM_PRIVACY)

        );
    }
}
