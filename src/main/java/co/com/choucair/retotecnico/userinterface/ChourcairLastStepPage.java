package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChourcairLastStepPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("input Password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS = Target.the("input the confirm password").located(By.id("confirmPassword"));
    public static final Target CONFIRM_INFORMED =Target.the("To Accept Stay Informed").located(By.xpath("//*[@name='newsletterOptIn']"));

    public static final Target CONFIRM_TERMOFUSE = Target.the(" Aceppt the user Term ").located(By.id("termOfUse"));
    public static final Target CONFIRM_PRIVACY = Target.the("Aceppt The Policy of privacy").located(By.id("privacySetting"));
    public static final Target BUTTON_CONFIRM = Target.the("Click for finish form").located(By.xpath("//*[contains (text(),'Complete Setup')]"));

}
