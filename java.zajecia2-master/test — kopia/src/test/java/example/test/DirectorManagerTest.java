package example.test;


import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import example.test.Director;
import manager.DirectorManager;


public class DirectorManagerTest {
	DirectorManager dManager = new DirectorManager();
		
		private final static String NAME_1 = "Zenek";
		private final static String YOB_1 = ("13-12-2001");
		private final static String BIO_1="Kami";
		
		@Test
		public void checkConnection(){
			assertNotNull(dManager.getConnection());
		}
		
		@Test
		public void checkAdding(){
			
			Director d = new Director(NAME_1,YOB_1,BIO_1);
			
			dManager.clearDirectors();
			assertEquals(1,dManager.addDirector(d));
			
			List<Director> directors = dManager.getAllDirectors();
			Director directorRetrieved = directors.get(0);
			
			assertEquals(NAME_1, directorRetrieved.getName());
			assertEquals(YOB_1, directorRetrieved.getDateOfBirth());
			
		}
}
