 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        n = 0
        for _ in range(len(nums)):
            for i in range(len(nums)):
                temp = nums[i]
                if nums[i] == val:
                    nums[i + 1:], nums[i:-1] = nums[i:-1], nums[i + 1:]
                    nums[-1] = temp
        for i in range(len(nums)):
            if nums[i] == val: n += 1
        return len(nums) - n


