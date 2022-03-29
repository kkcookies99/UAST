 class Solution(object):
   def XXX(self, x):
       """
       String
       :type x: int
       :rtype: bool
       """
       if (not x and x != 0) or x < 0:
           return
       if x < 10:
           return True
       x = str(x)
       l = len(x)
       if l % 2:
           return x[:l/2][::-1] == x[l/2+1:]
       else:
           return x[:l/2][::-1] == x[l/2:]

