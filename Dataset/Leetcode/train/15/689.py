 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort(reverse=False)
        results = []
        for i in range(len(nums)):
            left = 0
            right = len(nums) - 1
            while left < right:
                if left == i:
                    left += 1
                    continue
                if right == i:
                    right -= 1
                    continue
                two_sum = nums[left] + nums[right]
                if two_sum + nums[i] > 0:
                    right -= 1
                elif two_sum + nums[i] < 0:
                    left += 1
                else:
                    result = [nums[i], nums[left], nums[right]]
                    result.sort(reverse=False)
                    if result not in results:
                        results.append(result)
                    left += 1
                    right -= 1
        return results

