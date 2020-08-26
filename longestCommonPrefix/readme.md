编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
说明:

所有输入只包含小写字母 a-z 。


[题目详情](https://leetcode-cn.com/problems/longest-common-prefix)

# 解题思路

## 暴力法

1. 实现一个函数，判断某个字符串中是否存在指定子字符串
2. 将最小的元素进行遍历 比如上述例子 对 'flow' 进行处理
3. 则应该遍历 f fl flo flow l lo low o ow w 等这些情况 注意 上述这些是递进 比如 当没有 `fl` 时，则不必遍历  `flo` `flow` 直接进行 `l` 的遍历