class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        path = []
        nLen = len(nums)

        def back_trade(nums):
            if len(path) == nLen:
                res.append(path[:])
                return

            for i in range(nLen):
                if nums[i] in path:
                    # 已经在path中了，跳过
                    continue
                path.append(nums[i])
                back_trade(nums)
                path.pop()

        back_trade(nums)
        return res

