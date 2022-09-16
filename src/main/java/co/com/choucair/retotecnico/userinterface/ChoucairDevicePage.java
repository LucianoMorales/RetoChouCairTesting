package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairDevicePage extends PageObject {
    public static final Target CLICK_MOBILE  = Target.the("Select  opcion Device mobile").located(By.xpath("//*[@id='mobile-device']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target MOBILE_INPUT = Target.the("input of mobile device").located(By.xpath("//*[contains(text(),'Huawei')]"));
    public static final Target CLICK_MODEL = Target.the("Select model of mobile device").located(By.xpath("//*[@id='mobile-device']/div[2]//span[@class='ui-select-placeholder text-muted']"));
    public static final Target MODEL_INPUT = Target.the("input model device").located(By.xpath("//*[contains(text(),'Mate 10 Lite')]"));
    public static final Target CLICK_SYSTEM = Target.the("select which system my device has").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target SYSTEM_INPUT = Target.the("Input system of My mobil device").located(By.xpath("//*[contains(text(),'Android 8.0 (Oreo)')]"));

    public static final Target BUTTON_CLICK =Target.the("We click for last page").located(By.xpath("//*[@class='pull-right next-step'] /a /span"));
}
