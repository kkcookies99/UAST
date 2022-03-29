 class Solution:
    def XXX(self, n: int) -> List[str]:
        resset = {'()'}
        while n != 1:
            newset = set()
            for i in resset:
                for j in range(len(i)):
                    newset.add(i[:j]+'()'+i[j:])
            resset = newset 
            n -= 1  
        return list(resset)

