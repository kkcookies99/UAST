class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
            return
        res = []
        n = len(nums)
        visited = [0] * n
        def helper1(temp_list,length):
            if length == n:
                res.append(temp_list)
            for i in range(n):
                if visited[i] :
                    continue
                visited[i] = 1
                helper1(temp_list+[nums[i]],length+1)
                visited[i] = 0
        def helper2(nums,temp_list,length):
            if length == n:
                res.append(temp_list)
            for i in range(len(nums)):
                helper2(nums[:i]+nums[i+1:],temp_list+[nums[i]],length+1)
        helper1([],0)
        return res

