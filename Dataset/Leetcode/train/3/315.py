 class Solution:
    def XXX(self, s: str) -> int:
        window = []
        N = 0
        for i in s:
            if i not in window:
                window.append(i)
            else:
                while window[0] != i:
                    window.pop(0)
                window.append(i)
                window.pop(0)
            if len(window) > N:
                N = len(window)
        return N

