class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        """回溯法"""
        res, size = [], len(nums)
        # if size == 0: return []  # 题目其实要求 len(nums) > 0
        
        used = [False for _ in range(size)]

        def dfs(depth, path):
            """深度优化遍历
            depth: 递归的层级，初始为 0
            path: 节点，根节点为 []
            """
            if depth == size:
                res.append(path[:])
                return
            for i in range(size):
                if not used[i]:
                    # 将满足条件的 nums[i] 添加到 path 中，并标记为已使用
                    used[i] = True
                    path.append(nums[i])  # <== p1
                    # 进入下一层
                    dfs(depth + 1, path)  # <== p2
                    # 回退到当前层级时回退状态，即移除添加的元素，消除占用标记
                    used[i] = False
                    path.pop()  # <== p3

        dfs(0, path=[])  # <== p0 = []
        return res


