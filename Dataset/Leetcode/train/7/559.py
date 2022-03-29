 class Solution:
   def XXX(self, x):
       """
       :type x: int
       :rtype: int
       """
       if x > (2**31-1) or x < -2**31:
           return 0
       a = str(x)
       if a[0] == '-':
           x = a[1:]
           x = x[::-1]
           x = -int(x)
       else:
           x = int(a[::-1])
       if x > (2**31-1) or x < -2**31:
           return 0
       return x

