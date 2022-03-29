class Solution:
    def XXX(self, x: int) -> bool:
        # 时间复杂度O(n)
        if x < 0:
            return False
        nums = []
        while x != 0:
            nums.append(x%10)
            x //= 10
        for i in range(len(nums)):
            if nums[i] != nums[len(nums)-1-i]:
                return False
        return True

