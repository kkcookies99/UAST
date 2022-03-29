class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(nums, num, path):
            path.append(num)

            # end case of dfs
            if len(path) == size:
                res.append(path)
            else:
                remains = nums[:]
                remains.remove(num)
                
                # further dfs
                for num in remains:
                    dfs(remains, num, path[:])

        res = []
        size = len(nums)
        for num in nums:
            path = []
            dfs(nums, num, path)

        return res

