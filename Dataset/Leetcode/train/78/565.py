 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        self.results = set()
        self.nums = nums
        self.dfs('')
        return [[nums[index] for index, num in enumerate(result) if num == '1'] for result in self.results]
        
        
    def dfs(self, s):
        if len(s) == len(self.nums):
            self.results.add(s)
        else:
            self.dfs(s + '0')
            self.dfs(s + '1')

