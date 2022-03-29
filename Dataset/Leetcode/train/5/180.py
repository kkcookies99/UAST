 class Solution:
    def XXX(self, s: str) -> str:
        for length in range(len(s),1,-1):
            for start in range(len(s)-length+1):
                if s[start:start+length][::-1]==s[start:start+length]:
                    return s[start:start+length]
        return s[0]

