import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *   int val;
 *   TreeNode left;
 *   TreeNode right;
 *   TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    int inlen = in.length;
    if (inlen == 0) return null;
    int [] left_pre,right_pre,left_in,right_in;
    //创建根节点，根节点肯定是前序遍历的第一个数
    TreeNode head=new TreeNode(pre[0]);
    //找到中序遍历根节点所在位置,存放于变量gen中
    int gen=0;
    for(int i=0;i<inlen;i++)
    {
        if (in[i]==pre[0])
        {
            gen=i;
            break;
        }
    }
    // 将根节点左边的节点存入左子树中
    left_in = Arrays.copyOfRange(in, 0, gen);
    left_pre = Arrays.copyOfRange(pre, 1, gen + 1);
    // 将根节点右边的节点存入右子树中
    right_in = Arrays.copyOfRange(in, gen + 1, inlen);
    right_pre = Arrays.copyOfRange(pre, gen + 1, inlen);
    // 递归左右子树
    head.left=reConstructBinaryTree(left_pre,left_in);
    head.right=reConstructBinaryTree(right_pre,right_in);
    return head;
  }
}