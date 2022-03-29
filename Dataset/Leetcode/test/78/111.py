class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        
        a=[]
        n2=2**n
        
        for i in range(n2):
            b=[]
            k=str(bin(i)[::-1])
            for j in range(len(k)-2):
                if k[j]=='1':
                    b.append(nums[j])
            a.append(b)
            
        return a

