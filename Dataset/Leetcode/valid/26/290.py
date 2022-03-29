 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # 后一个等于前一个，都向前移动一位
        n = len(nums)
        count = 0
        i = 0
        while i < n-count-1:
            if nums[i] == nums[i + 1]:
                count += 1
                nums.remove(nums[i])
            if i >= len(nums)-1:
                break
            if nums[i] != nums[i+1]:
                i += 1
        return n-count

