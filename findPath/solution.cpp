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
  vector<vector<int> > buffer;
  vector<int> tmp;
  vector<vector<int> > FindPath(TreeNode* root,int expectNumber) {
    // 当节点为空，返回buffer最终结果
    if(root==NULL)
      return buffer;
    // 添加当前节点值
    tmp.push_back(root->val);
    // 满足条件
    if((expectNumber-root->val)==0 && root->left==NULL && root->right==NULL)
    {
      buffer.push_back(tmp);
    }
    // 递归左右子树
    FindPath(root->left,expectNumber-root->val);
    FindPath(root->right,expectNumber-root->val);
    // 删除上次递归的节点
    if(tmp.size()!=0)
      tmp.pop_back();
    return buffer;
  }
};
