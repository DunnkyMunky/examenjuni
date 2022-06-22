package springboot;

import org.junit.Test;

public class JunitTest {
	static  TracksEntities track1 = new TracksEntities();
	static TracksEntities track2 = new TracksEntities();
	static TracksEntities track3 = new TracksEntities();
	
	static PlaylistsEntities playlist1 = new PlaylistsEntities();
	static PlaylistsEntities playlist2 = new PlaylistsEntities();
	static PlaylistsEntities playlist3 = new PlaylistsEntities();





	
	public static void main(String[] args) {
		
		track1.setTrackid(1);
		track1.setNaam("Obama");
		track1.setLengte(126);
		track1.setArtistname("Joe Biden");
		track1.setFormaatnaam("mp4");
		
		
		track2.setTrackid(2);
		track2.setNaam("krokant");
		track2.setLengte(135);
		track2.setArtistname("Spongebob");
		track2.setFormaatnaam("mp3");
		
		
		track3.setTrackid(3);
		track3.setNaam("Dear mr. President");
		track3.setLengte(126);
		track3.setArtistname("Joe Biden");
		track3.setFormaatnaam("mp3");
		
		
		playlist1.setNaam("classical");
		playlist2.setNaam("pop");
		playlist3.setNaam("pop");

		
		
		
		
		

	}

	@Test
	public  void equals() {

		track1.equals(track1);
		
		playlist3.equals(playlist2);
		

	}

}
