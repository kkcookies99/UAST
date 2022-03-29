class Solution:
    def XXX(self, n: int) -> int:
        ans=0
        two_max=int(n/2)
        for c_two in range(two_max+1):
            c_one=n-c_two*2
            asum=c_two+c_one
            amin=min(c_one,c_two)
            count=1
            for i in range(amin):
                count=int(count*(asum-i)/(i+1))
            ans+=count
        return ans

