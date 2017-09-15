/**
 * Created by Damian Wtorek on 2017-09-15.
 */

public class Prompt {
    private final String DEFAULT_PROMPT_SIGN = "$>";
    private String currentPrompt;

    Prompt() {
        currentPrompt = DEFAULT_PROMPT_SIGN;
    }

    public void setCurrentPrompt(String newPromptSign) {
        currentPrompt = newPromptSign + ">";
    }

    public String getCurrentPrompt() {
        return currentPrompt;
    }

    public void resetPromptSign() {
        currentPrompt = DEFAULT_PROMPT_SIGN;
    }
}
