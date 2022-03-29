 class Solution:
    def XXX(self, s: str) -> int:
        count={'M': 1000,'CM': 900,'D': 500,'CD': 400,'C': 100,'XC': 90,'L': 50,'XL': 40,'X': 10,'IX': 9,'V': 5,'IV': 4,'I': 1}
        res=0
        temp=list(s)
        while len(temp)>1:
            end=temp.pop()
            if temp[-1]+end in count:
                res+=count[temp[-1]+end]
                temp.pop()
            else:
                res+=count[end]
        res+=count[temp[0]] if len(temp)==1 else 0
        return res

