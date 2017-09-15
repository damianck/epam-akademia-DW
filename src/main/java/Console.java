import java.util.Scanner;

/**
 * Created by Damian Wtorek on 2017-09-15.
 */

public class Console {
    private Prompt prompt; // znak zachety ->
    private Scanner scanner;
    private Message message;
    private ParserImpl parser;
    private final String DEFAULT_NAME_SHELL = "[MyShell] ";
    private boolean isWorking;
    private boolean isCorrect;

    Console() {
        scanner = new Scanner(System.in);
        prompt = new Prompt();
        message = new Message();
        parser = new ParserImpl();
        isWorking = true;
        isCorrect = true;

    }

    public void run() {
        String command = "";

        while (isWorking) {
            message.print(DEFAULT_NAME_SHELL + prompt.getCurrentPrompt());
            command = scanner.nextLine();
            System.out.println("test result-> " + command);
            isCorrect = parser.checkCommand(command);

            if (!isCorrect) {
                message.print(command + " : " + Command.NONE.getCommand() + "\n");
            } else {
                // jesli ok
                String[] split = command.split(" ");
                if (split.length > 1) {
                    if (parser.isPrompt(command)) {
                        if (split[1].equalsIgnoreCase(Command.RESET.getCommand())) {
                            prompt.resetPromptSign();
                        } else
                            prompt.setCurrentPrompt(split[1]);
                    } else {
                        parser.getCmd();
                        System.out.println("katalogi");
                    }
                }

            }
        }
    }

    public void bye() {
        message.print("\nbye\n");
        isWorking = false;
        System.exit(0);
    }

    public void changePrompt(String newValue) {
        prompt.setCurrentPrompt(newValue);
    }
}
