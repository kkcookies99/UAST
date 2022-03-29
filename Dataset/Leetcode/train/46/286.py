class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(output, path_d):
            if len(path_d)==len(nums):
                output.append(copy.deepcopy(path_d))
                return 
            else:
                for i in range(len(nums)):
                    if nums[i] not in path_d:
                        path_d.append(nums[i])
                        dfs(output, path_d)
                        path_d.pop()
        path, output = list(), list()
        dfs(output, path)
        return output

