 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        head = 0
        tail = len(nums)-1
        i = 0
        while i <= tail:
            if nums[i] == 0:
                nums[i] = nums[head]
                nums[head] = 0
                head += 1
                i += 1
            elif nums[i] == 2:
                nums[i] = nums[tail]
                nums[tail] = 2
                tail -= 1
            elif nums[i] == 1:
                i += 1

