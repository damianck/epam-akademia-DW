import java.util.Scanner;

/**
 * Created by Damian Wtorek on 2017-09-15.
 */

public class Console {
    private Prompt prompt; // znak zachety ->
    private Scanner scanner;
    private Message message;
    private final String DEFAULT_NAME_SHELL = "[MyShell] ";
    private boolean isWorking;

    Console(){
        scanner = new Scanner(System.in);
        prompt = new Prompt();
        message = new Message();
        isWorking = true;
    }

    public void run() {
        String command = "";

      while(true) {
        message.print(DEFAULT_NAME_SHELL + prompt.getCurrentPrompt());
          command = scanner.nextLine();




      }

    }
}
