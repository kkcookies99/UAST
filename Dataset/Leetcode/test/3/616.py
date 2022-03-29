 class Solution:
	def XXX(self, s: str) -> int:
		max = 0
		start_num = 0
		map = {}
		for i in range(len(s)):
			if s[i] in map:
				if start_num <= map[s[i]]:
					start_num = map[s[i]] + 1
			map[s[i]] = i
			if i-start_num+1>max:
				max = i-start_num+1
		return max

