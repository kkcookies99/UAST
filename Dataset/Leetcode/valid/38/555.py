 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return '1'
        else:
            pre_ans = self.XXX(n-1)
            count = 1
            ans = ''
            for i_idx,i in enumerate(pre_ans[:-1]):
                if i == pre_ans[i_idx+1]:
                    count+=1
                else:
                    ans+=str(count)+i
                    count = 1
            ans+=str(count)+pre_ans[-1]
            return ans

