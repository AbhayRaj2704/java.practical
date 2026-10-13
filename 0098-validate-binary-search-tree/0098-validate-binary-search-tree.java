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
    public static boolean checkBST(TreeNode node, Long min, Long max){
        if (node == null){
            return true;
        }
        if((node.val <=min) || (node.val>=max)){
            
            return false;

        }
        return checkBST(node.left,min, (long)node.val) && checkBST(node.right,(long)node.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

      
    }
}