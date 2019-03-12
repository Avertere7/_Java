package example.test;


import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import example.test.Season;
import manager.SeasonManager;


public class SeasonManagerTest {
	SeasonManager sManager = new SeasonManager();
		
		private final static int SEASONNR_1 =1;
		private final static String YOR_1 = ("13-12-2001");
		
		@Test
		public void checkConnection(){
			assertNotNull(sManager.getConnection());
		}
		
		@Test
		public void checkAdding(){
			
			Season s = new Season(SEASONNR_1,YOR_1);
			
			sManager.clearSeasons();
			assertEquals(1,sManager.addSeason(s));
			
			List<Season> Seasons = sManager.getAllSeasons();
			Season seasonRetrieved = Seasons.get(0);
			
			assertEquals(SEASONNR_1, seasonRetrieved.getSeasonNumber());
			assertEquals(YOR_1, seasonRetrieved.getYearOfRelease());
			
		}
}
