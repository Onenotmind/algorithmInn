# -*- coding:utf-8 -*-
# class TreeNode:
#   def __init__(self, x):
#     self.val = x
#     self.left = None
#     self.right = None
class Solution:
  def TreeDepth(self, pRoot):
    # write code here
    if not pRoot:
      return 0
    else:
      leftx = self.TreeDepth(pRoot.left) + 1
      rightx = self.TreeDepth(pRoot.right) + 1
      x = max(leftx, rightx)
      return x