 class Solution:
    def XXX(self, nums: List[int]) -> int:
        x = list(set(nums))
        x.sort(key=nums.index)
        nums[:len(x)] = x
        return len(x)

