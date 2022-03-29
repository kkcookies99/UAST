 class Solution(object):
    def XXX(self, strs):
        if len(strs) == 0:
            return ''
        item = strs[0]
        rst = []
        for k in range(0, len(item)):
            z = 1
            for j in range(1, len(strs)):
                if k >= len(strs[j]):
                    break
                if strs[j][k] != item[k]:
                    break
                z += 1
            if z == len(strs):
                rst.append(item[k])
            if len(rst) != k+1:
                break
        return ''.join(rst)

