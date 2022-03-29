 class Solution(object):
    def XXX(self, nums, target):
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    list = [i, j]
                    return list
num_list = [2, 7, 11, 15]
summer = Solution()
summer.XXX(num_list, 9)

