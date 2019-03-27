/* function TreeNode(x) {
  this.val = x;
  this.left = null;
  this.right = null;
} */
function Mirror(root)
{
  // 当前节点不为空
  if(root == null) return
  // 递归左右子树
  var left = Mirror(root.left);
  var right = Mirror(root.right);
  // 交换左右子树
  root.left = right;
  root.right = left;
  return root ;
}
module.exports = {
  Mirror : Mirror
};