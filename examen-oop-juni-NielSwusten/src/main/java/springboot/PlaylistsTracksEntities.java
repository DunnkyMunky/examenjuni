package springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity(name = "trackplaylist")
public class PlaylistsTracksEntities {
	public int getTrackid() {
		return trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public int getPlaylistid() {
		return playlistid;
	}

	public void setPlaylistid(int playlistid) {
		this.playlistid = playlistid;
	}

	@JoinTable
	@OneToMany

	@Id
	@Column(name = "trackid")
	private int trackid;

	@Column(name = "playlistid")
	private int playlistid;

}
