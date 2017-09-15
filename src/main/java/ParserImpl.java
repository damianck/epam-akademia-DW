/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public class ParserImpl implements Parser {
    private String receivedCommand;
    private Console console;
    private Command[] commands;
    private String[] x;

    public ParserImpl() {
        receivedCommand = null;
        commands = Command.values();
    }

    @Override
    public boolean checkCommand(String command) {
        x = command.split(" ");
        return check();
    }

    public Prompt checkPrompt(String commmand, Prompt cur) {

        String[] part = commmand.split(" ");
        if (part[1] == cur.getCurrentPrompt()) {
            return cur;
        } else {
            Prompt prompt = new Prompt();
            prompt.setCurrentPrompt(part[1]);
            return prompt;
        }
    }

    private boolean check() {
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (commands[i].getCommand().equalsIgnoreCase(x[j])) {
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public boolean isCorrectCommand() {
        return false;
    }

    public boolean isPrompt(String command) {
        String[] split = command.split(" ");
        if (split[1].equalsIgnoreCase(Command.DISPLAY.getCommand())) {
            return false;
        } else {
            return true;
        }
    }
    public void getCmd(){

        System.out.println("Katolog " +System.getProperties().getProperty("dir"));
    }
}
