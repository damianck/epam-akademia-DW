import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public class ParserTest {
    ParserImpl parser;

    @Before
    public void setUp() {
        parser = new ParserImpl();
    }

    @Test
    public void testIncorrectCommand() {
        assertFalse(parser.checkCommand("dasgdajdgjahdg asg djgj gajd"));
        assertFalse(parser.checkCommand("adsga adagsdgaj"));
        assertFalse(parser.checkCommand("sprzedam opla"));
    }

    @Test
    public void testCorrectCommand(){
        assertTrue(parser.checkCommand("exit"));
        assertTrue(parser.checkCommand("dir"));
    }

    @Test
    public void testIsPrompt() {
        assertFalse(parser.isPrompt("prompt $cwd"));
        assertTrue(parser.isPrompt("prompt jakasNazwaDlaznakuZachety"));
    }

    @Test
    public void testCmd(){
        assertNotNull(parser.getCmd());
    }
}
