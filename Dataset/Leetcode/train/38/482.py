 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            return "1"
        read = self.XXX(n - 1)
        ret = ""
        i = 0
        while i < len(read):
            j = i + 1
            while j < len(read) and read[j] == read[j - 1]:
                j += 1
            ret += str(j - i) + read[i]
            i = j
        return ret

