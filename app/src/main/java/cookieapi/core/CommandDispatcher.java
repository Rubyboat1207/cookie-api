package cookieapi.core;

import java.util.ArrayList;

public class CommandDispatcher extends InputListener {
    private ArrayList<CommandListener> listeners = new ArrayList<>();

    public void reigsterListener(CommandListener listener) {
        listeners.add(listener);
    }

    @Override
    public void onClick() {
        
    }

    @Override
    public void onAnyInput(String input) {
        listeners.forEach((cmd) -> {
            if(cmd.getCommand() == input) {
                cmd.onCommandRecieved();
            }
        });
    }


}
