 class Solution:
    def singleNumber(self, nums: List[int]) -> int:

        appear = {}

        for num in nums:
            if num not in appear:
                appear[num] = 1
            else:
                appear[num] += 1

        for k, v in appear.items():
            if v == 1:
                return k 


