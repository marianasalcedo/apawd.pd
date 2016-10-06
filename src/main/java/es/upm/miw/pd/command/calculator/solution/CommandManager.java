package es.upm.miw.pd.command.calculator.solution;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private Map<String, Command> Commands = new HashMap<>();

    public void add(Command Command) {
        this.Commands.put(Command.name(), Command);
    }

    public void execute(String key) {
        this.Commands.get(key).execute();
    }

    public String[] keys() {
        return this.Commands.keySet().toArray(new String[0]);
    }
}
