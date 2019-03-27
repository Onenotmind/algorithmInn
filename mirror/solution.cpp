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
  void Mirror(TreeNode *pRoot) {
    // 当前节点为空
    if (pRoot == NULL)
      return;
    // 交换左右子树
    TreeNode *pTmp;
    pTmp = pRoot->left;
    pRoot->left = pRoot->right;
    pRoot->right = pTmp;
    // 递归左右子树 
    Mirror(pRoot->left);
    Mirror(pRoot->right);
  }
};