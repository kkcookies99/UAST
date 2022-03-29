 class Solution:
    def XXX(self, n: int) -> str:
        pre = '1'
        for i in range(1,n):
            count=1
            res = ''
            for j in range(1,len(pre)):
                if pre[j] != pre[j-1]:
                    res+=str(count)+pre[j-1]
                    count = 1
                else:
                    count+=1
            res+=str(count)+pre[-1]
            pre = res
        return pre

