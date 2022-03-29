 class Solution:
    def XXX(self, s: str) -> int:
        if not s:
            return 0
        maxNum = 1
        lenSub = 1
        left, right = 0, 1
        while right < len(s):
            if s[right] in s[left : right]:
                for i, char in enumerate(s[left:right]):
                    if char == s[right]:
                        left += i + 1
                        lenSub = len(s[left:right+1])
                        break
            else:
                lenSub += 1
            maxNum = max(lenSub, maxNum)
            right += 1
        
        return maxNum

