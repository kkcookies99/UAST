 class Solution:
    def XXX(self, nums: List[int]) -> int:
        nums_store=[]
        i=0
        while i<=len(nums)-1:
            if nums[i] in nums_store:
                nums.remove(nums[i])
            else:
                nums_store.append(nums[i])
                i+=1
        return len(nums)


