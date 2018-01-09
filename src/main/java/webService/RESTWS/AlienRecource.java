package webService.RESTWS;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("aliens")
public class AlienRecource {
	AlienRepository repo=new AlienRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
	System.out.println("getAlien called");
    
  
     return repo.getAlien();
}
}