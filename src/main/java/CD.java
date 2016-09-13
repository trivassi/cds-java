public class CD {
  private String mGenre;
  private String mArtist;
  private String mAlbum;

  public CD (String genre, String artist, String album) {
    mGenre = genre;
    mArtist = artist;
    mAlbum = album;
  }

  public String getGenre() {
    return mGenre;
  }

  public String getArtist() {
    return mArtist;
  }

  public String getAlbum() {
    return mAlbum;
  }
}
