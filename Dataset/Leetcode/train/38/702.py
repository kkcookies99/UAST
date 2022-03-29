 class Solution:
    def str2str(self, s: str) -> str:
        string = ''

        c = s[0]
        item = [c]
        for idx in range(1, len(s)):
            if s[idx] == c:
                item.append(idx)
            else:
                string += str(len(item)) + c
                item = [s[idx]]
                c = s[idx]

        string += str(len(item)) + c
        return string
        
    def XXX(self, n: int) -> str:
        cur = '1'
        for _ in range(1, n):
            cur = self.str2str(cur)

        return cur

