 class Solution:
    def XXX(self, s: str) -> str:
        if len(s) < 2:
            return s
        beststart = bestend = 0
        for i in range(len(s)):
            start = end = i
            while start - 1 >= 0 and end + 1 <= len(s) - 1:
                if s[start - 1] == s[end + 1]:
                    start -= 1
                    end += 1
                else:
                    break
            if end - start > bestend - beststart:
                beststart = start
                bestend = end
        for i in range(len(s) - 1):
            start = i
            end = i + 1
            if s[start] == s[end]:
                while start - 1 >= 0 and end + 1 <= len(s) - 1:
                    if s[start - 1] == s[end + 1]:
                        start -= 1
                        end += 1
                    else:
                        break
                if end - start > bestend - beststart:
                    beststart = start
                    bestend = end
        return s[beststart:bestend + 1]

