/* function TreeNode(x) {
  this.val = x;
  this.left = null;
  this.right = null;
} */
function TreeDepth(pRoot)
{
  if(pRoot == null){
    return 0;
  }
  var left = TreeDepth(pRoot.left)+1;
  var right = TreeDepth(pRoot.right)+1;
  return Math.max(left, right);
}
module.exports = {
  TreeDepth : TreeDepth
};