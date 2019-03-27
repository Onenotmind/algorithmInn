# -*- coding:utf-8 -*-
class Solution:
  def jumpFloor(self, n):
    # write code here
    f0, f1 = 1, 2
    a = n
    for i in xrange(3, n+1):
      a = f0 + f1
      f0 = f1
      f1 = a
    return a