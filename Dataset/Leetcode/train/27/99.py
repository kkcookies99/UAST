 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        for i in range(len(nums)-1,-1,-1):   # 逆序遍历（出栈是最后一个元素先出）
            if nums[i] == val:               # 与目标值相等
                nums.pop(i)                  # 将该元素出栈
        return len(nums)                     # 返回更新后数组的长度

