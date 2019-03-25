/* function TreeNode(x) {
    this.val = x;
    this.left = null;
    this.right = null;
} */

function isSubtree(root1, root2) {
  // 子树遍历完成
  if (root2 == null) return true;
  // 当A树节点为空，B树节点不为空时说明B树不是A树的子节点
  if (root1 == null) return false;
  if (root1.val == root2.val) {
    return isSubtree(root1.left, root2.left) &&
      isSubtree(root1.right, root2.right);
  } else {
      return false;  
  }
}


function HasSubtree(pRoot1, pRoot2)
{
 // 判断是否为空树
 if (pRoot1 == null || pRoot2 == null) {
    return false;
 }
 // 若当前节点跟root2的节点不一样，则遍历它的左节点和右节点
  return isSubtree(pRoot1, pRoot2) ||
      HasSubtree(pRoot1.left, pRoot2) ||
      HasSubtree(pRoot1.right, pRoot2);
}

module.exports = {
  HasSubtree : HasSubtree
};