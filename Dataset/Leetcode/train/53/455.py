 class Solution:
    def XXX(self, nums: List[int]) -> int:
        res = []
        temp = 0
        for num in nums:
            if temp < 0:
                temp = 0
            temp += num
            res.append(temp)
        return max(res)


