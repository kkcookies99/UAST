 class Solution:
    def XXX(self, haystack, needle):
        if needle == "":
            return 0
        n_len = len(needle)
        h_len = len(haystack)
        if h_len < n_len or not haystack:
            return -1
        
        for i in range(h_len):
            if i + n_len <= h_len:
                if haystack[i:i+n_len] == needle:
                    return i
                if i + n_len == h_len:
                    return -1

