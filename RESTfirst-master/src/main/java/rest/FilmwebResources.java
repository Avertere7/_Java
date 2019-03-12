package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import domain.Komentarze;
import domain.Aktor;
import domain.Film;
import domain.services.FilmService;

@Path("/filmweb")
public class FilmwebResources {
	private FilmService db=new FilmService();
	private static int currentIdA=1;
	private static int currentIdK=1;


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getAll()
	{
		return db.getAllF();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Add(Film film)
	{
		db.addF(film);
		return Response.ok(film.getId()).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id")int id) {
		Film result=db.getF(id);
		if(result==null)
		{
			return Response.status(404).build();
		}
		
		return Response.ok(result).build();
	}
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id")int id,Film f) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		f.setId(id);
		db.updateF(f);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id")int id) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		db.removeF(result);
		return Response.ok().build();
	}
	
	@GET
	@Path("/{actorId}/aktorzy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aktor> getActors(@PathParam("actorId")int aId) {
		
		Film result = db.getF(aId);
		if(result==null)
			return null;
		if(result.getAktorzy()==null)
			result.setAktorzy(new ArrayList<Aktor>());
		return result.getAktorzy();
	}
	
	@POST
	@Path("/{id}/aktorzy")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addActors(@PathParam("id")int id,Aktor a) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		if(result.getAktorzy()==null)
			result.setAktorzy(new ArrayList<Aktor>());
		a.setId(++currentIdA);
		result.getAktorzy().add(a);
		return Response.ok().build();
	}
	@GET
	@Path("/{id}/filmy")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getFilms(@PathParam("id")int id) {
		
		Aktor a = db.getA(id);
		List<Film> filmy = new ArrayList<Film>();
		if(a==null)
			return null;
		for(Film f : db.getAllF())
		{
			for(Aktor ak : f.getAktorzy())
			{
				if(a.getId()==ak.getId())
					filmy.add(f);
			}
		}
		
		return filmy;
	}
	
	@GET
	@Path("/{filmId}/kom")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Komentarze> getKom(@PathParam("filmId")int fId) {
		
		Film result = db.getF(fId);
		if(result==null)
			return null;
		if(result.getKom()==null)
			result.setKom(new ArrayList<Komentarze>());
		return result.getKom();
	}
	
	@POST
	@Path("/{id}/kom")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addKom(@PathParam("id")int id,Komentarze k) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		k.setId(++currentIdK);
		result.getKom().add(k);
		return Response.ok().build();
	}
	@POST
	@Path("/{id}/ocena")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addOcena(@PathParam("id")int id,String jsonn) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		JSONObject json = new JSONObject(jsonn);
		List<Integer> oceny= result.getOceny();
		oceny.add(json.getInt("ocena"));
		result.setOceny(oceny);
		return Response.ok().build();
	}
	

	@DELETE
	@Path("/{id}/kom/{idk}")
	public Response deleteKom(@PathParam("id")int id,@PathParam("idk")int idk) {
		
		Film result = db.getF(id);
		if(result==null)
			return Response.status(404).build();
		List<Komentarze> k = result.getKom();
		for(Komentarze kk : k)
		{
			if(kk.getId()==idk)
			{
				k.remove(kk);
				return Response.ok().build();
			}
		}
		return Response.status(404).build();

		
	}
	
}
