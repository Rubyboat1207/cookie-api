package cookieapi.core;

public abstract class CommandListener {
    public abstract String getCommand();
    public abstract void onCommandRecieved();
}
