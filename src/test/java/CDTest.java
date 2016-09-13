import org.junit.*;
import static org.junit.Assert.*;

public class CDTest {

  @Test
  public void CD_createsInstance_true() {
    CD newCD = new CD("Rock", "Coldplay", "Parachutes");
    assertEquals(true, newCD instanceof CD);
  }

  @Test
  public void CD_getGenre_String() {
    CD newCD = new CD("Rock", "Coldplay", "Parachutes");
    assertEquals("Rock", newCD.getGenre());
  }

  @Test
  public void CD_getArtist_String() {
    CD newCD = new CD("Rock", "Coldplay", "Parachutes");
    assertEquals("Coldplay", newCD.getArtist());
  }

  @Test
  public void CD_getAlbumString() {
    CD newCD = new CD("Rock", "Coldplay", "Parachutes");
    assertEquals("Parachutes", newCD.getAlbum());
  }

}
