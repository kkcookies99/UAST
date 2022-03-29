 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle: return 0
        def get_next_group(one_str):
            next_group=[0]*len(one_str)
            next_group[0]=-1
            point=-1
            i=0
            while i<len(one_str)-1:
                if point==-1 or one_str[i]==one_str[point]:
                    point+=1
                    i+=1
                    next_group[i]=point
                else:
                    point=next_group[point]
            return next_group
        next1 = get_next_group(needle)
        m, j, res = len(haystack), 0, 0
        for i in range(m):
            while j > 0 and haystack[i] != needle[j]:
                j = next1[j]
            if haystack[i] == needle[j]:
                j += 1
            if j == len(needle):
                res=i-len(needle)+1
                return res
                break
        return -1

