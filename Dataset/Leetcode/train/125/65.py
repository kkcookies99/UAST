 class Solution:
    def XXX(self, s: str) -> bool:
        a = []
        for i in s:
            if i.isalpha()==True:
                a.append(i.lower())
        return(a == a[::-1])

