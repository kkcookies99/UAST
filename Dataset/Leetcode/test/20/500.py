 class Solution:
    def XXX(self, s: str) -> bool:
        n = len(s)
        for i in range(n//2):
            s = s.replace("()","").replace("[]","").replace("{}","")
        if len(s) != 0: return False
        return True

