public class Client {
    public static void main(String[] args) {

        ProxyShell proxyShell = new ProxyShell();
        proxyShell.runCommand("mkdir design pattern", "user");
        proxyShell.runCommand("rm -rf", "user");
        proxyShell.runCommand("rm -rf", "admin");
        
    }
}
