package cookieapi.core;

import java.util.ArrayList;

public class InputEmitter {
    private ArrayList<InputListener> listeners = new ArrayList<>();

    public void register(InputListener listener) {
        listeners.add(listener);
    }

    public void emit(String input) {
        listeners.forEach((l) -> {
            if(input.isEmpty()) {
                l.onClick();
            }

            l.onAnyInput(input);
        });
    }
}
