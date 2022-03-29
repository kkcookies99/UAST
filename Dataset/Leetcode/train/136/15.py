 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # 直接用Counter 统计计数
        c = collections.Counter(nums)

        for k,v in c.items():
            if v == 1:
                return k

