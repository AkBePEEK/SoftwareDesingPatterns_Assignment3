package Command;

public class ShuttingDownPC implements Command{
    private final PC pc;
    public String type;
    public ShuttingDownPC(PC pc, String type){
        this.pc = pc;
        this.type = type;
    }
    @Override
    public void execute() {
        pc.shuttingDown(type);
    }
}
