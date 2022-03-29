 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if(nums == None or len(nums) < 3):
            return []
        nums.sort()
        res = []
        for i in range(len(nums)):
            if(nums[i] > 0):
                return res
            # 去重第一部分
            if(i > 0 and nums[i] == nums[i-1]):
                continue
            left, right = i + 1, len(nums) - 1
            while(left < right):
                # 因为数组已经排序, 当nums[i]确定后, 整体大于0, 那么只能减小right对应的值
                if(nums[i] + nums[left] + nums[right] > 0):
                    right = right - 1
                # 因为数组已经排序, 当nums[i]确定后, 整体小于0, 那么只能增大left对应的值
                elif(nums[i] + nums[left] + nums[right] < 0):
                    left = left + 1
                else:
                    res.append([nums[i], nums[left], nums[right]])
                    # 高效去重第二部分, 一般情况下找到三数之和为0后, 应该左指针右移一位同时右指针左移一位, 然后继续搜索
                    # 但是题目返回数组要求不能重复, 左指针右移一位后可能值没变, 所以要确定值变为止, 右指针同理
                    while(left < right and nums[left + 1] == nums[left]):
                        left = left + 1
                    while(left < right and nums[right - 1] == nums[right]):
                        right = right - 1
                    left = left + 1
                    right = right - 1
        return res

