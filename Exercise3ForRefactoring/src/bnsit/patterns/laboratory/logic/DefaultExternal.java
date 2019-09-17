package bnsit.patterns.laboratory.logic;

public class DefaultExternal implements Command {

    private ExternalCommand externalCommand;

    public DefaultExternal() {
        this.externalCommand = new ExternalCommand();
    }

    @Override
    public void execute(String param) {
        externalCommand.execute(new ParamBean(param));

    }

    @Override
    public void printHelpMessage() {
    externalCommand.getHelpMessage();
    }
}
