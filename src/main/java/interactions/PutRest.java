package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.interactions.Put;

public class PutRest implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Put");
		String json = "{\r\n" + 
				"  \"id\": 2515,\r\n" + 
				"  \"username\": \"Arctyrael\",\r\n" + 
				"  \"firstName\": \"Dayana\",\r\n" +
				"  \"lastName\": \"Chaverra\",\r\n" +
				"  \"email\": \"Damacha98@gmail.com\",\r\n" +
				"  \"password\": \"123456789\",\r\n" + 
				"  \"phone\": \"00000000000\",\r\n" +
				"  \"userStatus\": 1\r\n" + 
				"}";
		actor.attemptsTo(Put.to("v2/user/Arctyrael")
				.with(request -> request.header("Content-Type", "application/json")
						.header("Accept","*/*")
				.body(json)));
		System.out.println("Put"+SerenityRest.lastResponse().asString());
	}
	public static Performable on() {
		return Instrumented.instanceOf(PutRest.class).withProperties();
	}
}
