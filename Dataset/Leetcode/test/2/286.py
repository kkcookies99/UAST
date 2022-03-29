class Solution():
    def XXX(self,l1,l2):
        a_1 = 0
        b_1 = 0
        for j in range(len(l1) - 1, -1, -1):
            a_1 += l1[j] * 10 ** j
        for k in range(len(l2) - 1, -1, -1):
            b_1 += l2[k] * 10 ** k
        c = str(a_1 + b_1)
        export = []
        for l in range(len(c) - 1, -1, -1):
            export.append(int(c[l]))
        return export

