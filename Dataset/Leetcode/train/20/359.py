 class Solution:
    def XXX(self, s: str) -> bool:
        res=[]
        for i in s:
            if i == '(' or i =='['  or i =='{':
                res.append(i)
            else:
                try:
                    if self.match(res[len(res)-1],i):
                        res.pop()
                    else:
                        return False
                except:
                    return False
        if not res:
            return True 
        else:
            return False
    
    def match(self,s1,s2):
        if (s1=="(" and s2==")") or (s1=='[' and s2==']') or (s1=='{' and s2 =='}'):
            return True
        else:
            return False

