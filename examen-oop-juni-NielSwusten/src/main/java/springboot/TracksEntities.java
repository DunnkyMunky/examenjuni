package springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "track")
public class TracksEntities {

	@Id
	@Column(name = "trackid")
	private int trackid;

	@Column(name = "naam")
	private String naam;

	@Column(name = "lengte")
	private int lengte;

	@Column(name = "artistname")
	private String artistname;

	@Column(name = "formaatnaam")
	private String formaatnaam;

	public int getTrackid() {
		return trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getLengte() {
		return lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}

	public String getArtistname() {
		return artistname;
	}

	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}

	public String getFormaatnaam() {
		return formaatnaam;
	}

	public void setFormaatnaam(String formaatnaam) {
		this.formaatnaam = formaatnaam;
	}
	





}
