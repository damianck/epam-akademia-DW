/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public class ParserImpl implements Parser {
    private String receivedCommand;

    public ParserImpl() {
        receivedCommand = null;
    }
    
    @Override
    public void checkCommand(String command){

    }

    @Override
    public boolean isCorrectCommand() {
        return false;
    }
}
