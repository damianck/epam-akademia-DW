import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public class PromptTest {
    Prompt prompt;

    @Before
    public void setUp() {
        prompt = new Prompt();
    }

    @Test
    public void testPromptChange(){
        assertSame("$>",prompt.getCurrentPrompt());
        prompt.setCurrentPrompt("nowyPrompt");
        assertEquals("nowyPrompt>",prompt.getCurrentPrompt());
        assertNotSame("$>",prompt.getCurrentPrompt());
    }

    @Test
    public void testResetPromptSign(){
        prompt.setCurrentPrompt("nowyPrompt");
        assertEquals("nowyPrompt>",prompt.getCurrentPrompt());
        prompt.resetPromptSign();
        assertEquals("$>",prompt.getCurrentPrompt());
    }

}
