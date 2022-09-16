package co.com.choucair.retotecnico.tasks;


import co.com.choucair.retotecnico.userinterface.ChoucairAdressPage;
import co.com.choucair.retotecnico.userinterface.ChoucairDevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Device implements Task {
    public static Device DeviceOnPage(){
        return Tasks.instrumented(Device.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairDevicePage.CLICK_MOBILE),
                Click.on(ChoucairDevicePage.MOBILE_INPUT),
                Click.on(ChoucairDevicePage.CLICK_MODEL),
                Click.on(ChoucairDevicePage.MODEL_INPUT),
                Click.on(ChoucairDevicePage.CLICK_SYSTEM),
                Click.on(ChoucairDevicePage.SYSTEM_INPUT),
                Click.on(ChoucairDevicePage.BUTTON_CLICK)
        );
    }
}
