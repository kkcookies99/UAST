 class Solution:
    def XXX(self, n: int) -> str:
        k='1'
        k_1 = ''
        for i in range(n-1):
            count = 0
            x = 0
            for i in range(len(k)):
                if k[i] != k[x]:
                    k_1=k_1+str(count)+k[x]
                    count,x=0,i
                if i==len(k)-1:
                    k_1=k_1+str(count+1)+k[i]
                count+=1
            k,k_1=k_1,''     
        return k

