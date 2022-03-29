 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count=len(nums)
        index=0
        while count>=-1 and index<len(nums):
            count-=1
            i=nums[index]
            if i==2:
                del(nums[index])
                nums.append(2)
                index-=1
            if i==0:
                del(nums[index])
                nums.insert(0,0)
            index+=1

