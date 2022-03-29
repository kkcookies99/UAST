class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def backtracking(start_idx: int) -> None:
            res.append(path[:])
            for i in range(start_idx, len(nums)):
                path.append(nums[i])
                backtracking(i + 1)
                path.pop()

        res = []
        path = []
        backtracking(0)
        return res

