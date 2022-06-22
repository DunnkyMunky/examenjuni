package springboot;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controller {

	@GetMapping("/addtrack")
	@ResponseBody
	public AddTrack addtrack(@RequestParam int trackid, @RequestParam String naam, @RequestParam int lengte,
			@RequestParam String artistname, @RequestParam String formaatnaam) {
		AddTrack addtrack = new AddTrack();

		addtrack.trackid = 1;
		addtrack.naam = "Obama";
		addtrack.lengte = 150;
		addtrack.artistname = "Joe Biden";
		addtrack.formaatnaam = "mp4";

		TracksEntities entity = new TracksEntities();
		entity.setTrackid(1);
		entity.setNaam("Obama");
		entity.setLengte(150);
		entity.setArtistname("Joe Biden");
		entity.setFormaatnaam("mp4");

		System.out.println(entity.getArtistname());

		
		return addtrack;

	}

	@GetMapping("/addplaylist")
	@ResponseBody
	public AddPlaylist addplaylist(@RequestParam int playlistid, @RequestParam String naam,
			@RequestParam String genrenaam) {
		AddPlaylist addplaylist = new AddPlaylist();

		addplaylist.playlistid = 1;
		addplaylist.naam = "hell";
		addplaylist.genrenaam = "rock";

		PlaylistsEntities entity = new PlaylistsEntities();

		entity.setPlaylistid(1);
		entity.setNaam("hell");
		entity.setGenrenaam("rock");

		System.out.println(entity.getGenrenaam());

		return addplaylist;

	}

	@GetMapping("/deletetrack")
	@ResponseBody
	public AddTrack deletetrack(@RequestParam int trackid, @RequestParam String naam, @RequestParam int lengte,
			@RequestParam String artistname, @RequestParam String formaatnaam) {
		AddTrack deletetrack = new AddTrack();
		
		



		PlaylistsEntities entity = new PlaylistsEntities();
		


		return deletetrack;

	}
	
	
	@Test
	public AddTrack test(@RequestParam int trackid, @RequestParam String naam, @RequestParam int lengte,
			@RequestParam String artistname, @RequestParam String formaatnaam) {
		AddTrack addtrack = new AddTrack();
		
	
		
		
		return addtrack;
	}
}
