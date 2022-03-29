 class Solution:
    def XXX(self, n: int) -> str:
        for i in range(1,n+1):
            if i==1:
                sum='1'
            else:
                l=len(sum)
                c=1
                s=''
                for i in range(l-1):
                    if sum[i]==sum[i+1]:
                        c+=1
                    else:
                        s=s+str(c)+sum[i]
                        c=1
                sum=s+str(c)+sum[l-1]
        return sum

