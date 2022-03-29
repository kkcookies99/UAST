 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        all_prob=2**n
        ans=list()
        for i in range(all_prob):
            temp=[]
            bit=bin(i)[2:][::-1]
            index=0
            while(index<len(bit)):
                if bit[index]=='1':
                    temp.append(nums[index])
                index+=1
            ans.append(temp)
        return ans

