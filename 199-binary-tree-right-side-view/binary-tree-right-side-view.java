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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList();

        printRightview(root,1,list);

        return list;
        
    }

    public static void printRightview(TreeNode root,int level,List<Integer> list)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            if(list.size() < level)
            {
                list.add(root.val);
            }
        }
        printRightview(root.right,level+1,list);
        printRightview(root.left,level+1,list);

    }
}