class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        a_lens,b_lens = len(a), len(b)
        if a_lens > b_lens:
            b = '0'*(a_lens-b_lens) + b
        else:
            a = '0'*(b_lens-a_lens) + a
        res = ''
        tmp = 0
        for i in range(len(a)-1,-1,-1):
            a_num = int(a[i]) 
            b_num = int(b[i])
            tmp += a_num + b_num
            if tmp < 2:
                tmp_res = tmp
                tmp = 0
            else:
                tmp_res = tmp%2
                tmp = 1
            res = res + str(tmp_res)
        res += str(tmp)
        if res[-1] == '0':
            res = res[:-1]
        return res[::-1]

