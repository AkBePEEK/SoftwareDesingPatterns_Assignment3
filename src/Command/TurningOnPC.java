package Command;

public class TurningOnPC implements Command{
    private final PC pc;
    public String type;
    public TurningOnPC(PC pc, String type){
        this.pc = pc;
        this.type = type;
    }
    @Override
    public void execute() {
        pc.turnOn(type);
    }
}
