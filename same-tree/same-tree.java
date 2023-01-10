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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //p and q are both null
        if(p==null && q == null ) return true;
        //one of p or q is null
        if(q == null || p == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        
    }
}


//https://leetcode.com/problems/same-tree/solutions/250926/same-tree/
//The complexity is O(N) is both Time and Space complexity
//Time complexity : O(N), where N is a number of nodes in the tree, since one visits each node exactly once.

//Space complexity : O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.
