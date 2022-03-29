 class Solution:
    def XXX(self, num: int) -> str:
        d = {1:'I', 4:'IV', 5:'V', 9:'IX', 10:'X', 40:'XL', 50:'L', 90:'XC', 100:'C', 400:'CD', 500:'D', 900:'CM', 1000:'M'}

        s = str(num)
        n = len(s)

        nums_s = [] # 将数字分离成每个位数上的数字，如1994->[1000, 900, 90, 4]
        for i in range(0, n): 
            weishu = int('1' + '0'*(n-1))
            if int(s[i]) > 5 and int(s[i]) < 9:
                a = 5 * weishu
                res = (int(s[i]) - 5) * weishu
                nums_s.append(a)
                nums_s.append(res)
            else:
                cur = s[i] + '0'*(n-1)
                nums_s.append(int(cur))
            n -= 1

        ss =''

        for j in nums_s:
            b = str(j)
            if j in d:
                ss += d[j]
            else:
                repit = int(b[0])  # 重复的次数
                roman = int('1' + (len(b) - 1) * '0')  # 剩下的位数
                ss += repit * d[roman]
        return ss
        

