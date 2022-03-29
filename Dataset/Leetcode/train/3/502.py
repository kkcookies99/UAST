 class Solution:
    def XXX(self, s: str) -> int:
        if not s:
            return 0
        max_length = 1
        p1, p2 = 0, 1
        queue = [s[0]]
        while p2 < len(s):
            if s[p2] in queue:
                while s[p1] != s[p2]:
                    p1 += 1
                    queue.pop(0)
                p1 += 1
                queue.pop(0)
            queue.append(s[p2])
            if p2 - p1 + 1 > max_length:
                max_length = p2 - p1 + 1
            p2 += 1
        return max_length

