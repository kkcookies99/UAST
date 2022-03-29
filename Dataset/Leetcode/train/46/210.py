class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        length = len(nums)
        def dfs(nums,length):
            if len(path) == length:
                results.append(list(path))
                return
            else:
                for i in range(0,len(nums)):
                    temp = nums[i]
                    path.append(nums[i])
                    nums.pop(i)
                    dfs(nums,length)
                    nums.insert(i,temp)
                    path.pop()
        results = []
        path = []
        dfs(nums,length)
        return results

