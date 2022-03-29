 class Solution:
   def XXX(self, pRoot):
       def core(pRoot):
           if pRoot is None:
               return 0
           l = core(pRoot.left)
           r = core(pRoot.right)
           if abs(l - r) > 1:
               raise Exception
           return max(l, r) + 1
       try:
           core(pRoot)
       except Exception:
           return False
       return True

