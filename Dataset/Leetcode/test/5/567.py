 class Solution(object):
	def XXX(self, s):
		"""
        :type s: str
        :rtype: str
        """

		for i in range(len(s), 0, -1):
			for y in range(0,len(s) - i + 1):
				s1 = s[y:i + y]
				if s1 == s1[::-1]:
					return s[y:i + y]
		else:
			return s[0]


