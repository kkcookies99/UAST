class Solution:
    def XXX(self, s: str) -> int:
        words = s.split(' ')
        for word in words[::-1]:
            if len(word):
                return len(word)

