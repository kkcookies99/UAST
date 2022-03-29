 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # 思路：使用双指针法，固定一个数，其他两个数与该数之和为0
        nums.sort()
        n = len(nums)
        res = []
        for i in range(n):
            if i>0 and nums[i] == nums[i-1]:       # 判断固定的数是否重复
                continue
            left = i + 1
            right = n - 1
            while left < right:
                cur = nums[i] + nums[left] + nums[right]   
                if cur == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    while left<right and nums[left] == nums[left+1]:    # 判断是否重复
                        left += 1
                    while right<left and nums[right] == nums[right-1]:
                        right -= 1
                    left += 1
                    right -= 1
                elif cur > 0:
                    right -= 1
                else:
                    left += 1
        return res

