/**
public class TreeNode {
  int val = 0;
  TreeNode left = null;
  TreeNode right = null;
  public TreeNode(int val) {
    this.val = val;
  }
}
*/

public class Solution {
  public void Mirror(TreeNode root) {
    if(root == null) return; // 当前节点为空
    if(root.left == null && root.right == null) return; // 左右子树都为空，此时就没必要作交换
    // 交换左右子树
    TreeNode pTemp = root.left;
    root.left = root.right;
    root.right = pTemp;
    // 递归左右子树    
    if(root.left != null) Mirror(root.left);
    if(root.right != null) Mirror(root.right);
  }
}