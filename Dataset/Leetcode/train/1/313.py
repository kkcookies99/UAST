 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        l = []
        for i in range(1, target):
            if i in nums:
                if target - i in nums:
                    l.append(nums.index(i))
                    l.append(nums.index(target - i))
                    return l

