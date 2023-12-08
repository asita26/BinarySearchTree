public class BinaryNode<T extends Comparable<T>> {
    T key;
    BinaryNode<T> left;
    BinaryNode<T> right;
   // Constructor to intialise the node
    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;

    }

  //Method for adding node
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

    //Method for calculating size
    public static <T extends Comparable<T>> int size(BinaryNode<T> root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    //Method for adding a node using comparable
    public static <T extends Comparable<T>> void inOrderTraversal(BinaryNode<T> root) {
        if (root != null) {
            inOrderTraversal(root.left);    // Step 1
            System.out.print(root.key + " "); // Step 2
            inOrderTraversal(root.right);
        }
    }
}