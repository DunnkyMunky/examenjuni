package springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "playlist")
public class PlaylistsEntities {

	@Id
	@Column(name = "playlistid")
	private int playlistid;

	@Column(name = "naam")
	private String naam;
	
	@Column(name = "genrenaam")
	private String genrenaam;

	public int getPlaylistid() {
		return playlistid;
	}

	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getGenrenaam() {
		return genrenaam;
	}

	public void setGenrenaam(String genrenaam) {
		this.genrenaam = genrenaam;
	}



}
