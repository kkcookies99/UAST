 class Solution:
    def XXX(self, nums):
        """
        Do not return anything, modify nums in-place instead.
        """
        index1 = 0 #0的右边界
        index2 = 0 #2的左边界
        i = 0 #当前位置
        while True:
            if i > len(nums) - index2 -1: #当前位置超过2的左边界
                break
            if nums[i] == 0 and i != index1:
                temp = nums[index1]
                nums[index1] = 0
                nums[i] = temp
                index1 += 1
                continue
            elif nums[i] == 2:
                temp = nums[-(index2+1)]
                nums[-(index2+1)] = 2
                nums[i] = temp
                index2 += 1
                continue
            i += 1
        return nums

