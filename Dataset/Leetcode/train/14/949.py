 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if(len(strs)==0):
            return ""
        if(len(strs)==1):
            return strs[0]
        s=""
        for i in range(len(strs[0])):
            t=s+strs[0][i]
            flag=True
            for j in range(len(strs)):
                if(not strs[j].startswith(t)):
                    flag=False
                    break
            if(flag):
                s=t
            else:
                break;
        return s

