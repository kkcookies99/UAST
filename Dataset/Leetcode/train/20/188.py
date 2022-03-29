 class Solution:
    def XXX(self, s: str) -> bool:
        # 栈
        ls = []
        left = ['(', '[','{']
        sy = ['()','[]','{}']
        for c in s:
            if c in left:
                ls.append(c)
            elif ls and ls[-1]+c in sy:
                ls.pop()
            else:
                return False
        return ls == []
        


