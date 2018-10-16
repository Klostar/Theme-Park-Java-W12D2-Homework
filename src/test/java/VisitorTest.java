import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(145, 16 , 50.0);
    }

    @Test
    public void visitorHasHeight(){
        assertEquals(145, visitor.getHeight());
    }

    @Test
    public void visitorHasAge(){
        assertEquals(16, visitor.getAge());
    }
    @Test
    public void visitorHasMoney(){
        assertEquals(50.0, visitor.getMoney(),1);
    }
}
