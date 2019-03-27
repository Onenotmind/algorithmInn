# -*- coding:utf-8 -*-
class Solution:
  def Fibonacci(self, n):
    # write code here
    f0, f1 = 0, 1
    a = n
    for i in xrange(2, n+1):
      a = f0 + f1
      f0 = f1
      f1 = a
    return a