 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i,j = -1,len(nums)
        index = 0
        while j>index:
            if nums[index]<1:
                i+=1
                nums[index],nums[i] = nums[i],nums[index]
                index+=1
            elif nums[index]>1:
                j-=1
                nums[index],nums[j] = nums[j],nums[index]
            else:
                index+=1

