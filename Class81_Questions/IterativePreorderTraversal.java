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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if(root == null)
            return preorder;
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while(!stk.isEmpty()){
            TreeNode top = stk.pop();

            preorder.add(top.val);

            // 1st chance -> right
            if(top.right != null)
                stk.push(top.right);
    
            // 2nd chance -> left
            if(top.left != null)
                stk.push(top.left);
        }

        return preorder;
    }
}