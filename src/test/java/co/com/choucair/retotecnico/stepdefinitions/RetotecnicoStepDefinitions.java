
package co.com.choucair.retotecnico.stepdefinitions;


import co.com.choucair.retotecnico.questions.Answer;
import co.com.choucair.retotecnico.tasks.*;
import cucumber.api.java.Before;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class RetotecnicoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Mario wants to register a user$")
    public void thatMarioWantsToRegisterAUser() {
        OnStage.theActorCalled("Mario").wasAbleTo(OpenUp.thePage());
    }

    @When("^he enters the page and looks for the forms on the Utest website$")
    public void heEntersThePageAndLooksForTheFormsOnTheUtestWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Datos.onThePage());
        OnStage.theActorInTheSpotlight().attemptsTo(Adress.onOtherPage());
        OnStage.theActorInTheSpotlight().attemptsTo(Device.DeviceOnPage());
        OnStage.theActorInTheSpotlight().attemptsTo(LastStep.LastStepOnPage());

    }

    @Then("^he submits the data entered for a on the Utest website (.*)$")
    public void heSubmitsTheDataEnteredForAOnTheUtestWebsiteCompleteSetup(String question)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.thoThe(question)));



    }





}