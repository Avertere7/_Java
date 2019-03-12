package example.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import example.test.Episode;
import manager.EpisodeManager;

public class EpisodeManagerTest {
		EpisodeManager episodeManager = new EpisodeManager();
		
		private final static String NAME_1 = "Poczatek";
		private final static String RDATE_1 = "13-12-2001";
		private final static int EPISODEN_1=12;
		private final static int DUR_1=45;
		private final static int SID_1=1;
		
		@Test
		public void checkConnection(){
			assertNotNull(episodeManager.getConnection());
		}
		
		@Test
		public void checkAdding(){
			
			Episode episode = new Episode(NAME_1,RDATE_1,EPISODEN_1,DUR_1,SID_1);
			
			
			assertEquals(1,episodeManager.addEpisode(episode));
			episodeManager.clearEpisodes();
			
			List<Episode> episodes = episodeManager.getAllEpisodes();
			Episode  episodeRetrieved = episodes.get(0);
			
			assertEquals(NAME_1, episodeRetrieved.getName());
			assertEquals(RDATE_1, episodeRetrieved.getReleaseDate());
			assertEquals(EPISODEN_1, episodeRetrieved.getEpisodeNumber());
			assertEquals(DUR_1, episodeRetrieved.getDuration());
			assertEquals(SID_1, episodeRetrieved.getSeasonID());
			
		}
}
