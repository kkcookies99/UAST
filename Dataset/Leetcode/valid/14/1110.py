 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if strs == []:
            return ''
        lst1 = []
        lst2 = []
        lst3 = []
        n = 0
        for i in strs:
            lst1.append(len(i))
        m = min(lst1)
        if m == 0:
            return ''
        while n < m:
            for i in strs:
                lst2.append(i[n])
            if len(set(lst2)) == 1:
                lst3.append(lst2[0])  
                lst2.clear()
                n += 1
            else:
                break
        return ''.join(lst3)

