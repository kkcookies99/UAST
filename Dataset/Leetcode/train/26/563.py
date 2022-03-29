 class Solution:
    def XXX(self, nums: List[int]) -> int:
        i=1
        j=0
        for j in range(1,len(nums)):
            if(nums[j-1]!=nums[j]):
                nums[i]=nums[j]
                i+=1
            j=j+1
        return i

