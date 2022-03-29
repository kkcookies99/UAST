 class Solution:
    def XXX(self,nums,targets):
        s = -1
        dic = {}

        for i in nums:
            s=s+1
            if targets-i not in dic:
                dic[i]=s
            else:
                return [dic[targets-i],s]

