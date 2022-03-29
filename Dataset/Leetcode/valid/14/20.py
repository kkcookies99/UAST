 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if not strs: return ""
        s1 = min(strs)
        s2 = max(strs)
        
        for index, val in enumerate(s1):
            if val != s2[index]:
                return s2[:index]
        return s1

