public class BinarySearchTree {
   public static void main(String [] args){
      System.out.println("Welcome to BST implementation");
      BinaryNode<Integer> rootNode = new BinaryNode<>(56);
      rootNode.addNode(30);
      rootNode.addNode(70);
      rootNode.addNode(22);
      rootNode.addNode(40);
      rootNode.addNode(60);
      rootNode.addNode(95);
      rootNode.addNode(11);
      rootNode.addNode(65);
      rootNode.addNode(3);
      rootNode.addNode(16);
      rootNode.addNode(63);
      rootNode.addNode(67);

      //Displaying the BST
      BinaryNode.inOrderTraversal(rootNode);
      System.out.println();

      //Displaying size of BST
      int expected_size=13;
      int BST_size=BinaryNode.size(rootNode);
      if(expected_size == BST_size) {
         System.out.println("Expected size of BST was: 13");
         System.out.println("Size of generated BST is: " + BST_size);
         System.out.println("Hence all nodes have been added into the BST.");
      }
   }
}
