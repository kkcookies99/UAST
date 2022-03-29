 class Solution:
    def XXX(self, nums):
        """
        三路快排partition思想
        小于1的数移到左边,大于1的数移到右边
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i, j = -1, n  # i:0的右边界,j:2的左边界
        cur = 0
        while cur < j:
            if nums[cur] == 0:
                nums[cur], nums[i + 1] = nums[i + 1], nums[cur]
                i += 1
            if nums[cur] == 2:
                nums[cur], nums[j - 1] = nums[j - 1], nums[cur]
                j -= 1
            else:
                cur += 1

    def XXX2(self, nums):
        nums[:] = [x for x in nums if x < 1] + [x for x in nums if x == 1] + [x for x in nums if x > 1]