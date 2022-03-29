class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def dfs(results,result,candidates):
            if len(result) == len(candidates):
                results.append(list(result))
            else:
                for i in candidates:
                    if i not in result:
                        result.append(i)
                        dfs(results,result,candidates)
                        result.pop()
        
        results = []
        dfs(results,[],nums)
        return results

