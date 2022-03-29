 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        # from itertools import permutations
        # res = []
        # for p in permutations(nums, len(nums)):
        #     res.append(list(p))
        # return res
        n = len(nums)
        if n == 1:
            return [nums]
        nums.sort()
        res = []
        for i in range(n):
            start = [nums[i]]
            end_list = self.XXX([nums[j] for j in range(n) if j != i])
            for end in end_list:
                res.append(start+end)
        return res
