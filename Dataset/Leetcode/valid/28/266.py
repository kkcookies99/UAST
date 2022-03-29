 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0

        for i in range(len(haystack)):
            if i > (len(haystack) - len(needle)):   # 长度不够了
                return -1

            for j in range(len(needle)):
                if haystack[i+j] != needle[j]:
                    break
            else:
                return i

        return -1   # 未找到

