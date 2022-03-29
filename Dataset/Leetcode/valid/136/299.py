 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        uniq = set()
        nums_len = len(nums)
        for i in range(nums_len):
            if nums[i] not in uniq:
                uniq.add(nums[i])

            else:
                uniq.remove(nums[i])
        (ans,) = uniq
        return ans

