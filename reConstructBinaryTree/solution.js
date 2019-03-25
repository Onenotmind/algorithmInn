function TreeNode(x) {
  this.val = x;
  this.left = null;
  this.right = null;
}

function reConstructBinaryTree(pre, vin){
  // 判断是否为空树
  if(pre.length == 0 || vin.length == 0 ) {
      return null;
  }
  // 创建根节点，根节点肯定是前序遍历的第一个数
  let binaryTree = new TreeNode(pre[0]);
  let pre_left = [], pre_right = [], vin_left = [], vin_right = [];
  // 找到中序遍历根节点所在位置,存放于变量index中
  let index = vin.indexOf(pre[0]);
  // 将根节点左边的节点存入左子树中
  pre_left = pre.slice(1, index+1);
  vin_left = vin.slice(0, index);
  // 将根节点右边的节点存入右子树中
  pre_right = pre.slice(index+1);
  vin_right = vin.slice(index+1);
  // 递归左右子树  
  binaryTree.left = reConstructBinaryTree(pre_left, vin_left);
  binaryTree.right = reConstructBinaryTree(pre_right, vin_right);
    
  return binaryTree; 
}
module.exports = {
  reConstructBinaryTree : reConstructBinaryTree
};