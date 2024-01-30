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
    ArrayList<Integer> list = new ArrayList();
    int min=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        for(int i=0;i<list.size()-1;i++)
        {
           if(min > (list.get(i+1) - list.get(i)))
           {
               min= list.get(i+1) - list.get(i);
           } 
        }
        return min;
    }

    //Perform in Order traversal
    public void inOrder(TreeNode root)
    {
        if(root!= null)
        {
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }
}