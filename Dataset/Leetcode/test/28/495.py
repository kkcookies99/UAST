 class Solution:
    def XXX(self, haystack, needle):
        if needle not in haystack: return -1
        elif needle == "": return 0
        else:
            li = haystack.split(needle)
            return len(li[0])

