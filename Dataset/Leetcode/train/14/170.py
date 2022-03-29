 class Solution:
    def XXX(self, strs) :
        if not strs: return ''
        prefix = strs[0]
        for i in range(1,len(strs)):
            for j in range(min(len(prefix),len(strs[i]))):
                if prefix[j] != strs[i][j]:
                    prefix = prefix[:j]
                if len(prefix)>len(strs[i]):
                    prefix = prefix[:len(strs[i])]
                if not prefix: return ''
        return prefix
       
code block

