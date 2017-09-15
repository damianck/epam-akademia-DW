import java.io.PrintStream;

/**
 * Created by Damian Wtorek on 2017-09-15.
 */
public class Message {
    private PrintStream out;

    Message() {
        out = System.out;
    }

    void print(String msg){
        out.print(msg);
    }
}
