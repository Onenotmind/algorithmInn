/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
*/
public class Solution {
  public int TreeDepth(TreeNode root) {
    if (root != null) {
  	// 左子树与右子树的高度取最大值加上当前节点
  	return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
  }
  return 0;
  }
}