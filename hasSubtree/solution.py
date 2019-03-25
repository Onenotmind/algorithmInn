# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
  def HasSubtree(self, pRoot1, pRoot2):
    # 判断是否为空树
    if not pRoot1 or not pRoot2:
        return False
    # 若当前节点跟root2的节点不一样，则遍历它的左节点和右节点
    return self.is_subtree(pRoot1, pRoot2) or self.HasSubtree(pRoot1.left, pRoot2) or self.HasSubtree(pRoot1.right, pRoot2)
    
  def is_subtree(self, A, B):
    # 子树遍历完成
    if not B:
      return True
    # 当A树节点为空，B树节点不为空时说明B树不是A树的子节点
    if not A or A.val != B.val:
      return False
    return self.is_subtree(A.left,B.left) and self.is_subtree(A.right, B.right)
 