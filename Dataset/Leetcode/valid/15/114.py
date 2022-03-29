 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
        for i1 in range(0, len(nums) - 2):
            for i2 in range(i1 + 1, len(nums) - 1):
                for i3 in range(i2 + 1, len(nums)):
                    if nums[i1] + nums[i2] + nums[i3] == 0:
                        l1 = sorted([nums[i1], nums[i2], nums[i3]])
                        if l1 not in result:
                            result.append(l1)
        return result

