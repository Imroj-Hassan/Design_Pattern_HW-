import java.util.ArrayList;
import java.util.List;

public class ProxyShell implements Terminal {
    private PowerShell powerShell;
    private List<String> vulnerableCommands;
    
    public ProxyShell() {
        powerShell = new PowerShell();
        vulnerableCommands = new ArrayList<>();
        vulnerableCommands.add("rm -rf");
    }

    @Override
    public void runCommand(String command, String user) {
        if (vulnerableCommands.contains(command) && !user.equals("admin")) {
            System.out.println("Cannot execute command: " + command);
        } else {
            powerShell.runCommand(command, user);
        }
    }
}
