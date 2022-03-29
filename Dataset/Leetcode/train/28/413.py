 class Solution:
    @classmethod
    def XXX(self, haystack, needle) -> int:
        if needle == '':
            return 0
        else:
            x,y = len(haystack),len(needle)
            for i in range(x):
                if haystack[i:y+i] == needle:
                    return i
            return -1

