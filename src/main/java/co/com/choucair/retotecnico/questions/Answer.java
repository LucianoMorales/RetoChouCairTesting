package co.com.choucair.retotecnico.questions;

import co.com.choucair.retotecnico.userinterface.ChourcairLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
public Answer(String question){
    this.question = question;
}

    public static Answer thoThe(String question) {
    return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameButton = Text.of(ChourcairLastStepPage.BUTTON_CONFIRM).viewedBy(actor).asString();
        if (question.equals(nameButton)){
            result=true;
        }else {
            result = false;
        }

        return result;
    }
}
