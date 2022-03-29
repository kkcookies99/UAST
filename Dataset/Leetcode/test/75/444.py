 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lt = -1  # 右闭
        gt = len(nums)  # 左闭
        i = 0  # 右开

        while i < gt:
            if nums[i] < 1:
                nums[lt + 1], nums[i] = nums[i], nums[lt + 1]
                lt += 1
                i += 1
            elif 1 < nums[i]:
                nums[gt - 1], nums[i] = nums[i], nums[gt - 1]
                gt -= 1
            else:
                i += 1

