 class Solution:
    def XXX(self, n: int) -> List[str]:

        from itertools import product
   
        kuohao = tuple(['()']*n*2)
        res = []

        for i in product(*kuohao):
            one = ''.join(list(i))
            if self.isvalid(one):
                res.append(one)

        return res 
        
    def isvalid(self,s):
        while s and '()' in s:
            s = s.replace('()','')            
        if s:
            return False
        else:
            return True

