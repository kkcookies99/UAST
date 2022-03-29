 class Solution:
    def XXX(self, n: int) -> str:
        if n == 1:
            str_pre = '1'
            return str_pre
        if n == 2:
            str_pre = '11'
            return str_pre
        if n == 3:
            str_pre = '21'
            return str_pre
        
        str_pre = self.XXX(n-1)
        nums = 1
        str2 = ''
        m = len(str_pre)
        i = 0
        while i < m -1:
            NN = 1
            while NN :
                if str_pre[i] == str_pre[i+1]:
                    nums += 1
                    i += 1
                    if i > m -2:
                        NN = 0
                else:
                    NN = 0
            if i == m -1:
                break
            str2 = str2 + str(nums) + str_pre[i]
            nums = 1
            i += 1
        if i == m - 1 and str_pre[i] == str_pre[i-1]:
                str2 = str2 + str(nums) + str_pre[m-1]
        if i == m - 1 and str_pre[i] != str_pre[i-1]:
                str2 = str2 + '1' + str_pre[m-1]
                i += 1
        return str2

