/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public interface Parser {
    boolean checkCommand(String command);
    Prompt checkPrompt(String commmand, Prompt cur);
    boolean isPrompt(String command);
    String getCmd();
    void justDirMyLord(); // XD
}
