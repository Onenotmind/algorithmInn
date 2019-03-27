/* function TreeNode(x) {
  this.val = x;
  this.left = null;
  this.right = null;
} */
function FindPath(root, expectNumber)
{
  paths=[]; // 返回最终路径
  temp=[]; // 临时返回
  if(!root){
   return [];
  }
  cal(root,expectNumber);
  return paths;
}
  
function cal(root,expectNumber){
  // 添加当前节点值
  temp.push(root.val);
  // 满足条件
  if(root.val==expectNumber && root.left==null && root.right==null){
    paths.push(temp.slice());
  } else {
    if(root.left!=null) cal(root.left,expectNumber-root.val);
    if(root.right!=null) cal(root.right,expectNumber-root.val);
  }
  temp.pop();
}
module.exports = {
  FindPath : FindPath
};