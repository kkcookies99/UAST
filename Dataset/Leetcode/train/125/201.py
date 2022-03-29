 class Solution:
    def XXX(self, s: str) -> bool:
        def cleanchara(s:str):
            m = ""
            s = s.lower()
            for i in s:
                if(i.isalnum()):
                    m = m + i
            return m
        def reverse(s:str):
            s_list = list(reversed(s))
            m = ""
            for i in s_list:
                m = m + i
            return m
        n = cleanchara(s)
        m = reverse(n)
        if n == m:
            return True
        else:
            return False

