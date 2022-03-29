class Solution:
    def XXX(self, s: str) -> int:
        blank_count = 0
        start = 0
        for index in range(len(s)):
            if s[index] != " ":
                if blank_count == 0:
                    continue
                else:
                    blank_count = 0
                    start = index
            else:
                blank_count += 1
        return len(s) - blank_count - start


