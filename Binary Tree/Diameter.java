// diamete of a tree
public class Diameter {
    static class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
}
public static int height(Node node) {
    if (node == null) {
        return 0;
    }
    return 1 + Math.max(height(node.left), height(node.right));
}
public static int diameter(Node root) { // time complxity: oN^
    if(root == null) {
        return 0;
    }
    int leftDiam = diameter(root.left);
    int leftHt = height(root.left);
    int rightDiam = diameter(root.right);
    int rightHt = height(root.right);

    int selfDiam = leftHt + rightHt + 1;
    return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
}
public static void main(String[] args) {
    /*
     *     1
     *    / \
     *   2   3
     * / \   / \
     * 4 5   6 7
     */

     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right.left = new Node(6);
     root.right.right = new Node(7);

     System.out.println(diameter(root));
}
}
