 class Solution:
    def XXX(self, nums: List[int]) -> int:
        lens = len(nums)
        if lens <= 1:
            return nums[0]
        max_num = -10**(5)
        start_num = 0
        index = 0
        for i in range(lens):
            if nums[i] > 0:
                while index<=i:
                    start_num += nums[index]
                    index += 1
                if start_num >= nums[i]:
                    max_num = max(start_num, max_num)
                else:
                    max_num = max(max_num, nums[i])
                    start_num = nums[i]
            else:
                max_num = max(max_num, nums[i])
        return max_num

