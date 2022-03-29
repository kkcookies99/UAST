class Solution:
	def XXX(self, nums) -> int:
		ans = nums[0]
		l = len(nums)
		i = 0
		while i < l:
			ans = max(ans,nums[i])
			if nums[i] > 0:
				s = nums[i]
				a = b = i
				while a > 0:
					a -= 1
					if s + nums[a] >= 0:
						s += nums[a]
						ans = max(ans,s)
					else:
						break
				s = max(nums[i],s)
				while b < l-1:
					b += 1
					if s + nums[b] >= 0:
						s += nums[b]
						ans = max(ans,s)
						i = b
					else:
						break
			i += 1
		return ans


