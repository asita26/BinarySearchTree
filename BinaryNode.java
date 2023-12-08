public class BinaryNode<T extends Comparable<T>> {
    T key;
    BinaryNode<T> left;
    BinaryNode<T> right;

    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;

    }

    public void addNode(T newNode) {
        if (newNode.compareTo(this.key) < 0) {
            if (this.left == null) {
                this.left = new BinaryNode<>(newNode);
            } else {
                this.left.addNode(newNode);
            }
        } else if (newNode.compareTo(this.key) > 0) {
            if (this.right == null) {
                this.right = new BinaryNode<>(newNode);
            } else {
                this.right.addNode(newNode);
            }
        }

    }

    public static <T extends Comparable<T>> void inOrderTraversal(BinaryNode<T> root) {
        if (root != null) {
            inOrderTraversal(root.left);    // Step 1
            System.out.print(root.key + " "); // Step 2
            inOrderTraversal(root.right);
        }
    }
}