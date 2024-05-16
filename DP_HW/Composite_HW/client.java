public class Client {
    public static void main(String[] args) {
        // Creating file objects
        File file0 = new File("file0.txt", 22);
        File file1 = new File("file1.txt", 32);
        File file2 = new File("file2.txt", 42);

        // Creating directory objects
        Directory directory_0 = new Directory("directory_0");
        Directory root = new Directory("root");

        // Adding files and directories to the root directory
        root.add(directory_0);
        root.add(file0);
        root.add(file1);
        directory_0.add(file2);

        // Printing the file system structure
        System.out.println(root.showFileSystem());
    }
}
