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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,new ArrayList<>());
        return ans;
    }
    public void dfs(TreeNode root,int targetSum, List<Integer> l) {
        if(root==null)return;
        l.add(root.val);
        if(root.left==null && root.right==null && targetSum==root.val) {
            ans.add(new ArrayList(l));
        }else{
            dfs(root.left,targetSum-root.val,l);
            dfs(root.right,targetSum-root.val,l);
        }
        l.remove(l.size()-1);
    }
}