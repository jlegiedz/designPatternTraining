package bnsit.patterns.laboratory.logic;

import java.io.IOException;

public interface Command {
    void execute(String param);
    void printHelpMessage();
}
