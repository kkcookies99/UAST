 class Solution(object):
    def XXX(self, nums):
        """
        方法二:
        快慢指针
        i指向最后一个不重复元素,如果nums[i]与num[j]相等,j不断往前走,直到遇到一个不重复的元素与i后一个元素
        :param nums:
        :return: int
        """
        n = len(nums)
        i, j = 0, 1
        while j < n:
            if nums[i] == nums[j]:
                j += 1
            else:
                nums[i + 1], nums[j] = nums[j], nums[i + 1]
                i += 1
                j += 1
        return i + 1

    def XXX2(self, nums):
        """
        方法一:
        利用Python特性,列表名后加上[:]就会直接修改原列表
        先转为set暴力去重后再转回列表
        :type nums: List[int]
        :rtype: int
        """
        nums[:] = sorted(list(set(nums)))
        return len(nums)