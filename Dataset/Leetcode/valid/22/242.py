 class Solution:
    def XXX(self, n: int) -> List[str]:
        dic = {0:set([""])}
        for length in range(1,n+1):
            dic[length] =set()
            for l1 in range(1,length):
                l2 = length-l1
                for left in dic[l1]:
                    for right in dic[l2]:
                        dic[length].add(left+right)
            for one in dic[length-1]:
                dic[length].add('('+one+')')
        return list(dic[n])

