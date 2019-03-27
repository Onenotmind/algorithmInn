import java.util.ArrayList;
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
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
      if(root == null) return listAll; // 当节点为空，返回listAll最终结果
      list.add(root.val); // 添加当前节点值到list
      target -= root.val; // 目标值减去当前值
      if(target == 0 && root.left == null && root.right == null)
          listAll.add(new ArrayList<Integer>(list));
      FindPath(root.left, target); // 递归左子树 
      FindPath(root.right, target); // 递归右子树
      list.remove(list.size()-1); // 删除上次递归的节点
      return listAll;
  }
}