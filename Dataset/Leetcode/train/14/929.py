 class Solution:
    def XXX(self, strs: List[str]) -> str:
        a=strs[0]
        l=''
        for i in a:
            flag=0
            for j in strs:
                if len(l)>=len(j) or i!=j[len(l)]:
                    flag=1
                    break
            if flag==1:
                break
            else:
                l+=i
        return l

