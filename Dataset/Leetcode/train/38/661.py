 class Solution(object):
    def XXX(self, n):

        res = '1'
        while n-1:
            count = 1
            cur = res[0]
            temp = ''
            for i in range(1,len(res)):
                if res[i] == res[i-1]:
                    count += 1
                else:
                    temp += str(count)+cur
                    cur = res[i]
                    count = 1
            temp += str(count)+cur
            res = temp
            n -= 1

        return res

