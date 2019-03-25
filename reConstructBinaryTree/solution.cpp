/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
 class Solution {
public:
  TreeNode* reConstructBinaryTree(vector<int> pre,vector<int> in) {
  	// 判断是否为空树
	  int inlen=in.size();
	  if(inlen==0) return NULL;
	  vector<int> left_pre,right_pre,left_in,right_in;
	  // 创建根节点，根节点肯定是前序遍历的第一个数
	  TreeNode* head=new TreeNode(pre[0]);
	  // 找到中序遍历根节点所在位置,存放于变量gen中
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
	  for(int i=0;i<gen;i++)
	  {
	    left_in.push_back(in[i]);
	    left_pre.push_back(pre[i+1]);//前序第一个为根节点
	  }
	  // 将根节点右边的节点存入右子树中
	  for(int i=gen+1;i<inlen;i++)
	  {
	    right_in.push_back(in[i]);
	    right_pre.push_back(pre[i]);
	  }
	  // 递归左右子树
	  head->left=reConstructBinaryTree(left_pre,left_in);
	  head->right=reConstructBinaryTree(right_pre,right_in);
    return head;
  }
};