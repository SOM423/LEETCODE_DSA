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
    public int maxDepth(TreeNode root) {

        if(root != null)
        {
            int leftH=1;
            int rightH=1;

            leftH = maxDepth(root.left);
            rightH = maxDepth(root.right);

            return Math.max(leftH,rightH)+1;
        }
        return 0;
        
    }
}