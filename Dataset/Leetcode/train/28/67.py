 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle : return 0
        n1 = len(haystack)
        n2 = len(needle)
        if n1 < n2:return -1
        def helper(i):
            haystack_p = i
            needle_q = 0
            while needle_q < n2:
                if haystack[haystack_p] !=  needle[needle_q]:
                    return False
                else:
                    haystack_p += 1
                    needle_q += 1
            return True
        for i in range(n1 - n2 + 1):
            if helper(i):
                return i
        return -1

