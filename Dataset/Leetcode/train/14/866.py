 class Solution:
    def XXX(self, strs):
        if len(strs)==1:
            return strs[0]
        if "" in strs or strs[0][0]!=strs[1][0]:
            return ""
        i=0
        ans=''
        while(i<min(len(strs[0]),len(strs[1]))):
            if strs[0][i]==strs[1][i]:
                ans+=strs[0][i]
                i+=1
            else:
                break
        if len(strs)==2:
            return ans
        else:
            for j in strs[2:]:
                if j[:i]==ans:
                    continue
                else:
                    while(j[:i]!=ans):
                        i-=1
                        ans=ans[:-1]
                        if ans=="":
                            return ans
        return ans

