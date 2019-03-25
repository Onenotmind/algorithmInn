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
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    if(root2==null || root1==null) return false;     
    boolean flag = false; // B树是否是A树的子树的判断值 true代表是 false代表不是
    if(root1.val==root2.val){ // A树中与B树根节点一样的节点
        // 找到B根节点在A树中的节点
        flag = isSubTree(root1, root2);
    }
    // 当前节点不满足，则递归的寻找子树中的节点
    if(!flag){
        // 递归左子树
        flag = HasSubtree(root1.left, root2);
        // 左子树没有，递归右子树
        if(!flag){
            flag = HasSubtree(root1.right, root2);
        }
    }
    return flag;
  }
  private boolean isSubTree(TreeNode root1, TreeNode root2) {
    if(root2==null) return true;
    // 当A树节点为空，B树节点不为空时说明B树不是A树的子节点
    if(root1==null && root2!=null) return false;      
    if(root1.val==root2.val){
        return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    }else{
      return false;
    }
  }
}