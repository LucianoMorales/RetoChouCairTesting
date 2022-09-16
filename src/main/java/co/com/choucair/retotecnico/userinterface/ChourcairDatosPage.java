package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChourcairDatosPage extends PageObject{
public static final Target LOGIN_BUTTON = Target.the("This button opens the data entry forms").located(By.xpath("//*[text()='Join Today']"));



}
