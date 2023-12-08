public class BinarySearchTree {
   public static void main(String [] args){
      System.out.println("Welcome to BST implementation");
      BinaryNode<Integer> rootNode = new BinaryNode<>(56);
      rootNode.addNode(30);
      rootNode.addNode(70);
      BinaryNode.inOrderTraversal(rootNode);
   }
}
