/*
struct TreeNode {
  int val;
  struct TreeNode *left;
  struct TreeNode *right;
  TreeNode(int x) :
    val(x), left(NULL), right(NULL) {
  }
};*/
class Solution {
public:
  bool HasSubtree(TreeNode* pRoot1, TreeNode* pRoot2)
  {
    if(!pRoot1 || !pRoot2) return false;
    bool result=false; // B树是否是A树的子树的判断值 true代表是 false代表不是
    if(pRoot1->val == pRoot2->val) result=isSubtree(pRoot1,pRoot2); // A树中与B树根节点一样的节点,遍历他们的子树，看是否一样
    // 当前节点不满足，则递归的寻找子树中的节点
    if(!result) result=HasSubtree(pRoot1->left,pRoot2); // 递归左子树
    if(!result) result=HasSubtree(pRoot1->right,pRoot2); // 左子树没有，递归右子树
    return result;
  }
    
  bool isSubtree(TreeNode* pRoot1, TreeNode* pRoot2)
  {
    if(!pRoot2) return true; // 子树遍历完成
    // 当A树节点为空，B树节点不为空时说明B树不是A树的子节点
    if(!pRoot1) return false;
    bool result=true;
    if(pRoot1->val!=pRoot2->val) result=false;
    if(result) result=isSubtree(pRoot1->left,pRoot2->left);
    if(result) result=isSubtree(pRoot1->right,pRoot2->right);
    return result;
  }
};