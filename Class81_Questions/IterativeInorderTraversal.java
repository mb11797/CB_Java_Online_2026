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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();

        while(root != null || !stk.isEmpty()){
            // go as much left as possible
            while(root != null){
                stk.push(root);
                root = root.left;
            }

            // reached null -> backtrack to leftmost node which is on stack top
            root = stk.pop();

            // process leftmost node -> print
            inorder.add(root.val);
            // shift control to the right of leftmostnode popped from stack
            root = root.right;
        }

        return inorder;
    }
}