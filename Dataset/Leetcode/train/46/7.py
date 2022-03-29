class Solution(object):
    def XXXUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if not nums:
			return []
		nums.sort()
		n = len(nums)
		visited = [0] * n
		res = []

		def helper1(temp_list, length):
			# if length == n and temp_list not in res:
			# 	res.append(temp_list)
			if length == n:
				res.append(temp_list)
			for i in range(n):
				if visited[i] or (i > 0 and nums[i] == nums[i - 1] and not visited[i - 1]):
					continue
				visited[i] = 1
				helper1(temp_list + [nums[i]], length + 1)
				visited[i] = 0

		def helper2(nums, temp_list, length):
			if length == n and temp_list not in res:
				res.append(temp_list)
			for i in range(len(nums)):
				helper2(nums[:i] + nums[i + 1:], temp_list + [nums[i]], length + 1)

		helper1([],0)
		# helper2(nums, [], 0)
		return res

