# -*- coding:utf-8 -*-
# class TreeNode:
#   def __init__(self, x):
#     self.val = x
#     self.left = None
#     self.right = None
class Solution:
  def reConstructBinaryTree(self, pre, tin):
    # 判断是否为空树
    if not pre or not tin:
        return None
    # 创建根节点，根节点肯定是前序遍历的第一个数
    root = TreeNode(pre.pop(0))
    # 找到中序遍历根节点所在位置,存放于变量index中
    index = tin.index(root.val)
    # 递归左右子树
    root.left = self.reConstructBinaryTree(pre, tin[:index])
    root.right = self.reConstructBinaryTree(pre, tin[index + 1:])
    return root