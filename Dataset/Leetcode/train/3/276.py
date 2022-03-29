class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        start = maxLength = 0
        usedChar = {}
        for index, char in enumerate(s):
            if char in usedChar and start <= usedChar[char]:
                start = usedChar[char] + 1
            else:
                maxLength = max(maxLength, index - start + 1)
            usedChar[char] = index
        return maxLength




