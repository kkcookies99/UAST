class Solution:
    def XXX(self, n: int) -> int:
        # f(n) = f(n-1) + f(n-2)
        
        if n <= 2:
            return n

        nums = [1, 2, 0]
        for _ in range(2, n):
            nums[2] = nums[0] + nums[1]
            nums[0], nums[1] = nums[1], nums[2]
        
        return nums[-1]

