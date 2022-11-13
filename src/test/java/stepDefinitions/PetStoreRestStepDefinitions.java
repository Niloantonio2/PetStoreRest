package stepDefinitions;

import java.io.IOException;


import interactions.DeleteRest;
import interactions.GetRest;
import interactions.PostRest;
import interactions.PutRest;
import io.cucumber.java.Before;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;
import questions.CodigoEstado;

public class PetStoreRestStepDefinitions {

	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que me encuentro con la uri de Pet Store$")
	public void queMeEncuentroConLaUriDePetStore() {
	    OnStage.theActorCalled("").whoCan(CallAnApi.at("https://petstore.swagger.io/"));
	}

	@When("^realice el crud de los servicios$")
	public void realiceElCrudDeLosServicios() {
		OnStage.theActorInTheSpotlight().attemptsTo(
				PostRest.on(),
				GetRest.on(),

				PutRest.on(),
				GetRest.on(),

				DeleteRest.on()
				);	    
	}

	@Then("^validare que el codigo de estado del servicio final sea (.*)$")
	public void validareQueElCodigoDeEstadoDelServicioFinalSea(String estado) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CodigoEstado.delServicio(estado)));
	}
}
