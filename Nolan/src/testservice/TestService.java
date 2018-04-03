package testservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

@Path("/MonService")
public class TestService {
	private static final JsonElement result = null;
	// Cr�ation de l'objet
	private Gson gson = new Gson();
	/* private String[] tab = new String[10]; */

	@Path("/helloWorld")
	@GET
	@Produces(MediaType.TEXT_PLAIN)

	/* http://localhost:8080/Nolan/rest/MonService/helloWorld */
	public String hello() {
		System.out.println("HellowWorld !!");

		return "HelloWorld";
	}

	@Path("/helloWorldJson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEleve() {
		Eleve eleve = new Eleve("bobo", 15, 392619);
		Gson gson = new Gson();
		return Response.status(200).entity(gson.toJson(eleve)).build();
	}

	@POST
	@Path("/helloWorldAllJson")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEleveWithParam(String recu) {
		System.out.println(recu);
		Gson gson = new Gson();
		if (recu == null || recu.length() == 0) {
			return Response.status(200).entity(gson.toJson("Eleve non recu")).build();
		}
		Eleve eleve = gson.fromJson(recu, Eleve.class);
		return Response.status(200).entity(gson.toJson(eleve)).build();

	}
}
