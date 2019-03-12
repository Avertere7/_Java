package example.test;


import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import example.test.Actor;
import manager.ActorManager;

public class ActorManagerTest {
	
		ActorManager actorManager = new ActorManager();
		
		private final static String NAME_1 ="Zenek";
		private final static String YOB_1 ="13-12-2001";
		private final static String BIO_1="Kami";
		
		@Test
		public void checkConnection(){
			assertNotNull(actorManager.getConnection());
		}
		
		@Test
		public void checkAdding(){
			
			Actor actor = new Actor(NAME_1,YOB_1,BIO_1);
			
			
			assertEquals(1,actorManager.addActor(actor));
			actorManager.clearActors();
			
			List<Actor> actors = actorManager.getAllActors();
			Actor  actorRetrieved = actors.get(0);
			
			assertEquals(NAME_1, actorRetrieved.getName());
			assertEquals(YOB_1, actorRetrieved.getDateOfBirth());
			assertEquals(BIO_1, actorRetrieved.getBiography());
		}
}
