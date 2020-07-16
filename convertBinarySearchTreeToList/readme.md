输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

[题目详情](https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)

# 解题思路

1. 可以通过 中序遍历 获取每一个节点的引用，放入一个数组中

2. 然后数组依次遍历 更改每一个节点的左右指针就可以