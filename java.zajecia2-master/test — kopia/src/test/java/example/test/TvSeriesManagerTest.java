package example.test;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;

import example.test.TvSeries;
import manager.TvSeriesManager;

public class TvSeriesManagerTest {
	TvSeriesManager tvsManager = new TvSeriesManager();
		
		private final static String NAME_1 = "M jak milosc";
		private final static int SID_1=1;
		
		@Test
		public void checkConnection(){
			assertNotNull(tvsManager.getConnection());
		}
		
		@Test
		public void checkAdding(){
			
			TvSeries tvs = new TvSeries(NAME_1,SID_1);
			
			tvsManager.clearTvSeries();
			assertEquals(1,tvsManager.addTvSeries(tvs));
			
			List<TvSeries> tvseries = tvsManager.getAllTvSeries();
			TvSeries  tvseriesRetrieved = tvseries.get(0);
			
			assertEquals(NAME_1, tvseriesRetrieved.getName());
			assertEquals(SID_1, tvseriesRetrieved.getIdSeason());
			
		}
}
