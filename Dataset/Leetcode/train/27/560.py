 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        j=0
        for i in nums:
            if i!=val:
                nums[j]=i
                j+=1
        return(j)

