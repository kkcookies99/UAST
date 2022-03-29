 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        # 用来储存结果
        result = []
        # 深度优先遍历，有一个path来记得当时走过的，这个技巧可以记住
        def DFS(nums, path):
            # 如果目标长度只有1，那么就说明不能再往下走了，停止，把我们的记忆单元放入存结果的模块
            if len(nums) == 1:
                path = path + [nums[0]]
                result.append(path)
                return
            # 对每一个都要进行一次遍历，记住要copy避免一起变化
            for i in nums:
                temp = nums.copy()
                temp.remove(i)
                DFS(temp, path + [i])

        DFS(nums, [])
        return result

