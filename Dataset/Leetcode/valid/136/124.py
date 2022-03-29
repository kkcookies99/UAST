 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = []
        for num in nums:
            if num not in res:
                res.append(num)
            else:
                res.remove(num)
        return res[0]

