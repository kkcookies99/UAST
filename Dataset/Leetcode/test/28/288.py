     class Solution:
        def XXX(self, haystack: str, needle: str) -> int:
            def get_next():
                nxt[0], i, j = -1, 0, -1
                while i<len(needle):
                    if j==-1 or needle[i]==needle[j]:
                        i += 1
                        j += 1
                        nxt[i] = j
                    else:
                        j = nxt[j]
            
            def kmp():
                j = 0
                for i in range(len(haystack)):
                    while j!=-1 and haystack[i]!=needle[j]:
                        j = nxt[j]
                    if j==-1 or haystack[i]==needle[j]:
                        j += 1
                    if j==len(needle):
                        return i-j+1
                return -1
            if needle=='':
                return 0
            nxt = [0 for i in range(len(needle)+1)]
            get_next()
            return kmp()

