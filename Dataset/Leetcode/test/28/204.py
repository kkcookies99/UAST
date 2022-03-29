 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        if not haystack:
            return -1
        
        next_array = self.getNext(needle)
        i, j = 0, 0
        while i < len(haystack) and j < len(needle):
            if j == -1 or haystack[i] == needle[j]:
                i += 1
                j += 1
            else:
                j = next_array[j]
        if j == len(needle):
            return i - j
        else:
            return -1
    
    def getNext(self, pattern):
        n = len(pattern)
        next_array = [0] * n
        next_array[0] = -1
        k = -1
        j = 0
        while j < n-1:
            if k == -1 or pattern[k] == pattern[j]:
                k += 1
                j += 1
                if pattern[k] == pattern[j]:
                    next_array[j] = next_array[k]
                else:
                    next_array[j] = k
            else:
                k = next_array[k]
        return next_array
        

