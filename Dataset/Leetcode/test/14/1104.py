 class Solution:
    def XXX(self, strs: List[str]) -> str: 
        if strs == []: return ''
        com = ''
        for i in zip(*strs):
            if len(set(i)) == 1:
                com += i[0]
            else:
                return com
        return com

