/**
 * Created by David on 22/11/2016.
 */
public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {
        // Create a new Node and initialize it
        Node newNode = new Node(key, name);
        // If there is no root this becomes root
        if (root == null) {
            root = newNode;
        }
        else {
            // Set root as the Node we will start
            // with as we traverse the tree
            Node focusNode = root;
            // Future parent for our new Node
            Node parent;
            while (true) {
                // root is the top parent so we start
                // there
                parent = focusNode;
                // Check if the new node should go on
                // the left side of the parent node
                if (key < focusNode.key) {
                    // Switch focus to the left child
                    focusNode = focusNode.leftChild;
                    // If the left child has no children
                    if (focusNode == null) {
                        // then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; // All Done
                    }
                }
                else { // If we get here put the node on the right
                    focusNode = focusNode.rightChild;
                    // If the right child has no children
                    if (focusNode == null) {
                        // then place the new node on the right of it
                        parent.rightChild = newNode;
                        return; // All Done
                    }
                }
            }
        }
    }

    // All nodes are visited in ascending order
    // Recursion is used to go to one node and
    // then go to its child nodes and so forth

    public void inOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseTree(focusNode.leftChild);
            // Visit the currently focused on node
            System.out.println(focusNode);
            // Traverse the right node
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void preorderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        // Start at the top of the tree
        Node focusNode = root;
        // While we haven't found the Node
        // keep looking
        while (focusNode.key != key) {
            // If we should search to the left
            if (key < focusNode.key) {
                // Shift the focus Node to the left child
                focusNode = focusNode.leftChild;
            } else {
                // Shift the focus Node to the right child
                focusNode = focusNode.rightChild;
            }
            // The node wasn't found
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

    public int max(int A, int B){
        if(A >= B){
            return A;
        }
        else{
            return B;
        }
    }

    public int levels(Node root){
        if (root == null) {
            return 0;
        }
        else {
            int A = levels(root.leftChild) + 1;
            int B = levels(root.rightChild)+ 1;
            return max(A,B);
        }
    }

    public void getLevels(Node root){
        System.out.println(levels(root));
    }

    public int inOrderTraverseCount(Node focusNode) {
        int nodeCount = 0;
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseCount(focusNode.leftChild);
            // Visit the currently focused on node
            nodeCount++;
            // Traverse the right node
            inOrderTraverseCount(focusNode.rightChild);
        }
        return nodeCount;
    }

    public boolean contEqual(Node root1, Node root2){

        int firstTree[] = new int[inOrderTraverseCount(root1)];
        int secondTree[] = new int[inOrderTraverseCount(root2)];

        for(int i = 0; i < firstTree.length; i++){
            if(firstTree[i] != secondTree[i]){
                return false;
            }
        }
        return true;
    }

}
