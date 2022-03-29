 class Solution:
    def XXX(self, n: int) -> List[str]:
        ret = []
        bei = ['']
        for i in range(n):
            a = len(bei)
            for item in range(a):
                for j in range(len(bei[item])):
                    bei.append(bei[item][:j] + '()'+bei[item][j:])
                bei.append(bei[item] + "()")
            bei = bei[a:]
        for z in bei:
            if z not in ret:
                ret.append(z)
        return ret

