 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return [[]]
        
        # 二维数组存放子集
        ans = [[]]
        for i in nums:
            ans += [[i] + x for x in ans] # x本身是数组
        return ans
        

