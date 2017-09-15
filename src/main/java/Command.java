/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public enum Command {
    PROMPT ("prompt"),
    RESET ("reset"),
    DISPLAY ("$cwd"),
    DIR ("dir"),
    TREE ("tree"),
    CD ("cd"),
    EXIT ("exit"),
    STATS ("statistics"),
    NONE ("unknown command");

    private  String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
