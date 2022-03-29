class Solution(object):
    def XXX(self, n):
        ret = '1'
        for i in range(2,n+1):
            bei = []
            zcc = ''
            for j in ret:
                if bei == []:
                    bei = [1,j]
                else:
                    if j == bei[1]:
                        bei[0] += 1
                        continue
                    else:
                        zcc += str(bei[0]) + str(bei[1])
                        bei = [1,j]
            zcc += str(bei[0]) + str(bei[1])
            ret = zcc
        return ret

