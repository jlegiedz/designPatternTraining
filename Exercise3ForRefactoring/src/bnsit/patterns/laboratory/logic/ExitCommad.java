package bnsit.patterns.laboratory.logic;

import bnsit.patterns.laboratory.Application;
import bnsit.patterns.laboratory.model.ApplicationModel;

public class ExitCommad implements Command {
    private Exitable application;

    public ExitCommad(Exitable application) {
        this.application=application;

    }

    @Override
    public void execute(String param) {
        System.out.println("Exiting app");
        application.stop();
    }

    @Override
    public void printHelpMessage() {
        System.out.println("Exits application");
    }
}
