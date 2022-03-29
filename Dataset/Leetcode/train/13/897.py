 class Solution:
    @classmethod
    def XXX(self, s: str) -> int:
        dict={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        li = {}
        for i in range(len(s)):
            li[i] = dict[s[i]]
        li1 = list(li.values())
        for j in range(len(li1)-1):
            if li1[j]<li[j+1]:
                li1[j] = -li1[j]
        return sum(li1)

