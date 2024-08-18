class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    public Node buildTree(int nodes[]) {
        return buildTreeUtil(nodes, 0);
    }

    private Node buildTreeUtil(int nodes[], int index) {
        if (index < nodes.length) {
            Node newNode = null;
            if (nodes[index] != -1) {
                newNode = new Node(nodes[index]);
                newNode.left = buildTreeUtil(nodes, 2 * index + 1);
                newNode.right = buildTreeUtil(nodes, 2 * index + 2);
            }
            return newNode;
        }
        return null;
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

public class InOrder {
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.inorder(root);
    }
}
