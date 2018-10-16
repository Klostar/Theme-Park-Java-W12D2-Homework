import ThemePark.Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest  {
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Jungle Theme Playground");
    }

    @Test
    public void playgroundHasName(){
        assertEquals("Jungle Theme Playground", playground.getName());
    }
}
