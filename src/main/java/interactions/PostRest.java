package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class PostRest implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Post");
		String json = "{\r\n" + 
				"  \"id\": 1580,\r\n" +
				"  \"username\": \"Arctyrael\",\r\n" + 
				"  \"firstName\": \"Dayana\",\r\n" +
				"  \"lastName\": \"chaverra\",\r\n" +
				"  \"email\": \"Damacha98@gmail.com\",\r\n" +
				"  \"password\": \"123456789\",\r\n" + 
				"  \"phone\": \"3146642635\",\r\n" +
				"  \"userStatus\": 1\r\n" + 
				"}";
		
		actor.attemptsTo(Post.to("v2/user")
				.with(request -> request.header("Content-Type", "application/json")
						.header("Accept","*/*")
				.body(json)));


		System.out.println("Response: " +SerenityRest.lastResponse().asString());
	}
	
	public static Performable on() {
		return Instrumented.instanceOf(PostRest.class).withProperties();
	}
}
