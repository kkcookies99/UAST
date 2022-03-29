 class Solution:
    def XXX(self, haystack, needle):
        if not needle:
            return 0
        left = 0 
        right = len(needle)
        while right <= len(haystack):
            if haystack[left:right] == needle:
                return left
            left += 1
            right += 1
        return -1

