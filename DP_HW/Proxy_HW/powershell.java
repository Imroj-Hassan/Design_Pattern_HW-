public class PowerShell implements Terminal {

    @Override
    public void runCommand(String command, String user) {
        System.out.println(command + " executed successfully by " + user);
    }

}
