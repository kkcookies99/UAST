 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = set()
        nums.sort()
        for i, n in enumerate(nums):
            a = i + 1
            b = len(nums) - 1
            while a < b:
                if nums[a] + nums[b] == -n:
                    res.add((nums[a], nums[b], n))
                    a += 1
                    b -= 1
                elif nums[a] + nums[b] > -n:
                    b -= 1
                else:
                    a += 1
        return list(res)

