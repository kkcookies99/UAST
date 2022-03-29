 class Solution:
    def XXX(self, a: str, b: str) -> str:
        '''
        先将a和b进行相加并翻转
        设置进位变量c，用于记录进位值
        '''
        a_1 = int(a)
        b_1 = int(b)
        s = str(a_1 + b_1)
        s = "".join(list(reversed(s)))
        #进位数
        count = 0
        result = [""]
        for i,j in enumerate(s):
            c = int(j) + count
            if c==2:
                result += '0'
                count = 1
            elif c == 3:
                result += '1'
                count = 1
            else:
                result += str(c)
                count = 0
        if count == 1:
            result += str(count)
        result.reverse()
        result = "".join(result[:(len(result)-1)])
        print(result)
        return result

