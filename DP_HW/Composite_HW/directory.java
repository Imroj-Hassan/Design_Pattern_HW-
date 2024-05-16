import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private int size;
    private List<FileSystemComponent> children;

    public Directory() {
        // Initialize size to 0 and children to an empty ArrayList
        this.size = 0;
        this.children = new ArrayList<>();
    }

    // Method to add a file or directory to this directory
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    // Method to calculate the total size of this directory and its children
    @Override
    public int calculateSize() {
        int totalSize = 0;
        for (FileSystemComponent component : children) {
            // Recursively calculate size of children
            totalSize += component.calculateSize();
        }
        return totalSize;
    }
}
