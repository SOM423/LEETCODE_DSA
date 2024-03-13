/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {

        invert(root);
        return root;
        
    }

    public void invert(TreeNode root)
    {
        //Base case
        if(root==null) return;

        //Swap left node with right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //similarly do for rest left and right

        invert(root.left);
        invert(root.right);

    }
}