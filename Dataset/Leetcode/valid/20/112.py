 class Solution:
    def XXX(self, s: str) -> bool:
        if len(s) % 2 == 1:
            return False
        n = int(len(s) // 2)
        m = s
        while n > 0 :
            m = m.replace('()','')
            m = m.replace('[]','')
            m = m.replace('{}','')
            if m == '':
                return True
            n = n - 1
        return False


