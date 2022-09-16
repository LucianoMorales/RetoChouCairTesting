package co.com.choucair.retotecnico.tasks;



import co.com.choucair.retotecnico.userinterface.ChoucairEnterDatePage;
import co.com.choucair.retotecnico.userinterface.ChourcairDatosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.Select;

public class Datos implements Task {
    public static Datos onThePage(){
        return Tasks.instrumented(Datos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChourcairDatosPage.LOGIN_BUTTON),
                Enter.theValue("Luciano").into(ChoucairEnterDatePage.INPUT_FIRST_NAME),
                Enter.theValue("Morales").into(ChoucairEnterDatePage.INPUT_LAST_NAME),
                Enter.theValue("lucianomorales79@gmial.com").into(ChoucairEnterDatePage.INPUT_EMAIL),
                Click.on(ChoucairEnterDatePage.DATE),
                Click.on(ChoucairEnterDatePage.DAY),
                Click.on(ChoucairEnterDatePage.YEARS),
                Click.on((ChoucairEnterDatePage.SECOND_BUTTON)));
    }
}
