public class buildTree extends BinaryTree{

    public static void main(String[] args){

        BinaryTree theTree1 = new BinaryTree();
        BinaryTree theTree2 = new BinaryTree();
        BinaryTree theTree3 = new BinaryTree();

        theTree1.addNode(21, "T1 A");
        theTree1.addNode(12, "T1 B");
        theTree1.addNode(36, "T1 C");
        theTree1.addNode(10, "T1 D");
        theTree1.addNode(15, "T1 E");
        theTree1.addNode(13, "T1 F");
        theTree1.addNode(40, "T1 F");
        theTree1.addNode(38, "T1 F");

        theTree2.addNode(1, "T2 A");
        theTree2.addNode(2, "T2 B");
        theTree2.addNode(3, "T2 C");
        theTree2.addNode(4, "T2 D");
        theTree2.addNode(5, "T2 E");
        theTree2.addNode(6, "T2 F");

        theTree3.addNode(1, "T3 A");
        theTree3.addNode(2, "T3 B");
        theTree3.addNode(6, "T3 C");
        theTree3.addNode(4, "T3 D");
        theTree3.addNode(5, "T3 E");
        theTree3.addNode(6, "T3 F");

        // Different ways to traverse binary trees
        //theTree1.inOrderTraverseTree(theTree1.root);
        //theTree2.inOrderTraverseTree(theTree2.root);
        // theTree.preorderTraverseTree(theTree.root);
        // theTree.postOrderTraverseTree(theTree.root);
        // Find the node with key 75
        // System.out.println("\nNode with the key 75");
        // System.out.println(theTree.findNode(75));
        // theTree1.getLevels(theTree1.root);
    }
}
