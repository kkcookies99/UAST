 class Solution:
    def XXX(self, nums: List[int]) -> int:
        lenth = len(nums)-1
        if lenth > 0:
            for i in range(lenth):
                if nums[lenth-i] == nums[lenth-i-1]:
                    del nums[lenth-i-1]
        return len(nums)

