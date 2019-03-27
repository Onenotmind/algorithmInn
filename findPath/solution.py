# -*- coding:utf-8 -*-
# class TreeNode:
#   def __init__(self, x):
#     self.val = x
#     self.left = None
#     self.right = None
class Solution:
  # 返回二维列表，内部每个列表表示找到的路径
  def FindPath(self, root, expectNumber):
    # 当节点为空，返回
    if not root:
      return []
    # 满足条件
    if root and not root.left and not root.right and root.val == expectNumber:
      return [[root.val]]
    res = []
    # 递归左右子树
    left = self.FindPath(root.left, expectNumber-root.val)
    right = self.FindPath(root.right, expectNumber-root.val)
    for i in left+right:
      res.append([root.val]+i)
    return res