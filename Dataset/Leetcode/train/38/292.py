class Solution:
    def XXX(self, n: int) -> str:      
        res = '1'

        for i in range(n-1):
            cnt = 1
            tmp = ''
            for j in range(1,len(res)):
                if res[j] == res[j-1]:
                    cnt+=1
                else:
                    tmp+=str(cnt)+res[j-1]
                    cnt=1
            res = tmp+str(cnt)+res[-1]

        return res

