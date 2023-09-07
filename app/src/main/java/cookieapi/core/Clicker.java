package cookieapi.core;

import java.util.Scanner;

public class Clicker {
    private final CommandDispatcher dispatcher;
    private final InputEmitter emitter;

    public Clicker() {
        emitter = new InputEmitter();
        dispatcher = new CommandDispatcher();

        emitter.register(dispatcher);
    }

    public CommandDispatcher getDispatcher() {
        return dispatcher;
    }

    public InputEmitter getEmitter() {
        return emitter;
    }


    public void run() {
        Scanner scan = new Scanner(System.in);

        String readString = scan.nextLine();
        while (readString != null && readString != "exit") {
            emitter.emit(readString);
        }

        scan.close();
    }
}
