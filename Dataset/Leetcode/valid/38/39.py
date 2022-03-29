class Solution:
    def XXX(self, n: int) -> str:
        m = 0
        say = '1'
        while m != n:
            temp = ''
            pos = -1
            if m == 0:
                temp = '1'
            else:
                for i in range(len(say)):
                    if i-1>=0 and say[i] == say[i-1]:
                        tmp = temp[pos-1:]
                        temp = temp[:pos-1] + str(int(tmp) + 10)
                    else:
                        temp = temp + '1' + say[i]
                        pos = pos+2
            say = temp
            m = m+1
        return say

