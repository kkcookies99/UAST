 class Solution:
    def XXX(self, n):
        if n == 1:
            return ["()"]
        lst = ['()']
        HashMap = {1: ['()']}

        def comb(n0):
            new = []
            for i in range(1, n0 + 1):
                for k in HashMap[n0+1-i]:
                    for l in HashMap[i]:
                        new.append(l + k)
            for i in HashMap[n0]:
                new.append('('+i+')')
            return list(set(new))

        for i in range(1, n):
            lst = comb(i)
            HashMap[i+1] = lst

        return lst

