// Time Complexity : o(h)
// Space Complexity : o(1)

public class Solution1 {
     static class Node {
        int data;
        Node left;
        Node right;
     };
     static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return(temp);
     }
     static boolean isUnivalTree(Node root) {
        if(root == null){
            return true;
        }
        if(root.left != null && root.data != root.left.data)
        return false;

        if(root.right != null && root.data != root.right.data)
        return false;

        return isUnivalTree(root.left)
        && isUnivalTree(root.right);
     }
     public static void main(String[] args) {
      Node root = newNode(2);
      root.left = newNode(2);
      root.right = newNode(2);
      root.left.left = newNode(2);
      root.left.right = newNode(2);
      root.right.right = newNode(5);
/*
 *               2
 *             /   \
 *           2      2
 *          /  \  
 *         5    2
 */
      if(isUnivalTree(root)) {
         System.out.print("Yes");
      }
      else {
         System.out.print("No");
      }
   }
}
