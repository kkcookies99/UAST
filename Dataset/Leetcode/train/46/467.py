 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        def dfs(tmp):
            if len(tmp) == len(nums):  # 判断条件为 tmp中有足够的元素
                ret.append(tmp)
                return
            for i in range(len(nums)):  # 全排列，那么每次都可以取其他的值，因为不能重复
                if nums[i] in tmp:  # 如果遇到重复的值就跳过去
                    continue
                dfs(tmp + [nums[i]])
        ret = []
        dfs([])
        return ret

