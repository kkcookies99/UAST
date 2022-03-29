 class Solution:
    def XXX(self, strs: List[str]) -> str:
        maxStr, minStr = max(strs, default=""), min(strs, default="")
        for i in range(len(minStr)):
            if maxStr[i] != minStr[i]:
                return minStr[:i]
        return minStr

