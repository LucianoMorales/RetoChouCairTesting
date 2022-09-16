package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairAdressPage extends PageObject {
    //public static final Target YEARS = Target.the("Where the years is selected").located(By.xpath("//select[@id='birthYear']/option[text() = '1995']"));

//    public static final Target SECOND_BUTTON=Target.the("this button to go to the next form").located(By.xpath("//*[text()='Next: Location']"));


    public static final Target ZIP_INPUT = Target.the("where we writen the zip of city").located(By.id("zip"));
    public static final Target THREE_BUTTON = Target.the("this button to go to the next form numbers three").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
