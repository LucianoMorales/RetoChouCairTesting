package co.com.choucair.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairEnterDatePage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("where we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we write the email").located(By.id("email"));
    public static final Target DATE = Target.the("where the month is selected").located(By.xpath("//select[@id='birthMonth']/option[text() = 'January']"));
    public static final Target DAY = Target.the("Where the Day is Selected").located(By.xpath("//select[@id='birthDay']/option[text() = '19']"));
    public static final Target YEARS = Target.the("Where the years is selected").located(By.xpath("//select[@id='birthYear']/option[text() = '1995']"));

    public static final Target SECOND_BUTTON=Target.the("this button to go to the next form").located(By.xpath("//*[text()='Next: Location']"));

}
