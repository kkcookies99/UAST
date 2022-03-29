class Solution:
    def XXX(self,n):
        ans=[1,2,3,5]
        while(len(ans)<n):
            ans.append(ans[-1]+ans[-2])
        return ans[n-1]

